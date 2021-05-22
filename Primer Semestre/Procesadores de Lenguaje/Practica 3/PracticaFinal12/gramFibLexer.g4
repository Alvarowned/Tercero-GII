lexer grammar gramFibLexer;

B_WHILE: 'while';
B_FOR:  'for';
FROM: 'from';
CASE: 'case';
STEP:   'step';
TO: 'to';
DO: 'do';
FUNCION: 'function';
SWITCH: 'switch';
INCLUD: 'include';
DEVOLVER: 'devolver';
BEGIN: 'begin';
END: 'end';
ENDSWITCH: 'endswitch';
BREACK: 'break';
TYPE: 'numero' |'cadena' | 'void';
INT:('+' | '-')? [0-9]+;
IDENTIFICADOR: [a-zA-Z][a-zA-Z0-9_$]*;
CADENA: '"' (ESC|.)*? '"';
fragment ESC: '\\'[btnr"\\];
OPERACION: '*' | '/' | '+' | '-' | '<' | '>' | '<=' | '>=' ;
FLOTANTE: '-'?INT+ '.' INT* | '-'?'0'?'.' INT+;
VARIABLE: [a-zA-Z]+;
CI: '[';
CD: ']';
PI: '(';
PD: ')';
ASIG: ':=';
PUNTOS: ':';
COMA: ',';
END_LINEDECL: ';';
AND: '&&';
OR: '||';
TRUE: 'true';
FALSE: 'false';
NOT: '!';

COMENTARIO_BLOQUE: '/**' NEWLINE .*? NEWLINE '**/' NEWLINE -> skip;
COMENTARIO_BLOQUE2: '/***' .*? '***/' NEWLINE  -> skip;
COMENTARIO_LINEA: '//' (.*?[\n\r]) NEWLINE -> skip;
COMENTARIO_LINEA2:'/*' (.*?) '*/' NEWLINE -> skip;
COMENTARIO_LINEA3:'/' (.?) '*/'-> skip;
IF: 'if';
ELSE:'else';
THEN: 'then';
ENDIF:'endif';
BAJO:'_';

//VARIABLES/OPERACIONES
WS: ' '+ -> skip; 
NEWLINE : [\r\n]+ -> skip; 