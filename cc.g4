grammar cc;

////////////// PARSER: ///////////

start : hw* EOF ;

hw : hardware inputs outputs latches? def* updates siminputs ;

hardware : 'hardware' ':' IDENT+ ;
inputs : 'inputs' ':' signal+ ;
latches : 'latches' ':' signal* ;
outputs : 'outputs' ':' signal+ ;
def : 'def' ':' funk '=' exp ;
updates : 'updates' ':' (IDENT '=' out)+ ;
siminputs : 'siminputs' ':' (IDENT '=' NUMBER)+ ;

signal : IDENT ;

funk : IDENT '(' signal ',' signal ',' signal ')'
     | IDENT '(' signal ',' signal ')'
     | IDENT ;

out : funk
    | exp ;

exp : IDENT? '/' exp                     # NOT
    | exp '*' exp                 # AND
    | exp '+' exp                 # OR
    | '(' exp ')'                 # Paren
    | IDENT+                       # Constant
    ;

////////////// LEXER: ////////

IDENT  : [a-zA-Z][a-zA-Z0-9']* ;
NUMBER : [0-9]+ ;
WHITESPACE : [ \n\t]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip ;