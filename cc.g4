grammar cc;

// Lexer rules (tokens)
SIGNAL: [a-zA-Z_][a-zA-Z_0-9]*;
NUMBER: [0-9]+;
LATCH: '\'';
NOT: '/';
AND: '*';
OR: '+';
EQUAL: '=';
WS: [ \t\r\n]+ -> skip; // Ignore whitespaces

// Parser rules
circuit: 'hardware:' SIGNAL inputs outputs latches definitions? updates siminputs;

inputs: 'inputs:' signal_list;
outputs: 'outputs:' signal_list;
latches: 'latches:' signal_list;

signal_list: SIGNAL (SIGNAL)*;

definitions: 'def:' def_list;
def_list: (definition)+;
definition: SIGNAL '(' SIGNAL (',' SIGNAL)* ')' '=' expr;

updates: 'updates:' update_list;
update_list: (SIGNAL EQUAL expr)+;

expr: or_expr;
or_expr: and_expr (OR and_expr)*;
and_expr: not_expr (AND not_expr)*;
not_expr: NOT not_expr
        | '(' expr ')'
        | SIGNAL
        | SIGNAL LATCH;

siminputs: 'siminputs:' siminput_list;
siminput_list: (SIGNAL '=' NUMBER)+;