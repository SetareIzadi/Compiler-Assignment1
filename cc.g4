grammar cc;

//Parser

start : circuit* EOF ;

circuit : hardware  outputs inputs latches? definition* updates siminputs ;

hardware : 'hardware' ':' IDENT+ ;
latches : 'latches' ':' signal* ;
inputs : 'inputs' ':' signal+ ;
outputs : 'outputs' ':' signal+ ;
updates : 'updates' ':' (IDENT '=' out)+ ;
definition : 'definition' ':' function '=' exp ;
siminputs : 'siminputs' ':' (IDENT '=' NUMBER)+ ;

signal : IDENT+ ;

function : IDENT '(' signal ',' signal ',' signal ')'
     | IDENT '(' signal ',' signal ')'
     | IDENT '(' signal')';

out : function
    | exp ;

exp : IDENT? '/' exp              # NOT
    | exp '+' exp                 # OR
    | exp '*' exp                 # AND
    | '(' exp ')'                 # Parentheses
    | IDENT+                       # Constant
    ;

/// Lexer
IDENT  : [a-zA-Z][a-zA-Z0-9']* ;
NUMBER: [0-9]+ ;
WHITESPACE: [ \n\t]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
BLOCKCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip ;
