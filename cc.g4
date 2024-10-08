

grammar cc;

// PARSER: //
start : circuit* EOF ;

circuit : hardware inputs outputs latches? definition* update siminputs ;

hardware : 'hardware' ':' IDENT ;
inputs : 'inputs' ':' signal+ ;
outputs : 'outputs' ':' signal+ ;
latches : 'latches' ':' signal* ;
definition : 'definition' ':' function '=' exp ;
update : 'updates' ':' (IDENT '=' out ';')+ ;
siminputs : 'siminputs' ':' (IDENT '=' NUMBER)+ ;

signal : IDENT ;

function : IDENT '(' signal (',' signal)* ')' ;

out : function
    | IDENT ;

exp : IDENT? '/' exp                # notOperator
    | e1=exp op='*' e2=exp          # andOperator
    | e1=exp op='+' e2=exp          # orOperator
    | '(' e=exp ')'                 # Parentheses
        | IDENT                     # Constant

    ;


// LEXER: //
IDENT : [a-zA-Z][a-zA-Z0-9']* ;
NUMBER : [0-9]+ ;
COMMENT : '//' ~[\r\n]* -> skip ;
WHITESPACE : [ \n\t]+ -> skip ;
LONGCOMMENT : '/*' (~[*] | '*' ~[/])* '*/' -> skip ;
