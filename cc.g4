grammar cc;

/// Parser
start : circuit* EOF ;
circuit : hardware inputs outputs latches? def* updates siminputs ;
hardware : 'hardware' ':' IDENT+ ;
inputs : 'inputs' ':' signal+ ;
outputs : 'outputs' ':' signal+ ;
latches : 'latches' ':' signal* ;
def : 'def' ':' function '=' exp ;
updates : 'updates' ':' (IDENT '=' out)+ ;
siminputs : 'siminputs' ':' (IDENT '=' NUMBER)+ ;

signal : IDENT ;

function : IDENT '(' signal ',' signal ',' signal ')'
        | IDENT '(' signal ',' signal ')'
        | IDENT ;
out : function
    | exp ;
exp : var=IDENT? '/' exp           # NOT
    | e1=exp ('*') e2=exp          # AND
    | e1=exp ('+') e2=exp          # OR
    | '(' e=exp ')'                # Parentheses
    | const=IDENT+                 # Constant ;

/// Lexer
IDENT  : [a-zA-Z][a-zA-Z0-9']* ;
NUMBER : [0-9]+ ;
WHITESPACE : [ \n\t]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
LONGCOMMENT : '/*' (~[*] | '*'~[/])* '*/' -> skip ;