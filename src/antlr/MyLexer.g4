
lexer grammar MyLexer;


IMPORT      : 'import';
CLICK       :  'click' -> pushMode(EVENTBINDING);
FROM        : 'from';
LET         : 'let';
VAR         : 'var';
CONST       : 'const';
OF          : 'of';
ARRAY : 'Array';
FUNCTION    : 'function';
IMPLEMENTS : 'implements';
IF : 'if';
ELSE : 'else';
RETURN : 'return';
AS : 'as';
AT : '@';

COMPONENT   : '@Component';
SELECTOR    : 'selector';
STANDALONE  : 'standalone';
IMPORTS     : 'imports';
TEMPLATE    : 'template';
EXPORT      : 'export';
EXPORTS      : 'exports';
INTERFACE   : 'interface';
NGMODULE : '@NgModule';
INJECTABLE : '@Injectable' ;

CLASS       : 'class';
TRY     : 'try';
CATCH       : 'catch';
CONSOLE     : 'console';
ERROR       : 'error';
LOG         : 'log';
ANY         : 'any';
NUMBER      : 'number';
STRING_EX   : 'string';
VOID        : 'void';
NULL        : 'null';
TOSTRING : 'toISOString';

NgFor  : '*ngFor' -> pushMode(NgForDI);
NgIf  : '*ngIf' -> pushMode(NgIfDI);


BIT_OR              : '|';
AND                 : '&&';
OR                  : '||';
NOT                 : '!';
EQUAL_EQUAL         : '==';
EQUALTHIRD        : '===';
NOT_EQUAL           : '!=';
NOT_EQUAL_EQUAL          : '!==';
LT_EQUAL            : '<=';
GT_EQUAL            : '>=';

SQUARE_OPEN_BRACKET : '[';
SQUARE_CLOSE_BRACKET: ']';
OPEN_BRACKET        : '(' ;
CLOSE_BRACKET       : ')';
CURLY_OPEN_BRACKET  : '{';
CURLY_CLOSE_BRACKET : '}';
ARROW               : '=>';
LT                  : '<';
GT                  : '>';
SLASH               : '/';
DQUOT                : '"';
QUOT                : '`';

STRING:
      ('"' (~["\r\n] | '\\"')* '"')
    | ('\'' (~['\r\n] | '\\"')* '\'');

NUMBER_VAL:
    [0-9]+ ( '.' [0-9]+ )?
    | MIN [0-9]+ ( '.' [0-9]+ )?;

BOOLEAN: 'true' | 'false';
AccessModifiers : 'private';

BEHAVIORSUBJECT : 'BehaviorSubject';

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

S_DOlOR      : '$';

WS: [ \t\r\n]+ -> skip;
NEWLINE: '\r'? '\n' | '\r';

MultiLineComment : '/*' .*? '*/' -> channel(HIDDEN);
SingleLineComment: '//' ~[\r\n\u2028\u2029]* -> channel(HIDDEN);

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9-_]*;

mode NgForDI;
WS1: [ \t\r\n]+ -> skip;
EQUAL1:'=';
DQUOT1:'"' ;
LET1:'let';
OF1 :'of';
ID1: IDENTIFIER;
DQUOT2:DQUOT1' '*->popMode;

mode NgIfDI;
WS2: [ \t\r\n]+ -> skip;
NUMBER_VAL1:
    [0-9]+ ( '.' [0-9]+ )?
    | MIN [0-9]+ ( '.' [0-9]+ )?;
EQUAL2:'=';
NULL1: 'null';
DQUOT3:'"' ;
BIT_OR1             : '|';
AND1                 : '&&';
OR1                  : '||';
NOT1                 : '!';
EQUAL_EQUAL1         : '==';
EQUAL_EQUAL2         : '===';
NOT_EQUAL1           : '!=';
NOT_EQUAL2           : '!==';
LT_EQUAL1            : '<=';
GT_EQUAL1            : '>=';
PLUS1         : '+';
MIN1          : '-';
MULT1         : '*';
COMMA1        : ',';
COLON1       : ':';
DOT1          : '.';
QUESTION_MARK1: '?';
ARROW1               : '=>';
LT1                  : '<';
GT1                : '>';
SQUARE_OPEN_BRACKET1 : '[';
SQUARE_CLOSE_BRACKET1: ']';
OPEN_BRACKET1        : '(';
CLOSE_BRACKET1       : ')';
CURLY_OPEN_BRACKET1  : '{';
CURLY_CLOSE_BRACKET1 : '}';
ID2: IDENTIFIER;
DQUOT4:DQUOT3' '*->popMode;

mode EVENTBINDING;
WS3: [ \t\r\n]+ -> skip;
CLOSE_BRACKET2       : ')';
NUMBER_VAL2:
    [0-9]+ ( '.' [0-9]+ )?
    | MIN [0-9]+ ( '.' [0-9]+ )?;
EQUAL3:'=';
NOT2                 : '!';
PLUS2        : '+';
MIN2         : '-';
MULT2         : '*';
DOT3            : '.';
DQUOT5:'"' ;
ID3: IDENTIFIER;
OPEN_BRACKET2       : '(';
DQUOT6:DQUOT5' '*->popMode;