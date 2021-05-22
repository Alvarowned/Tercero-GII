:-consult(draw).
:-consult(oracionesPrueba).
:-consult(gramaticaEspanol).
:-consult(gramaticaIngles).

% Funcion para dibujar el arbol correspondiente a una oracion en español
% Se introduce el set de oraciones (SetOrIn) y el numero de la oracion (NOrIn)
% Retorna la "traduccion sintactica" como X
dibujarArbolEsp(SetOrIn,NOrIn,X) :- oracionEj(SetOrIn,e,NOrIn,OrE), write("OrE = "), writeln(OrE),
                                    oracion(X,OrE,[]), draw(X).

% Funcion para dibujar el arbol correspondiente a una oracion en ingles
% Se introduce el set de oraciones (SetOrIn) y el numero de la oracion (NOrIn)
% Retorna la "traduccion sintactica" como X
dibujarArbolIng(SetOrIn,NOrIn,X) :- oracionEj(SetOrIn,i,NOrIn,OrI), write("OrI = "), writeln(OrI),
                                    sentence(X,OrI,[]), draw(X).

% Funcion para traducir una oracion en español a ingles
% Se introduce el set de oraciones (SetOrIn) y el numero de la oracion (NOrIn)
% Retorna la oracion en ingles (OrI)
traducir_EaI(SetOrIn,NOrIn,OrI) :- oracionEj(SetOrIn,e,NOrIn,OrE), write("OrE = "), writeln(OrE),
                                   oracion(X,OrE,[]), sentence(X,OrI,[]).

% Funcion para traducir una oracion en ingles a español
% Se introduce el set de oraciones (SetOrIn) y el numero de la oracion (NOrIn)
% Retorna la oracion en español (OrE)
traducir_IaE(SetOrIn,NOrIn,OrE) :- oracionEj(SetOrIn,i,NOrIn,OrI), write("OrI = "), writeln(OrI),
                                   sentence(X,OrI,[]), oracion(X,OrE,[]).