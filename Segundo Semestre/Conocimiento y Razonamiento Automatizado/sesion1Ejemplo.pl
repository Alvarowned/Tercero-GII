% Autor:
% Fecha: 30/01/2020

% Estos son hechos, todos seguidos
padre(adrian, manuel).
padre(carlos, martin).
padre(diego, martin).
padre(sonia, carlos).

madre(adrian, yolanda).
madre(ramon, yolanda).
madre(diego, clara).
madre(carlos, clara).
madre(sonia, eva).

% Estas son reglas
hermanos(X, Y) :- padre(X, Z), padre(Y, Z), X \= Y.
hermanos(X, Y) :- madre(X, Z), madre(Y, Z), X \= Y.

personas([adrian, ramon, diego, carlos, manuel, martin, yolanda, clara, eva]).
imprimir_personas([Pers|MasPers]) :- writeln(Pers), imprimir_personas(MasPers).
imprimir_personas([]).

% Sumar 1 a un número
sumar1(Num, NumOut) :- NumOut is Num+1.
suma(Num1, Num2, NumOut) :- NumOut is Num1 + Num2.

% Sumar 1 a todos los elementos de una lista
imprimir_suma1([Num|MasNums]) :- sumar1(Num, NumOut), writeln(NumOut), imprimir_suma1(MasNums).
imprimir_suma1([]).

% Map con suma1
map_suma1(InNums, OutNums) :- map_suma1_aux(InNums, [], OutNums).
map_suma1_aux(InNums, AuxNums, OutNums) :-
                      InNums = [Num | MasNums],
                      sumar1(Num, OutNum),
                      append(AuxNums, [OutNum], AuxNums2),
                      map_suma1_aux(MasNums, AuxNums2, OutNums).
map_suma1_aux([], OutNums, OutNums).