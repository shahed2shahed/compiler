parser grammar MyParser;

options{tokenVocab= MyLexer;}

program:
(importStatment
|componentDeclaration
|classStatment
|functionCall)* ;

importStatment: IMPORT CURLY_OPEN_BRACKET IDENTIFIER (COMMA IDENTIFIER)* CURLY_CLOSE_BRACKET FROM STRING SEMI_COLON;

componentDeclaration: COMPONENT OPEN_BRACKET CURLY_OPEN_BRACKET componentBody* CURLY_CLOSE_BRACKET CLOSE_BRACKET;

componentBody:
  (
  (SELECTOR COLON STRING)
  |(STANDALONE COLON BOOLEAN)
  |(IMPORTS COLON SQUARE_OPEN_BRACKET IDENTIFIER (COMMA IDENTIFIER)* SQUARE_CLOSE_BRACKET)
  |(TEMPLATE COLON QUOT htmlDeclare+ QUOT)
  ) COMMA
;

classStatment: EXPORT CLASS IDENTIFIER CURLY_OPEN_BRACKET classBody* CURLY_CLOSE_BRACKET;

functionCall
    : IDENTIFIER OPEN_BRACKET IDENTIFIER CLOSE_BRACKET DOT CATCH OPEN_BRACKET parameters ARROW print_error CLOSE_BRACKET SEMI_COLON
    | IDENTIFIER OPEN_BRACKET IDENTIFIER CLOSE_BRACKET DOT CATCH OPEN_BRACKET IDENTIFIER ARROW print_error CLOSE_BRACKET SEMI_COLON
    ;


htmlDeclare: (openTag htmlBody closeTag | selfClosingTag);

openTag:
   LT
    (types)*
   GT
 ;

 types : type|expression|htmlDeclare;

closeTag: LT SLASH IDENTIFIER GT;

selfClosingTag
    :
      LT (types)* SLASH GT
    ;

htmlBody
    : (types)*
    ;

classBody
     : variableDeclaration
     |functionDeclaration
     |print_stat
     |print_error
;

variable_type
    : LET|VAR|CONST
    ;

variableDeclaration
    : variable_type? IDENTIFIER COLON ((type BIT_OR type)|type) EQUAL (types) SEMI_COLON
    | variable_type? IDENTIFIER EQUAL expression SEMI_COLON
    ;

arrowFunction
    : variable_type IDENTIFIER EQUAL parameters COLON type ARROW (IDENTIFIER ((PLUS|MIN) IDENTIFIER)? | STRING) SEMI_COLON
    ;

functionDeclaration
    : FUNCTION? IDENTIFIER parameters? (COLON type)? CURLY_OPEN_BRACKET functionBody CURLY_CLOSE_BRACKET
    | arrowFunction
    | variable_type IDENTIFIER EQUAL FUNCTION parameters? (COLON type)? CURLY_OPEN_BRACKET functionBody CURLY_CLOSE_BRACKET
    ;

type
    : IDENTIFIER
    | NUMBER
    | STRING_EX
    | VOID
    | NULL
    | ANY
    | CLASS
    | ARRAY_STRING
    | ARRAY_NUMBER
    | ARRAY_TUPLE
    | templateExpression
    | marks
    ;

marks:
    SEMI_COLON
    |COMMA
    |COLON
    |DOT
    |QUESTION_MARK
    |HASH_TAG
    |EQUAL
    |LT
    |GT
    |PLUS
    |MIN
    |S_DOlOR
    |SQUARE_OPEN_BRACKET
    |SQUARE_CLOSE_BRACKET
    |OPEN_BRACKET
    |CLOSE_BRACKET
    |CURLY_OPEN_BRACKET
    |CURLY_CLOSE_BRACKET
    ;

expression:
      STRING
    |NUMBER_VAL
    | arrayDeclaration
    | ifElseStat
    | CURLY_OPEN_BRACKET IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)* CURLY_CLOSE_BRACKET
    ///////////{m:'kk' , m:'kk' }
    | BOOLEAN
    | directivesStatment
    ;

templateExpression
    :
   CURLY_OPEN_BRACKET+
    (types)*
   CURLY_CLOSE_BRACKET+
    ;


arrayDeclaration
    : SQUARE_OPEN_BRACKET (expression (COMMA expression)* COMMA*)? SQUARE_CLOSE_BRACKET
    ;

parameters
    : OPEN_BRACKET IDENTIFIER COLON type (COMMA IDENTIFIER COLON type)* CLOSE_BRACKET
    | OPEN_BRACKET IDENTIFIER COLON type (EQUAL (STRING|NUMBER_VAL|BOOLEAN))? (COMMA IDENTIFIER COLON type (EQUAL (STRING|NUMBER_VAL|BOOLEAN))? )* CLOSE_BRACKET
    ;

functionBody
    : (variableDeclaration
      |assignment
      |print_stat
      |print_error)*
    ;


assignment
    : IDENTIFIER EQUAL expression SEMI_COLON
    | IDENTIFIER DOT IDENTIFIER (EQUAL type)? SEMI_COLON
    ;

print_error
    : CONSOLE DOT ERROR OPEN_BRACKET (IDENTIFIER|STRING|NUMBER_VAL) CLOSE_BRACKET
    ;

print_stat
    : CONSOLE DOT LOG OPEN_BRACKET (IDENTIFIER|STRING|NUMBER_VAL) CLOSE_BRACKET SEMI_COLON
    ;

directivesStatment
    : DIRECTIVES EQUAL STRING
    ;


ifElseStat
    : IDENTIFIER QUESTION_MARK type COLON type
    ;
