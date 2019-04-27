// Pete Aguirre II
// Dr. Andreas Stefik
// CS 326 - Language Implementation
// Interpreter 1 - Edited
// February 12, 2019

// -----
// Three top languages similarity to original interpreter
// - C
// - lolcode
// - JavaScript

// -----
// Best solution?
// - C combined with lolcode, floating point w/ JavaScript

// -----
// Any troubles?
// - Had a lot trouble with understanding the parser rules
//   - took me a while but I know how to read it now
// - I assumed that number primitives means FLOAT AND DOUBLE
//

// -----
// Some improvements for the future (only applies to the WordDoc. code:
// - Comment can only do a single line
//   - I'm scared to fix this problem bc it froze when I tried
// - Decimal no. that starts with a dot such as: .2 wont work (FIXED)
// - I could just erase the DOT lexer and straight out put '.' on the parser rules
//   - I decided not to because I don't wanna completely copy JavaScript interpreter

// Language name
grammar Interpreter;

// -----
// Parser Rules
// Discussion
// - Nearly nothing was similar in this section of the interpreter.
// - The FLOAT was almost similar to the JavaScript interpreter
//   - But it's in the wrong formatting
// - BOOL was also similar as to JavaScript
// - I thought my rules made sense bc I based it on the given rules.
start  :
     expression  EOF
  ;


expression
   :
   |   INT
   |   expression (PLUS | MINUS | MULTIPLY | DIVIDE) expression
   |   FLOAT
   |   expression (PLUS | MINUS | MULTIPLY | DIVIDE) expression
   |   DOUBLE
   |   expression (PLUS | MINUS | MULTIPLY | DIVIDE) expression
   |   BOOL
   |   expression (TRUE | FALSE) expression
   |   CHAR
   |   expression (SPACE) expression
   |   expression (COMMENT) expression
   |   expression (LPAREN | RPAREN) expression
   |   expression (DECDOT) expression
   ;
// -----

// -----
// Lexer Rules
PLUS     :  '+';
MINUS    :  '-';
MULTIPLY :  '*';
DIVIDE   :  '/';
TRUE     :  'TRUE';
FALSE    :  'FALSE';
SPACE    :  ' ';
COMMENT  :  '//';
LPAREN   :  '(';
RPAREN   :  ')';
DECDOT   :  '.';
INT      :  '0'..'9'+;
BOOL     :  '0'..'1'+;
FLOAT    :  '0'..'9'+;
DOUBLE   :  '0'..'9'+;
// -----
