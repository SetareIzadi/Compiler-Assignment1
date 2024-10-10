grammar cc;

/// Parser
start : circuit* EOF ;

circuit : hardware inputs outputs latches? definition* updates siminputs ;

hardware : 'hardware' ':' IDENT+ ;
inputs : 'inputs' ':' signal+ ;
latches : 'latches' ':' signal* ;
outputs : 'outputs' ':' signal+ ;
definition : 'definition' ':' function '=' exp ;
updates : 'updates' ':' (IDENT '=' out)+ ;
siminputs : 'siminputs' ':' (IDENT '=' NUMBER)+ ;

signal : IDENT ;

function : IDENT '(' signal ',' signal ',' signal ')'
     | IDENT '(' signal ',' signal ')'
     | IDENT ;

out : function
    | exp ;

exp : IDENT? '/' exp              # NOT
    | exp '*' exp                 # AND
    | exp '+' exp                 # OR
    | '(' exp ')'                 # Paren
    | IDENT+                       # Constant
    ;

/// Lexer
IDENT  : [a-zA-Z][a-zA-Z0-9']* ;
NUMBER : [0-9]+ ;
WHITESPACE : [ \n\t]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
BLOCKCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip ;