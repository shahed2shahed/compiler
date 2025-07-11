/*parser grammar MyParser;

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
    ;*/





parser grammar MyParser;

options { tokenVocab = MyLexer; }

//program:
//    (importStatment   #importStmtLabel
//    | componentDeclaration #componentDeclLabel
//    | classStatment   #classStmtLabel
//    | functionCall    #functionCallLabel
//    )* ;


























program: (statement)*;

statement:
importStatment   #importStmtLabel
|componentDeclaration #componentDeclLabel
|classStatment   #classStmtLabel
|functionCall    #functionCallLabel
;


importStatment:
    IMPORT CURLY_OPEN_BRACKET IDENTIFIER (COMMA IDENTIFIER)* CURLY_CLOSE_BRACKET FROM STRING SEMI_COLON;

componentDeclaration:
    COMPONENT OPEN_BRACKET CURLY_OPEN_BRACKET componentBody* CURLY_CLOSE_BRACKET CLOSE_BRACKET;

//componentBody:
//    ( selectorProperty    #selectorLabel
//    | standaloneProperty  #standaloneLabel
//    | importsProperty     #importsLabel
//    | templateProperty    #templateLabel
//    ) COMMA ;

componentBody: componentEle COMMA (componentEle COMMA)*;

selectorProperty:SELECTOR COLON STRING;
standaloneProperty:STANDALONE COLON BOOLEAN;
importsProperty:IMPORTS COLON SQUARE_OPEN_BRACKET IDENTIFIER (COMMA IDENTIFIER)* SQUARE_CLOSE_BRACKET;
templateProperty:TEMPLATE COLON QUOT htmlDeclare+ QUOT;

componentEle:
selectorProperty    #selectorLabel
|standaloneProperty  #standaloneLabel
|importsProperty     #importsLabel
|templateProperty    #templateLabel
;


classStatment:
    EXPORT CLASS IDENTIFIER CURLY_OPEN_BRACKET classBody* CURLY_CLOSE_BRACKET;

classBody:
    variableDeclaration       #varDeclLabel
    | functionDeclaration     #funcDeclLabel
    | assignment              #assignmentLabel
    | functionCall            #methodCallLabel
    | print_stat              #printStatLabel
    | print_error             #printErrLabel
    ;


print_error:
    CONSOLE DOT ERROR OPEN_BRACKET (IDENTIFIER|STRING|NUMBER_VAL) CLOSE_BRACKET
    ;

print_stat:
    CONSOLE DOT LOG OPEN_BRACKET (IDENTIFIER|STRING|NUMBER_VAL) CLOSE_BRACKET SEMI_COLON
    ;

functionCall:
    IDENTIFIER OPEN_BRACKET IDENTIFIER CLOSE_BRACKET DOT CATCH OPEN_BRACKET parameters ARROW print_error CLOSE_BRACKET SEMI_COLON
    | IDENTIFIER OPEN_BRACKET IDENTIFIER CLOSE_BRACKET DOT CATCH OPEN_BRACKET IDENTIFIER ARROW print_error CLOSE_BRACKET SEMI_COLON
    ;


functionDeclaration:
    FUNCTION? IDENTIFIER parameters? (COLON type)? CURLY_OPEN_BRACKET functionBody CURLY_CLOSE_BRACKET
        #namedFunctionDecl

    | arrowFunction
        #arrowFunctionAsFunctionDecl

    | variable_type IDENTIFIER EQUAL FUNCTION parameters? (COLON type)? CURLY_OPEN_BRACKET functionBody CURLY_CLOSE_BRACKET
        #assignedFunctionDecl
    ;
parameters:
    OPEN_BRACKET IDENTIFIER COLON type (COMMA IDENTIFIER COLON type)* CLOSE_BRACKET    #paramList
    | OPEN_BRACKET IDENTIFIER COLON type (EQUAL (STRING|NUMBER_VAL|BOOLEAN))? (COMMA IDENTIFIER COLON type (EQUAL (STRING|NUMBER_VAL|BOOLEAN))? )* CLOSE_BRACKET  #paramWithDefault
    ;

