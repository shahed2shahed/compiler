package AST;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

import static AST.NormalfunctionDecl.getLastGeneratedId;
import static AST.OpenTag.getLastGenerated;

public class SelfClosingTag extends HtmlDeclare{

    List<Types> content ;
    static String  ngModel;

    StringBuilder l = new StringBuilder();

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
    public String generateJS() {
        StringBuilder sb = new StringBuilder();
        if (content == null || content.isEmpty()) return "";

        String tagName = content.get(0).generate().trim();

        boolean changeAttached = false;

        for (var child : content) {
            System.out.println(child.getClass().getSimpleName());
            if (child.generate().equals("change") && !changeAttached) {
                String var = tagName + i++;
                sb.append("const " + var).
                        append(" = document.getElementById('").
                        append("imageInput").append("');");
                sb.append("\n");

                sb.append(var).append(".addEventListener(\"change\", (event) => {\n").
                        append(getLastGeneratedId()+"\n").
                        append("});\n");

                changeAttached = true;
            }

            if (child.generate().equals("ngModel")) {
                for (int j = 0; j < content.size(); j++) {
                    String token = content.get(j).generate().trim();
                    if (token.equals("name")) {
                        if (j + 2 < content.size()) {
                            String value = content.get(j + 2).generate().trim();
                            value = value.replace("\"", "");

                            if (value != null && !value.isEmpty()) {
                                System.out.println("Adding ngModel for: " + value);
                                if (value.equals("name")) {
                                    ngModel = l.append("const ").append(value).append(i++).append(" = ")
                                            .append("document.getElementById('")
                                            .append(value).append("').value.trim();\n").toString();
                                } else {
                                    ngModel = l.append("const ").append(value).append(i++).append(" = ")
                                            .append("document.getElementById('")
                                            .append(value).append("').value;\n").toString();
                                }
                            } else {
                                System.out.println("Skipped null or empty value");
                            }

                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String getLast() {
        return ngModel;
    }

    @Override
    public String generateJSS() {
        StringBuilder sb = new StringBuilder();

        if (content != null && !content.isEmpty()) {
            sb.append("<img");

            String currentName = null;
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
