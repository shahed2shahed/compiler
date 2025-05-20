parser grammar MyParser;

options { tokenVocab = MyLexer; }

program:
    (importStatment   #importStmtLabel
    | componentDeclaration #componentDeclLabel
    | classStatment   #classStmtLabel
    | functionCall    #functionCallLabel
    )* ;

importStatment:
    IMPORT CURLY_OPEN_BRACKET IDENTIFIER (COMMA IDENTIFIER)* CURLY_CLOSE_BRACKET FROM STRING SEMI_COLON;

componentDeclaration:
    COMPONENT OPEN_BRACKET CURLY_OPEN_BRACKET componentBody* CURLY_CLOSE_BRACKET CLOSE_BRACKET;

componentBody:
    ( selectorProperty    #selectorLabel
    | standaloneProperty  #standaloneLabel
    | importsProperty     #importsLabel
    | templateProperty    #templateLabel
    ) COMMA ;

classStatment:
    EXPORT CLASS IDENTIFIER CURLY_OPEN_BRACKET classBody* CURLY_CLOSE_BRACKET;

functionCall:
    IDENTIFIER OPEN_BRACKET IDENTIFIER CLOSE_BRACKET DOT CATCH OPEN_BRACKET parameters ARROW print_error CLOSE_BRACKET SEMI_COLON
    | IDENTIFIER OPEN_BRACKET IDENTIFIER CLOSE_BRACKET DOT CATCH OPEN_BRACKET IDENTIFIER ARROW print_error CLOSE_BRACKET SEMI_COLON
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

types:
    type           #typeLabel
    | expression     #expressionLabel
    | htmlDeclare    #nestedHtmlLabel
    ;

classBody:
    variableDeclaration     #varDeclLabel
    | functionDeclaration     #funcDeclLabel
    | assignment              #assignmentLabel
    | functionCall            #methodCallLabel
    | print_stat              #printStatLabel
    | print_error             #printErrLabel
    ;

variableDeclaration:
    variable_type? IDENTIFIER COLON unionType EQUAL types SEMI_COLON   #typedVariableDecl
    | variable_type? IDENTIFIER EQUAL expression SEMI_COLON            #inferredVariableDecl
    ;

unionType:
    type (BIT_OR type)? ;

arrowFunction:
    variable_type IDENTIFIER EQUAL parameters COLON type ARROW arrowBody SEMI_COLON #arrowFunctionDecl;

arrowBody:
    IDENTIFIER ((PLUS | MIN) IDENTIFIER)?  #simpleArrowBody
    | STRING                                  #stringArrowBody
    ;

functionDeclaration:
    FUNCTION? IDENTIFIER parameters? (COLON type)? CURLY_OPEN_BRACKET functionBody CURLY_CLOSE_BRACKET
        #namedFunctionDecl

    | arrowFunction

        #arrowFunctionAsFunctionDecl

    | variable_type IDENTIFIER EQUAL FUNCTION parameters? (COLON type)? CURLY_OPEN_BRACKET functionBody CURLY_CLOSE_BRACKET
        #assignedFunctionDecl
    ;

type:
    IDENTIFIER                #customType
    | NUMBER                  #numberType
    | STRING_EX               #stringType
    | VOID                    #voidType
    | NULL                    #nullType
    | ANY                     #anyType
    | CLASS                   #classType
    | ARRAY_STRING            #arrayStringType
    | ARRAY_NUMBER            #arrayNumberType
    | ARRAY_TUPLE             #arrayTupleType
    | templateExpression      #templateType
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

templateExpression:
    CURLY_OPEN_BRACKET (types)* CURLY_CLOSE_BRACKET   #templateExpr;

arrayDeclaration:
    SQUARE_OPEN_BRACKET (expression (COMMA expression)* )? SQUARE_CLOSE_BRACKET 
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

print_error:
    CONSOLE DOT ERROR OPEN_BRACKET (IDENTIFIER|STRING|NUMBER_VAL) CLOSE_BRACKET
    ;

print_stat:
    CONSOLE DOT LOG OPEN_BRACKET (IDENTIFIER|STRING|NUMBER_VAL) CLOSE_BRACKET SEMI_COLON
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