functionBody:
    (variableDeclaration
    |assignment
    |print_stat
    |print_error)* ;

assignment:
    IDENTIFIER EQUAL expression SEMI_COLON             #simpleAssignment
    | IDENTIFIER DOT IDENTIFIER (EQUAL type)? SEMI_COLON  #dotAssignment
    ;

templateExpression:
CURLY_OPEN_BRACKET (types)* CURLY_CLOSE_BRACKET  ;


types:
     type            #typeLabel
    | marks          #marksLabel
    | expression     #expressionLabel
    | htmlDeclare    #nestedHtmlLabel
    ;

htmlDeclare:
      normalHtmlTag    #normalHtmlTagLabel
    | selfClosingTag   #selfClosingTagLabel
    ;

normalHtmlTag:
    openTag htmlBody closeTag
    ;

selfClosingTag:
    LT (types)* SLASH GT
    ;

openTag:
    LT (types)* GT
    ;

closeTag:
    LT SLASH IDENTIFIER GT
    ;

htmlBody:
    (types)*
    ;



type
    : primitiveType
    | arrayType
    | tupleType
    | genericType
    ;
    
primitiveType
    : STRING_EX
    | NUMBER
    | BOOLEAN
    | VOID
    | NULL
    | ANY
    | IDENTIFIER 
    ;

arrayType
    : type '[]'
    ;

genericType
    : 'Array' LT type GT
    ;

tupleType
    : SQUARE_OPEN_BRACKET type (COMMA type)+ SQUARE_CLOSE_BRACKET
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



arrayDeclaration:
    SQUARE_OPEN_BRACKET (expression (COMMA expression)* )? SQUARE_CLOSE_BRACKET 
    ;



expression:
      STRING                            #stringExpr
    | NUMBER_VAL                        #numberExpr
    | arrayDeclaration                  #arrayExpr
    | ifElseStat                        #ifElseExpr
    | CURLY_OPEN_BRACKET IDENTIFIER COLON expression (COMMA IDENTIFIER COLON expression)* CURLY_CLOSE_BRACKET
                                        #objectExpr
    | BOOLEAN                           #booleanExpr
    | directivesStatment                #directiveExpr
    ;

directivesStatment:
      DIRECTIVES EQUAL ngForValue           #ngForDirective
    | DIRECTIVES  EQUAL ngIfValue            #ngIfDirective
    ;

ngForValue:
      QUOT ngForExpression QUOT          #quotedNgFor
    | STRING                              #rawStringNgFor
    ;

ngForExpression:
      LET IDENTIFIER OF IDENTIFIER                         #basicNgForExpr
    | LET IDENTIFIER OF IDENTIFIER BIT_OR IDENTIFIER       #ngForWithPipeExpr
    ;

ngIfValue:
      QUOT conditionExpression QUOT      #quotedNgIf
    | STRING                              #rawStringNgIf
    ;

conditionExpression:
    logicalTerm ((AND | OR) logicalTerm)* ;



logicalTerm:
    NOT? IDENTIFIER (DOT IDENTIFIER)* ;

ifElseStat:
    IDENTIFIER QUESTION_MARK type COLON type ;

variable_type
    : LET|VAR|CONST
    ;

unionType:
    type (BIT_OR type)? ;


variableDeclaration:
    variable_type? IDENTIFIER COLON unionType EQUAL types SEMI_COLON   #typedVariableDecl
    | variable_type? IDENTIFIER EQUAL expression SEMI_COLON            #inferredVariableDecl
    ;

arrowFunction:
    variable_type IDENTIFIER EQUAL parameters COLON type ARROW arrowBody SEMI_COLON #arrowFunctionDecl;

arrowBody:
    IDENTIFIER ((PLUS | MIN) IDENTIFIER)?     #simpleArrowBody
    | STRING                                  #stringArrowBody
    ;