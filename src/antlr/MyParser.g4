parser grammar MyParser;

options { tokenVocab = MyLexer; }

program: ////////////
    (statement)*
    ;

statement: /////////////
      importStatment ///////
    | componentDeclaration ////////
    | classStatment ////
    | functionCall /////
    ;

importStatment: ///////////
    IMPORT CURLY_OPEN_BRACKET (IDENTIFIER|BEHAVIORSUBJECT) (COMMA IDENTIFIER)* CURLY_CLOSE_BRACKET FROM STRING SEMI_COLON
    ;

module: //////
      COMPONENT
    | NGMODULE
    | INJECTABLE
    ;

componentDeclaration: //////////
    module OPEN_BRACKET CURLY_OPEN_BRACKET componentBody CURLY_CLOSE_BRACKET CLOSE_BRACKET;

componentBody: ///////////////
    componentEle (COMMA componentEle)* COMMA?
    ;

selectorProperty: //////////////
    SELECTOR COLON STRING
    ;

standaloneProperty: //////////////
    STANDALONE COLON BOOLEAN
    ;

propertyStat: ///////////
    COLON SQUARE_OPEN_BRACKET (IDENTIFIER|functionCall) (COMMA IDENTIFIER)* SQUARE_CLOSE_BRACKET
    ;

importsProperty: /////////////
    IMPORTS propertyStat
    ;

exportsProperty: ///////////
    EXPORTS propertyStat
    ;

bootstrapProperty: //////////
    IDENTIFIER propertyStat
    ;

templateProperty: //////////////
      TEMPLATE COLON QUOT htmlDeclare+ QUOT #templateHtmlDeclaration ///////////
    | IDENTIFIER COLON STRING #templateHtmlUrl ////////
    ;

componentEle: //////////
      selectorProperty  /////////
    | standaloneProperty ////////
    | importsProperty ///////
    | exportsProperty /////////
    | bootstrapProperty ////////
    | templateProperty //////////
    ;

classType: //////////
      IMPLEMENTS
    | INTERFACE
    | variable_type
;

classRelation: /////////
        CLASS IDENTIFIER (classType IDENTIFIER)?       #commonRelation ///////
      | classType IDENTIFIER (COLON IDENTIFIER EQUAL)? #otherRelation ////////
      ;

classStatment: //////////
      EXPORT classRelation CURLY_OPEN_BRACKET? body* CURLY_CLOSE_BRACKET?
      ;


types: ///////////
      type /////////
    | marks ///////
    | expression ////
    | eventBinding //////
    | htmlDeclare /////////
    ;


brackets:
    OPEN_BRACKET SQUARE_OPEN_BRACKET SQUARE_CLOSE_BRACKET CLOSE_BRACKET
    ;

stateManagement:
    variable_type IDENTIFIER S_DOlOR EQUAL IDENTIFIER BEHAVIORSUBJECT LT simpleArray GT brackets SEMI_COLON
    ;


body:
//      variableDeclaration
//    |
      functionDeclaration ////
    | print_stat ///
    | print_error ////
    | expression ////
    | stateManagement
    | returnStat
    ;

print_error: ////
    CONSOLE DOT ERROR OPEN_BRACKET values CLOSE_BRACKET
    ;

print_stat: ////
    CONSOLE DOT LOG OPEN_BRACKET values CLOSE_BRACKET SEMI_COLON
    ;

functionCall: ///////////
      IDENTIFIER parameters DOT CATCH OPEN_BRACKET parameters ARROW print_error CLOSE_BRACKET SEMI_COLON #callFunctionPara ///////
    | propertyAccess IDENTIFIER? parameters (AS simpleArray)? SEMI_COLON #methodCallWithValue //////////
    | propertyAccess OPEN_BRACKET argumentList? CLOSE_BRACKET SEMI_COLON? #methodCallWithListValue //////////
    ;


argumentList /////////
    : objectLiteral  #objectLiteralArgumentList ////////
    | SQUARE_OPEN_BRACKET objectProperty SQUARE_CLOSE_BRACKET #withObjectPropertyArgumentList /////////
    | expression (COMMA expression)*     #withExpressionArgumentList //////////
    ;

conditions: ///////////////
      propertyAccess OPEN_BRACKET IDENTIFIER ARROW propertyAccess (EQUALTHIRD|NOT_EQUAL_EQUAL) propertyAccess CLOSE_BRACKET #conditionEqualty ///////
    | propertyAccess OPEN_BRACKET parameters ARROW propertyAccess parameters COMMA NUMBER_VAL CLOSE_BRACKET operations NUMBER_VAL #conditionValue ////////
;

returnType:
  argumentList //////
 |functionCall ////////
 |conditions /////////
 |values /////////
