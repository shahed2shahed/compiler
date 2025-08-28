package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SelfClosingTag extends HtmlDeclare{

    List<Types> content ;

    public SelfClosingTag() {

        this.content = new ArrayList<>();
    }

    public List<Types> getContent() {
        return content;
    }

    public void setContent(List<Types> content) {
        this.content = content;
    }

    public void addTypes(Types node) {
        this.content.add(node);
    }

//    @Override
//    public String generate() {
//        StringBuilder sb = new StringBuilder();
//        if (content != null && !content.isEmpty()) {
//            sb.append("<");
//            for (Types child : content) {
//                System.out.println("xxxxxx"+child.toString());
//
//                if (child.toString().equals("ngModel")) {
//                    sb.append(child.generateHTML(content));
//                }
//                else {
//                    sb.append(child.generate());
//                }
//                sb.append(" ");
//            }
//        }
//        sb.append("/>");
//        return sb.toString();
//    }
@Override
public String generate() {
    StringBuilder sb = new StringBuilder();

    if (content == null || content.isEmpty()) {
        return "";
    }

    // 🔎 أول شي نفحص إذا التاغ فيه ngModel
    boolean hasNgModel = content.stream()
            .anyMatch(child -> "ngModel".equalsIgnoreCase(child.toString()));

    boolean hasChangeModel = content.stream()
            .anyMatch(child -> "change".equalsIgnoreCase(child.toString()));

    if (hasNgModel || hasChangeModel) {
        System.out.println("[DEBUG] ngModel detected -> delegating to generateHTML()");
        sb.append(generateHTML());
        return sb.toString();   // 👈 نستخدم generateHTML الخاص بمعالجة ngModel
    }

    // 👇 الحالة العادية: توليد عادي
    sb.append("<");
    for (Types child : content) {
        System.out.println("[DEBUG] Normal token -> " + child.toString());
        sb.append(child.generate()).append(" ");
    }
    sb.append("/>");
    return sb.toString();
}

    @Override
    public String generateHTML() {
        StringBuilder sb = new StringBuilder();

        if (content == null || content.isEmpty()) return "";

        String tagName = content.get(0).generate().trim();
        sb.append("<").append(tagName);

        Set<String> booleanAttributes = Set.of("required", "disabled", "checked", "readonly", "autofocus");

        String currentName = null;
        boolean haveEquals = false;
        String currentValue = null;
        boolean addedFileId = false;
        boolean addedAccept = false;

        for (int i = 1; i < content.size(); i++) {
            String part = content.get(i).generate().trim();
            if (part.isEmpty()) continue;

            // تجاهل [(ngModel)]
            if ("[".equals(part) && i + 4 < content.size() &&
                    "(".equals(content.get(i + 1).generate().trim()) &&
                    "ngModel".equalsIgnoreCase(content.get(i + 2).generate().trim()) &&
                    ")".equals(content.get(i + 3).generate().trim()) &&
                    "]".equals(content.get(i + 4).generate().trim())) {

                i += 4;
                if (i + 2 < content.size() && "=".equals(content.get(i + 1).generate().trim())) {
                    i += 2;
                }
                currentName = null;
                haveEquals = false;
                currentValue = null;
                continue;
            }

            if (part.startsWith("(")) {
                while (i < content.size()) {
                    String t = content.get(i).generate().trim();
                    if (t.endsWith("\"") || t.endsWith("'")) {
                        i++;
                        break;
                    }
                    i++;
                }
                currentName = null;
                haveEquals = false;
                currentValue = null;
                continue;
            }

            // علامة =
            if ("=".equals(part)) {
                haveEquals = true;
                continue;
            }

            // attribute name
            if (currentName == null && !haveEquals) {
                currentName = part;
                if ("name".equals(currentName)) currentName = "id";

                if (booleanAttributes.contains(currentName.toLowerCase())) {
                    sb.append(" ").append(currentName);
                    currentName = null;
                }

                continue;
            }

            // attribute value
            if (haveEquals && (part.startsWith("\"") || part.startsWith("'"))) {
                currentValue = stripOuterQuotes(part);

                if(currentName != null) {
                    sb.append(" ").append(currentName).append("=\"").append(currentValue).append("\"");

                    if ("type".equalsIgnoreCase(currentName) && "file".equalsIgnoreCase(currentValue)) {
                        addedFileId = true;
                    }
                    if ("accept".equalsIgnoreCase(currentName)) {
                        addedAccept = true;
                    }
                }

                currentName = null;
                haveEquals = false;
                currentValue = null;
            }
        }

        if ("input".equalsIgnoreCase(tagName) && addedFileId) {
            sb.append(" id=\"imageInput\"");
            if (!addedAccept) {
                sb.append(" accept=\"image/*\"");
            }
        }

        sb.append(" />");
        return sb.toString();
    }






    @Override
    public String generateJSS() {
        StringBuilder sb = new StringBuilder();

        if (content != null && !content.isEmpty()) {
            sb.append("<img");  // نطبع التاغ مرة وحدة

            String currentName = null;      // اسم الـ attribute (src / alt / ...)
            boolean bracketBinding = false; // هل الاسم ضمن [] مثل [src]
            boolean haveEquals = false;     // شفنا علامة =
            String currentValue = null;     // القيمة بين "" أو ''

            for (Types child : content) {
                String part = child.generate().trim();
                if (part.isEmpty()) continue;

                // تجاهل تكرار اسم التاغ
                if ("img".equalsIgnoreCase(part)) continue;

                // تجميع حالة [ ... ]
                if ("[".equals(part)) { bracketBinding = true; continue; }
                if ("]".equals(part)) { /* نهاية الاسم المربوط */ continue; }

                // علامة =
                if ("=".equals(part)) { haveEquals = true; continue; }

                // إذا ما عرّفنا اسم بعد، فهذا اسم الـ attribute
                if (currentName == null && !haveEquals) {
                    currentName = part;      // مثال: src أو alt
                    continue;
                }

                // إذا وصلنا لقيمة (عادة تيجي كتوكين واحد فيه "" أو '')
                if (haveEquals && (part.startsWith("\"") || part.startsWith("'"))) {
                    currentValue = stripOuterQuotes(part); // شيل "" أو ''

                    // حوّل القيم حسب النوع
                    String htmlAttr;

                    if (bracketBinding) {
                        // [src] = "p.image || 'assets/no-image.png'"
                        htmlAttr = " " + currentName + "=\"${" + currentValue + "}\"";
                    } else if (isMustache(currentValue)) {
                        // alt = "{{ p.name }}"
                        String expr = unwrapMustache(currentValue).trim();
                        htmlAttr = " " + currentName + "=\"${" + expr + "}\"";
                    } else {
                        // حالة عادية بدون ربط
                        htmlAttr = " " + currentName + "=\"" + currentValue + "\"";
                    }

                    sb.append(htmlAttr);

                    // صفّر الحالة للـ attribute التالي
                    currentName = null;
                    bracketBinding = false;
                    haveEquals = false;
                    currentValue = null;
                    continue;
                }

                // أي أجزاء غير متوقعة نتجاهلها (لتفادي تسريب رموز مثل {{ ... }} كتوكن منفصل)
            }

            sb.append(">");
        }

        return sb.toString();
    }

    // Helpers
    public static String stripOuterQuotes(String s) {
        if (s.length() >= 2) {
            char a = s.charAt(0), b = s.charAt(s.length() - 1);
            if ((a == '"' && b == '"') || (a == '\'' && b == '\'')) {
                return s.substring(1, s.length() - 1);
            }
        }
        return s;
    }

    private static boolean isMustache(String s) {
        // بعد نزع علامات الاقتباس
        String t = s.trim();
        return t.startsWith("{{") && t.endsWith("}}");
    }

    private static String unwarp(String s) { return stripOuterQuotes(s); } // إن احتجتها لاحقاً

    private static String unwrapMustache(String s) {
        String t = s.trim();
        if (t.startsWith("{{") && t.endsWith("}}")) {
            return t.substring(2, t.length() - 2);
        }
        return t;
    }









//    @Override
//    public String generateJS(String tagVar) {
//        if (content == null || content.isEmpty()) return "";
//
//        String tagName = content.get(0).toString().trim(); // أول عنصر هو اسم التاغ
//        String varName = "elem";
//        StringBuilder sb = new StringBuilder();
//
//        // إنشاء العنصر
//        sb.append("const ").append(varName).append(" = document.createElement('")
//                .append(tagName).append("');\n");
//
//        // معالجة بقية الـ content كـ Attributes
//        StringBuilder rawLineBuilder = new StringBuilder();
//        for (int i = 1; i < content.size(); i++) {
//            rawLineBuilder.append(content.get(i).toString().trim());
//            rawLineBuilder.append(" ");
//        }
//        String rawLine = rawLineBuilder.toString().trim();
//        System.out.println("[DEBUG] Raw attribute line: " + rawLine);
//
//        // Regex لالتقاط attributes من الشكل: [src]="product.image" أو alt="{{ product.name }}"
//        Pattern pattern = Pattern.compile("(\\[[^\\]]+\\]|\\w+)\\s*=\\s*\"([^\"]+)\"");
//        Matcher matcher = pattern.matcher(rawLine);
//
//        while (matcher.find()) {
//            String attrName = matcher.group(1).trim();
//            String attrValue = matcher.group(2).trim();
//
//            // التعامل مع [src] إلى src
//            if (attrName.startsWith("[") && attrName.endsWith("]")) {
//                    attrName = attrName.substring(1, attrName.length() - 1).trim();
//            }
//
//            // التعامل مع {{ ... }} داخل alt
//            if (attrValue.startsWith("{{") && attrValue.endsWith("}}")) {
//                attrValue = attrValue.substring(2, attrValue.length() - 2).trim();
//            }
//
//            System.out.println("[DEBUG] Processed attribute: " + attrName + " = " + attrValue);
//
//            sb.append(varName).append(".").append(attrName).append(" = ").append(attrValue).append(";\n");
//        }
//
//        // إضافة العنصر إلى div
//        sb.append(tagVar+".appendChild(").append(varName).append(");\n");
//
//        System.out.println("[DEBUG] Finished element generation: " + varName);
//        return sb.toString();
//    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        for (Types item : content) {
            sb.append(item.toString()).append(" ");
        }
        sb.append("/>");
        return sb.toString().trim();
    }

}
