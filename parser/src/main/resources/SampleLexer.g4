lexer grammar SampleLexer;

// Preserved words
START       :   'Start' ;
FOR	        :   'for'   ;

// Type names
TYPE_INT    	:   'int'   	;
TYPE_FLOAT  	:   'float'		;
TYPE_BOOLEAN  	:   'boolean'	;

// Binary arithmetic operators
ASSIGN      :	'='		;
ADD         :	'+'		;
INCREMENT   :	'++'	;

// Relational operators
LT          :   '<'     ;

// Separators
SEMI_COLON          :   ';' ;
LEFT_BRACE          :   '{' ;
RIGHT_BRACE         :   '}' ;
LEFT_PARENTHESIS    :   '(' ;
RIGHT_PARENTHESIS   :   ')' ;

// Integer literals
IntegerLiteral
    :   DecimalNumeral
    ;

fragment
DecimalNumeral
    :   Digit+
    ;

fragment
Digit
    :   [0-9]
    ;

// Floating point literals
FloatingPointLiteral
    :   DecimalNumeral '.' DecimalNumeral
    ;

// Boolean literals
BooleanLiteral
    :   'true'
    |	'false'
    ;

Identifier
    :   ( Letter LetterOrDigit* )
    ;

fragment
Letter
    :   [a-zA-Z_] // these are the "letters" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

fragment
LetterOrDigit
    :   [a-zA-Z0-9_] // these are the "letters or digits" below 0x7F
    |   // covers all characters above 0x7F which are not a surrogate
        ~[\u0000-\u007F\uD800-\uDBFF]
    |   // covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
        [\uD800-\uDBFF] [\uDC00-\uDFFF]
    ;

// Whitespace and comments

WS  :  [ \t]+ -> channel(HIDDEN)
    ;

NEW_LINE  :  [\r\n\u000C]+ -> channel(HIDDEN)
    ;