;

returnStat:
 RETURN returnType SEMI_COLON?
    ;

objectLiteral //////////
    : CURLY_OPEN_BRACKET objectProperty (COMMA objectProperty)* CURLY_CLOSE_BRACKET
    ;

objectProperty ///////////
    : IDENTIFIER COLON expression #identifierObjectProperty /////////
    | IMPORTS COLON expression #importsObjectProperty ////////
    | EXPORTS COLON expression #exportsObjectProperty ///////
    | DOT* propertyAccess #dotPropertyAccessObjectProperty //////////
    ;

propertyAccess ///////////
    : IDENTIFIER (DOT IDENTIFIER S_DOlOR? (SQUARE_OPEN_BRACKET IDENTIFIER SQUARE_CLOSE_BRACKET)? )*
    ;

functionDeclarationStat: //////////
     (EQUAL FUNCTION)? parameters? (COLON unionType)? #simpleDecStat ///////
    | S_DOlOR parameters COLON IDENTIFIER LT simpleArray GT #simpleArrayDecStat ////////
    ;

normalfunctionDecl: ////////
      (FUNCTION|variable_type)? IDENTIFIER functionDeclarationStat CURLY_OPEN_BRACKET body* CURLY_CLOSE_BRACKET
    ;

functionDeclaration:
      normalfunctionDecl //////////
    | arrowFunction
    ;

parametersType: ///////////
       (COMMA AccessModifiers? IDENTIFIER COLON type)*  #paraWithType ///
     | EQUAL values (COMMA IDENTIFIER COLON type EQUAL values)* #paraValue ///
     ;

parametersContent: //////////
       AccessModifiers? IDENTIFIER (COLON type parametersType)? #paraHasAccessModifiers //////////
     | propertyAccess (COMMA propertyAccess)* #paraHasPropertyAccess ///////////
     ;

parameters: ////////////
        OPEN_BRACKET parametersContent* CLOSE_BRACKET
        ;

values: /////////////
          STRING
        | NUMBER_VAL
        | BOOLEAN
        | IDENTIFIER
        ;

operations: ///////////
          PLUS
        | MIN
        | MULT
        ;

subDotAssignment: ///////////
        (QUESTION_MARK DOT SQUARE_OPEN_BRACKET values SQUARE_CLOSE_BRACKET)*
        ;

assignment: /////////////
      IDENTIFIER EQUAL expression SEMI_COLON             #simpleAssignment //////////
    | propertyAccess subDotAssignment (EQUAL NOT? type (operations values)? )? SEMI_COLON?  #dotAssignment /////////
    | assignment EQUAL assignment (AS primitiveType SEMI_COLON)? #assignmentStatement /////////
  //  | assignment EQUAL assignment (AS primitiveType SEMI_COLON)* #assignmentStatement
    | propertyAccess EQUAL objectLiteral SEMI_COLON #assignmentStatementIniti //////
    ;

templateExpression: /////////////
    CURLY_OPEN_BRACKET+ (types)* (BIT_OR types+)? CURLY_CLOSE_BRACKET+
    ;

eventBinding: ////////////
     OPEN_BRACKET CLICK CLOSE_BRACKET2 EQUAL3 DQUOT5 ID3 OPEN_BRACKET2 (ID3 (DOT3 ID3)*)? CLOSE_BRACKET2 DQUOT6
     ;

htmlDeclare: //////////
      normalHtmlTag ////////////
    | selfClosingTag
    ;

normalHtmlTag: //////////
    openTag (types)* closeTag
    ;

selfClosingTag: /////////
    LT (types)* SLASH GT
    ;

openTag: //////////
    LT (types)* GT
    ;

closeTag: /////////////
    LT SLASH IDENTIFIER GT
    ;

simpleArray: //////////////
    IDENTIFIER SQUARE_OPEN_BRACKET SQUARE_CLOSE_BRACKET
    ;

map: /////////
    IDENTIFIER LT values (COMMA values)* GT
    ;

type //////////
    : primitiveType ////////
    | arrayStringType ///////
    | simpleArray ////////
    | map ////////
    | arrayNumberType /////////
    | tupleType ////////
    ;

primitiveType //////////
    : IDENTIFIER #idPrimitiveType ////////
    | NUMBER #numberPrimitiveType /////////
    | VOID #voidPrimitiveType ////////
    | NULL #nullPrimitiveType //////
    | ANY #anyPrimitiveType /////////
    | STRING_EX #stringEXPrimitiveType //////
    | CLASS #classPrimitiveType //////
    | templateExpression #templateExPrimitiveType ///////////
    ;

