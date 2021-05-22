lexer grammar gramFibLexer;

B_WHILE: 'while';
FUNCION: 'function';
INCLUD: 'include';
DEVOLVER: 'devolver';
BEGIN: 'begin';
END: 'end';
CADENA: '"' (ESC|.)*? '"';
fragment ESC: '\\'[btnr"\\];
TYPE: 'numero' |'cadena' | 'void';
OPERACION: '+' | '<';
INT:('+' | '-')? [0-9]+;
FLOTANTE: '-'?INT+ '.' INT* | '-'?'0'?'.' INT+;
VARIABLE: [a-zA-Z]+;
PI: '(';
PD: ')';
ASIG: ':=';
PUNTOS: ':';
COMA: ',';
END_LINEDECL: ';';

COMENTARIO_BLOQUE: '/**' NEWLINE .*? NEWLINE '**/' NEWLINE -> skip;
COMENTARIO_BLOQUE2: '/***' .*? '***/' NEWLINE  -> skip;
COMENTARIO_LINEA: '//' (.*?[\n\r]) NEWLINE -> skip;
COMENTARIO_LINEA2:'/*' (.*?) '*/' NEWLINE -> skip;
COMENTARIO_LINEA3:'/*' (.*?) '*/'-> skip;
//VARIABLES/OPERACIONES
WS: ' '+ -> skip; 
NEWLINE : [\r\n]+ -> skip; 