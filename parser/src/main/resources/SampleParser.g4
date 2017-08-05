parser grammar SampleParser;

options {
	tokenVocab = SampleLexer;	
}

// starting point for parsing a file
compilationUnit
    :   START body
    ;

body
    :   LEFT_BRACE statement* RIGHT_BRACE
    ;

statement
    :   variableDefinitionStatement SEMI_COLON
    |   assignmentStatement SEMI_COLON
    |	incrementStatement SEMI_COLON
    |   forLoopStatement
    ;

variableDefinitionStatement
    :   typeName Identifier (ASSIGN expression)?
    ;

assignmentStatement
    :   variableReference ASSIGN expression
    ;

incrementStatement
    :   incrementExpr
    ;

/*
 * Here it is assumed that the for loop has the syntax of:
 * 
 * for (variableDefinition ; expression ; assignmentStatement) {
 * 		zero or more statements
 * }
 */
forLoopStatement
    :   FOR LEFT_PARENTHESIS 
            (variableDefinitionStatement | assignmentStatement) SEMI_COLON 
            expression SEMI_COLON 
            (assignmentStatement | incrementStatement)
        RIGHT_PARENTHESIS 
        LEFT_BRACE statement* RIGHT_BRACE
    ;

incrementExpr
    :   variableReference INCREMENT
    ;

variableReference
    :   Identifier
    ;

expression
    :   simpleLiteral                   #simpleLiteralExpression
    |   variableReference               #variableRefExpression
    |   incrementExpr                   #incrementExpression
    |   expression ADD expression       #binaryAddExpression
    |   expression LT expression        #binaryCompareExpression
    ;

simpleLiteral
    :   IntegerLiteral
    |   FloatingPointLiteral
    |	BooleanLiteral
    ;

typeName
    :   TYPE_INT
    |   TYPE_FLOAT
    |	TYPE_BOOLEAN
    ;
