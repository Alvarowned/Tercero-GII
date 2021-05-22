% Autor:
% Fecha: 02/02/2020

% Declaramos mujeres
mujer(antonioAndolini, madreVito).
mujer(vitoCorleone, carmella).
mujer(michael, kayAdams).
mujer(santino_sonny, sandra).
mujer(carloRizzi, constanzia_connie).
mujer(frederico_fredo, deannaDunn).
mujer(tomHagen, theresa).

% Declaramos exmujeres
exmujer(michael, apolloniaVitelli).
exmujer(santino_sonny, lucyMancini).

% Declaramos padres
padre(vitoCorleone, antonioAndolini).
padre(michael, vitoCorleone).
padre(santino_sonny, vitoCorleone).
padre(constanzia_connie, vitoCorleone).
padre(frederico_fredo, vitoCorleone).
padre(tomHagen, vitoCorleone).
padre(vincentMancini, santino_sonny).
padre(santinoJr, santino_sonny).
padre(francessa, santino_sonny).
padre(kathryn, santino_sonny).
padre(frank_sonny, santino_sonny).
padre(victor, carloRizzi).
padre(michaelFrancis, carloRizzi).
padre(frank_hagen, tomHagen).
padre(andrew, tomHagen).
padre(gianna, tomHagen).

% Declaramos madres
madre(vitoCorleone, madreVito).
madre(michael, carmella).
madre(santino_sonny, carmella).
madre(constanzia_connie, carmella).
madre(frederico_fredo, carmella).
madre(tomHagen, carmella).
madre(vincentMancini, lucyMancini).
madre(santinoJr, sandra).
madre(francessa, sandra).
madre(kathryn, sandra).
madre(frank_sonny, sandra).
madre(victor, constanzia_connie).
madre(michaelFrancis, constanzia_connie).
madre(frank_hagen, theresa).
madre(andrew, theresa).
madre(gianna, theresa).

% Definición de hermanos, X es hermano de Y
hermanos(X, Hermanos) :- findall(Herm, hermanos_aux(X, Herm), HermanosAux),
                         sort(HermanosAux,Hermanos).
hermanos_aux(X, Hermano) :- padre(X, Z), padre(Hermano, Z), X \= Hermano.
hermanos_aux(X, Hermano) :- madre(X, Z), madre(Hermano, Z), X \= Hermano.

% Definición de hijos, Y es una lista con los hijos de X
hijos(Progenitor,Hijos) :- findall(Hijo, padre(Hijo, Progenitor), HijosP),
                           findall(Hijo, madre(Hijo, Progenitor), HijosM),
                           union(HijosP,HijosM,Hijos).

% Definición de ancestros, Y es ancestro de X si devuelve true
ancestro(X,Y) :- padre(X,Y).
ancestro(X,Y) :- madre(X,Y).
ancestro(X,Y) :- padre(X,Z), ancestro(Z,Y).
ancestro(X,Y) :- madre(X,Z), ancestro(Z,Y).

% Definición de descendientes, Y es la lista de descendientes de X de más lejano a más cercano
%descendientes(X,Y) :-