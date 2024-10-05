grammar cc;

// LEXER: //

IDENT  : [a-zA-Z][a-zA-Z0-9']* ;
NUMBER : [0-9]+ ;
COMMENT : '//' ~[\r\n]* -> skip ;
WHITESPACE : [ \n\t]+ -> skip ;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip ;

// PARSER: //
start : hw* EOF ;
hw : hardware inputs outputs latches? definition * update siminputs ;

hardware : 'hardware' ':' IDENT+ ;
inputs : 'inputs' ':' signal+ ;
outputs : 'outputs' ':' signal+ ;
definition : 'definition' ':' function '=' exp ;
update : 'update' ':' (IDENT '=' out)+ ;
siminputs : 'siminputs' ':' (IDENT '=' NUMBER)+ ;
latches : 'latches' ':' signal* ;
signal : IDENT ;

function : IDENT '(' signal ',' signal ',' signal ')'
     | IDENT '(' signal ',' signal ')'
     | IDENT ;

out : function
    | exp ;

exp : IDENT? '/' exp              # NOT
    | exp '+' exp                 # OR
    | exp '*' exp                 # AND
    | '(' exp ')'                 # PARENTHESES
    | IDENT+                      # Constants
    ;