arrayStringType ////////
    :
    ARRAY LT STRING_EX GT
    ;

arrayNumberType ///////
    :
    NUMBER SQUARE_OPEN_BRACKET SQUARE_CLOSE_BRACKET
    ;

tupleType ///////////
    : SQUARE_OPEN_BRACKET type (COMMA type)+ SQUARE_CLOSE_BRACKET
    ;

marks: //////////////
    SEMI_COLON
    |COMMA
    |COLON
    |DOT
    |QUESTION_MARK
    |HASH_TAG
    |EQUAL
    |LT
    |GT
    |operations
    |S_DOlOR
    |SQUARE_OPEN_BRACKET
    |SQUARE_CLOSE_BRACKET
    |OPEN_BRACKET
    |CLOSE_BRACKET
    |CURLY_OPEN_BRACKET
    |CURLY_CLOSE_BRACKET
    |NOT
    ;

arrayDeclaration: /////////////
    SQUARE_OPEN_BRACKET (expression (COMMA expression COMMA*)* )? SQUARE_CLOSE_BRACKET
    ;

conditionStat: ////////////
    CURLY_OPEN_BRACKET expression* CURLY_CLOSE_BRACKET
    ;

tryStat:////////
    TRY conditionStat
    ;

catchStat: /////////////
     CATCH conditionStat
    ;

operationExpr://///////
      values (operations values)?
     ;

questionCondition: ///////////
    propertyAccess QUESTION_MARK+ values
    ;

expression: ///////////
      values //////////
    | arrayDeclaration //////////
    | variableDeclaration /////
    | ifElseStat //////
    | tryStat //////////
    | catchStat /////////
    | objectLiteral /////////
    | directivesStatment ///////////
    | propertyAccess ////////
    | functionCall //////////
    | assignment //////////
    | questionCondition /////////
    | operationExpr ///////////
    ;

directivesStatment: ////////////
      NgFor EQUAL1 ngForValue          #ngForDirective //////////////
    | NgIf EQUAL2 ngIfValue            #ngIfDirective ////////////
    ;

ngForValue: //////////
      DQUOT1 ngForExpression* DQUOT2
    ;

ngForExpression: ////////////
      LET1 ID1 OF1 ID1
    | LET1 ID1 EQUAL1 ID1
    ;

ngIfValue: ////////////
      DQUOT3 conditionExpression DQUOT4
    ;

conditionExpression: /////////////
      ID2 (equalOperation NULL1)? #equalNull //////////
    | logicalTerm ((GT1 NUMBER_VAL1)? equalOperation (ID2|NUMBER_VAL1))? #comparisonExp /////////
    | logicalTerm (OPEN_BRACKET1 ID2 ARROW1 logicalTerm (GT1 NUMBER_VAL1)? equalOperation ID2 CLOSE_BRACKET1)? #comparisonWithEqualExp /////////
    ;

equalOperation: //////////
        EQUAL2
       |EQUAL_EQUAL1
       |EQUAL_EQUAL2
       |NOT_EQUAL1
       |NOT_EQUAL2;

logicalTerm: /////////
     NOT1? ID2 (DOT1 ID2)?
    ;


ifStat: /////////
    IF OPEN_BRACKET types* CLOSE_BRACKET
    ;

ifElseStat: ///////////
      IDENTIFIER QUESTION_MARK type COLON type #ifQuestionMark ///////
    | ifStat RETURN SEMI_COLON #ifReturn //////
    | ifStat conditionStat (ELSE conditionStat)? #ifElse //////////
    ;

variable_type ////////////
    : LET
    | VAR
    | CONST
    | AccessModifiers
    ;

unionType: /////////////
    type (BIT_OR type)? ;

newObjectFromClass: ////////////
    IDENTIFIER* parameters (DOT toString)?;

toString : //////////
    TOSTRING parameters
    ;

variableDeclarationStat: ////////////
      COLON unionType (SQUARE_OPEN_BRACKET SQUARE_CLOSE_BRACKET)* EQUAL types #typedVariableDecl //////////
    | (EQUAL|COLON) (types|conditions) #inferredVariableDecl //////////
    | EQUAL newObjectFromClass  #objectFromClass //////////////
;

variableDeclaration: ////////////
      variable_type? propertyAccess+ QUESTION_MARK? variableDeclarationStat SEMI_COLON?
    ;

arrowFunction
    : variable_type IDENTIFIER EQUAL parameters (COLON type)? ARROW body SEMI_COLON   #varArrowFunction /////
    | propertyAccess EQUAL parameters? (COLON type)? ARROW CURLY_OPEN_BRACKET body* CURLY_CLOSE_BRACKET SEMI_COLON #eventHandlerArrowFunction
    ;