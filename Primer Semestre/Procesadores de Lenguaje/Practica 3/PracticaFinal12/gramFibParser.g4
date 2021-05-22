
parser grammar gramFibParser;
options{
    tokenVocab = gramFibLexer;
    language = Java;
}

prog: ((includ | functions) | NEWLINE)*;
includ: p_reservadas identificador end_line;

functions: cabecera cuerpoFunc?;
cabecera:(p_reservadaFuncion | variable)  identificador parentesis_izquierdo  parametroCreacion* parentesis_derecho d_puntos type;
//La diferencia es que en cuerpo hay un begin y en cuerpoIf un then
cuerpoFunc:  (begin interior* end) | interior;
cuerpo:  (begin interior* end) | interior;
interior: (expr | b_while | b_for | return_fun | declaracion | asignacion | cadenachar | condicional);
b_while: p_reservadaWhile parentesis_izquierdo expr_condicional parentesis_derecho cuerpo;
declaracion_variable:type identificador;
declaracion: declaracion_variable opAsig expr* end_line*;
asignacion: identificador  opAsig expr*  end_line*;
cabecera_switch: pr_switch parentesis_izquierdo identificador parentesis_derecho;
cuerpo_switch: ((p_reservadas) identificador d_puntos ((opAsig | functions)| operaciones )* pr_breack end_line)* (p_reservadas d_puntos (((opAsig | functions) end_line)| operaciones)* pr_breack d_puntos) pr_endswitch;
return_fun: p_reservadas parentesis_izquierdo expr* parentesis_derecho end_line;
llamar_funcion: identificador parentesis_izquierdo parametroLlamada* parentesis_derecho end_line?;
condicional: (ifi parentesis_izquierdo expr_condicional parentesis_derecho then cuerpoIf) (elsei cuerpoIf)? endifi;
cuerpoIf: interior+;
operador_logico: p_reservadaAnd | p_reservadaOr;
expr_comparacion: not? ((expr operaciones expr) | (parentesis_izquierdo expr operaciones expr parentesis_derecho));
expr_condicional: ((expr_comparacion (operador_logico))* expr_comparacion) | not? booleano;
declaracion_array: type identificador CI integer CD opAsig PI (expr coma?)* PD end_line*;
op_array:   identificador CI integer CD end_line*;
b_for: p_reservadaFor identificador p_reservadaFrom integer p_reservadaTO (identificador|integer) (p_reservadaStep (identificador|integer))? p_reservadaDO cuerpo;
expr: 
     cadenachar
    | identificador
    | integer
    | op_array
    | variable
    | llamar_funcion
    | expr operaciones expr
    ;

nombre_funcion: (n_funcion | integer);
identificador: IDENTIFICADOR;
parametroLlamada: (expr | coma);
parametroCreacion: (type identificador coma?);
//palabras reservadas y símbolos especiales
p_reservadas: INCLUD | DEVOLVER;  
p_reservadaWhile:B_WHILE;
p_reservadaFor:B_FOR;
p_reservadaFuncion: FUNCION; 
begin: BEGIN;
end: END;
pr_switch: SWITCH;
pr_endswitch: ENDSWITCH;
pr_breack: BREACK;
ifi: IF;
elsei: ELSE;
then: THEN;
endifi: ENDIF;
p_reservadaAnd: AND;
p_reservadaOr: OR;
booleano: TRUE | FALSE;
not: NOT;
p_reservadaFrom:FROM;
p_reservadaStep:STEP;
p_reservadaTO:TO;
p_reservadaDO:DO;
cadenachar: CADENA;
integer:INT;
type: TYPE;
n_libreria: VARIABLE;
variable:VARIABLE;
n_funcion: VARIABLE;
operaciones: OPERACION;
opAsig: ASIG;
coma: COMA;
d_puntos:PUNTOS;
end_line: END_LINEDECL;
parentesis_izquierdo: PI;
parentesis_derecho: PD;
corchete_izquierdo:CI;
corchete_derecho:CD;
ws:WS;
newline:NEWLINE;
puntos: PUNTOS;

coments:
             |  COMENTARIO_BLOQUE
             |  COMENTARIO_BLOQUE2
             |  COMENTARIO_LINEA
             ;