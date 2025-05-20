lexer grammar MyLexer;

IMPORT      : 'import';
FROM        : 'from';
LET         : 'let';
VAR         : 'var';
CONST       : 'const';
OF          : 'of';
FUNCTION    : 'function';

COMPONENT   : '@Component';
SELECTOR    : 'selector';
STANDALONE  : 'standalone';
IMPORTS     : 'imports';
TEMPLATE    : 'template';
EXPORT      : 'export';
CLASS       : 'class';
CATCH       : 'catch';
CONSOLE     : 'console';
ERROR       : 'error';
LOG         : 'log';
ANY         : 'any';
NUMBER      : 'number';
STRING_EX   : 'string';
VOID        : 'void';
NULL        : 'null';


DIRECTIVES  : '*ngIf' | '*ngFor';

BIT_OR              : '|';
AND                 : '&&';
OR                  : '||';
NOT                 : '!';
EQUAL_EQUAL         : '==';
NOT_EQUAL           : '!=';
LT_EQUAL            : '<=';
GT_EQUAL            : '>=';

SQUARE_OPEN_BRACKET : '[';
SQUARE_CLOSE_BRACKET: ']';
OPEN_BRACKET        : '(';
CLOSE_BRACKET       : ')';
CURLY_OPEN_BRACKET  : '{';
CURLY_CLOSE_BRACKET : '}';
ARROW               : '=>';
LT                  : '<';
GT                  : '>';
SLASH               : '/';   // still used elsewhere, kept as is
QUOT                : '`';

STRING: 
      ('"' (~["\r\n] | '\\"')* '"') 
    | ('\'' (~['\r\n] | '\\"')* '\'');

NUMBER_VAL: 
    [0-9]+ ( '.' [0-9]+ )? 
    | MIN [0-9]+ ( '.' [0-9]+ )?;

BOOLEAN: 'true' | 'false';

SEMI_COLON   : ';';
COMMA        : ',';
COLON        : ':';
DOT          : '.';
QUESTION_MARK: '?';
HASH_TAG     : '#';
EQUAL        : '=';
PLUS         : '+';
MIN          : '-';
MULT         : '*';
DIV          : '/';

S_DOlOR      : '$';

WS: [ \t\r\n]+ -> skip;
NEWLINE: '\r'? '\n' | '\r';

MultiLineComment : '/*' .*? '*/' -> channel(HIDDEN);
SingleLineComment: '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9-_]*;
