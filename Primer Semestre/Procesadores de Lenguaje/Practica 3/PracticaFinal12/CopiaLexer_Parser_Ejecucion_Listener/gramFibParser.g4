
parser grammar gramFibParser;
options{
    tokenVocab = gramFibLexer;
    language = Java;
}

prog: ((includ | functions) | NEWLINE)*;
includ:p_reservadas  (n_libreria|integer)* end_line;

functions: ((p_reservadafuncion)|variable)  (n_funcion | integer)* parentesis  (type (variable | integer)* coma?)* parentesis d_puntos type beg_end?;
beg_end:  begin (expr | b_while | return_fun | declaracion |cadenachar|beg_end)* end;
b_while: p_reservadaWhile  parentesis (variable|integer)* operaciones variable parentesis  beg_end?;
declaracion:  type? (variable|integer)*  asignacion expr*  end_line*;
return_fun: p_reservadas  parentesis expr* parentesis end_line;
llamar_funcion: (n_funcion | integer)* parentesis (expr | coma)* parentesis end_line?;
expr: 
     cadenachar
    | integer
    | variable
    | llamar_funcion
    | expr  operaciones expr
    ;
p_reservadas: INCLUD | DEVOLVER;  //palabras reservadas para funciones bucles....
p_reservadaWhile:B_WHILE;
p_reservadafuncion: FUNCION; 
begin: BEGIN;
end: END;
cadenachar: CADENA;
integer:INT;
type: TYPE;
n_libreria: VARIABLE;
variable:VARIABLE;
n_funcion: VARIABLE;
operaciones: OPERACION;
asignacion: ASIG;
coma: COMA;
d_puntos:PUNTOS;
end_line: END_LINEDECL;
parentesis: PI  |   PD;
ws:WS;
newline:NEWLINE;
puntos: PUNTOS;
coments:
             |  COMENTARIO_BLOQUE
             |  COMENTARIO_BLOQUE2
             |  COMENTARIO_LINEA
             ;