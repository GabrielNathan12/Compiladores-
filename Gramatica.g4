grammar Gramatica;

MAIN: 'main';
TIPO: 'int'| 'real' | 'string';
AP: '(';
FP: ')';

ENTR: 'input';
SAI: 'output';
SAIQL: 'outputql';

OPARI: '+'|'-'|'*'|'/';
OPLOG: 'and'|'or';
OP: '>'| '<' | '>=' | '<=' | '=';

VAR: LETRA((DIGITO|LETRA)+)?;
NUM: DIGITO+('.' DIGITO)?;

PC: 'para'| 'funcao'| 'se' | 'senaose' | 'senao' | 'retorna';
AC: '{';
FC: '}';
DEL: ';';

fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];

WS:[ \r\t\n]* ->skip;