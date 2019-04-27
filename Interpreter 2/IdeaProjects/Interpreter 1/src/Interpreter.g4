grammar Interpreter;
// Parser Rules Section
start : code_section 'end program'
      ;

code_section    : statement*
                ;

statement       : variable_declare
                // Note: Error if real_val is included in this rule
                //| real_val
                | if_statement
                | elif_statement
                | else_statement
                | do_statement
                | while_statement
                | repeat_statement
                //| where the break statement go?
                ;

conditon_expressions : variable_ident (GREAT | LESS | GREATEQUA | LESSEQUA) variable_ident
                     | variable_ident (EQUIV | NOTEQUIV) variable_ident
                     | variable_ident (GREAT | LESS | GREATEQUA | LESSEQUA) real_val
                     | variable_ident (EQUIV | NOTEQUIV) real_val

                     // Note: If these expressions below were included, readability would be affected, also it's
                     //       not logically correct to say, 5 is equals x
                     //| real_val (GREAT | LESS | GREATEQUA | LESSEQUA) real_val
                     //| real_val (EQUIV | NOTEQUIV) real_val
                     //| real_val (GREAT | LESS | GREATEQUA | LESSEQUA) variable_ident
                     //| real_val (EQUIV | NOTEQUIV) variable_ident
                     ;

// Note: Implemented brackets {} for opener and closer for each conditionals but it kill simplicity bc of multiplicity.
//       Promoting brackets such as (), {}, [], could cause mismatch syntax errors. To minimize, remove them on
//       conditions. Only allow () when doing order of operations.
if_statement        : 'IF'  conditon_expressions? ((AND | OR)? (conditon_expressions))+?  code_section 'exit IF'
                    ;

elif_statement      : 'UNLESS' conditon_expressions? ((AND | OR)? (conditon_expressions))+?  code_section 'exit UNLESS'
                    ;

else_statement      : 'ELSE' code_section 'exit ELSE'
                    ;

do_statement        : 'DO UNTIL' conditon_expressions? ((AND | OR)? (conditon_expressions))+? code_section 'loop CLOSER'
                    ;

while_statement     : 'WHILE' conditon_expressions? ((AND | OR)? (conditon_expressions))+? code_section 'loop CLOSER'
                    ;

repeat_statement    : 'REPEAT UNTIL' conditon_expressions? ((AND | OR)? (conditon_expressions))+? code_section 'loop CLOSER'
                    ;

variable_declare    : variable_ident '=' real_val
                    | variable_ident '=' real_val (MUL | DIV | MOD) real_val
                    | variable_ident '=' real_val (ADD | SUB) real_val
                    ;

variable_ident      : VAR
                    ;

assignment          : variable_ident '=' real_val
                    | variable_ident '='(ADD_A | SUB_A | MUL_A | DIV_A | MOD_A) real_val
                    ;

int_assignment      : variable_ident '=' int_result
                    | variable_ident '='(ADD_A | SUB_A | MUL_A | DIV_A | MOD_A) int_result
                    ;

float_assignment    : variable_ident '=' float_result
                    | variable_ident '='(ADD_A | SUB_A | MUL_A | DIV_A | MOD_A) float_result
                    ;

string_assignment   : variable_ident '=' string_result
                    | variable_ident '='ADD_A string_result
                    ;

bool_assignment     : variable_ident '=' bool_result
                    ;


int_result          : int_result '='(MUL | DIV | MOD) int_result
                    | int_result '='(ADD | SUB) int_result
                    | '(' SUB?(INT | FLOAT | STRING)  (MUL | DIV | MOD) (INT | FLOAT | STRING) ')'
                    | '(' SUB?(INT | FLOAT | STRING)  (ADD | SUB) (INT | FLOAT | STRING) ')'
                    | SUB?INT
                    ;

float_result        : float_result '='(MUL | DIV | MOD) float_result
                    | float_result '='(MUL | DIV | MOD) int_result
                    | int_result '='(MUL | DIV | MOD) float_result
                    | float_result '='(ADD | SUB) float_result
                    | float_result '='(ADD | SUB) int_result
                    | int_result '='(ADD | SUB) float_result
                    | '(' SUB?(INT | FLOAT | STRING)  (MUL | DIV | MOD) (INT | FLOAT | STRING) ')'
                    | '(' SUB?(INT | FLOAT | STRING)  (ADD | SUB) (INT | FLOAT | STRING) ')'
                    | SUB?FLOAT
                    ;

string_result       : string_result '=' MUL int_result
                    | int_result '=' MUL string_result
                    | string_result '=' ADD string_result
                    | '(' SUB?(INT | FLOAT | STRING)  (MUL | DIV | MOD) (INT | FLOAT | STRING) ')'
                    | '(' SUB?(INT | FLOAT | STRING)  (ADD | SUB) (INT | FLOAT | STRING) ')'
                    | STRING
                    ;

bool_result         : TRUE
                    | FALSE
                    ;

real_val            : variable_ident

                    | int_assignment
                    | float_assignment
                    | string_assignment
                    | bool_assignment
                    | assignment

                    | int_result
                    | float_result
                    | string_result
                    | bool_result

                    | real_val (MUL | DIV | MOD) real_val
                    | real_val (ADD | SUB) real_val

                    | real_val (GREAT | LESS | GREATEQUA | LESSEQUA) real_val
                    | real_val (EQUIV | NOTEQUIV) real_val

                    ;

// Lexer Rules Section

// Operators
ADD    : '+' | 'PLUS' | 'plus';
SUB    : '-' | 'MINUS' | 'minus';
MUL    : '*' | 'TIMES' | 'times';
DIV    : '/' | 'DIVIDE' | 'divide' ;
MOD    : '%' | 'MOD' | 'mod';

// Note: Considered to add && and ||, but after looking at the article,
//       && and || mistakes create a lot of mistakes for novices.
AND    : 'AND' | 'and';
OR     : 'OR' | 'or';

ASSIGN     : '=';
ADD_A      : '+=';
SUB_A      : '-=';
MUL_A      : '*=';
DIV_A      : '/=';
MOD_A      : '%=';

LPAREN : '(';
RPAREN : ')';

// Conditionals
// Note: Removed the symbols for possible syntax error. Especially == is the most notorious for syntax mistakes.
EQUIV     : 'IS' | 'is' | 'IS EQUALS' | 'is equals' | 'IS EQUAL TO' | 'is equal to';
NOTEQUIV  : 'IS NOT' | 'is not';
GREAT     : 'IS GREATER THAN' | 'is greater than';
LESS      : 'IS LESS THAN' | 'is less than';
GREATEQUA : 'IS GREATER THAN OR EQUAL TO' | 'is greater than or equal to';
LESSEQUA  : 'IS LESS THAN OR EQUAL TO' | 'is less than or equal to';

// Data Types
INT       :   [0-9]+;                                           // Automatically creates an integer
FLOAT     :   [0-9]* '.' [0-9]+;                                // Automatically creates a floating value
STRING    :   '"' ('\'"' | ~ '"')* '"';                         // Place " " to create a string
TRUE      :   'true' | 'TRUE'; //| 'is true' | 'IS TRUE';          // Boolean true
FALSE     :   'false' | 'FALSE'; //| 'is false' | 'IS FALSE';      // Boolena false

VAR       :   [a-zA-Z_][a-zA-Z0-9_]*;           // Variables can be aZ9, Az9, az_9 ... etc.
SPACE     :   [ \r\n]+ -> skip;                 // space to skip
LINEFEED  :   '\r'? '\n';                       // Linefeed requirement
COMMENT   :   '//' ~[\r\n]+ -> skip;            // comment are not included in tree

