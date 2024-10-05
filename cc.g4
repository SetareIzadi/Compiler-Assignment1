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
circuit: 'hardware:' SIGNAL inputs outputs latches updates siminputs EOF;

inputs: 'inputs:' signal_list;
outputs: 'outputs:' signal_list;
latches: 'latches:' signal_list;

signal_list: SIGNAL (SIGNAL)*;

updates: 'updates:' update_list;
update_list: (SIGNAL EQUAL expr ';')+;

expr: term (OR term)*;
term: factor (AND factor)*;
factor: NOT factor
      | '(' expr ')'
      | SIGNAL;

siminputs: 'siminputs:' siminput_list;
siminput_list: SIGNAL EQUAL NUMBER (';' SIGNAL EQUAL NUMBER)*; // Changed separator to ';' to align with example
