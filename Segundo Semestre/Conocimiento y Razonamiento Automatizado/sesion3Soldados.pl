% Autor:
% Fecha: 13/02/2020

soldado([john,15,3]).
soldado([peter,10,2]).
soldado([ryan,5,3]).

% Devuelve una lista L con todos los soldados
lista_soldados(L) :- findall(Soldado, soldado(Soldado), L).

% Selecciona el indice para un atacante y un defensor
seleccion_ata_def(Soldados, IndAt, IndDef) :- length(Soldados, Longitud),
                                              repeat,
                                              random(0, Longitud, IndAt),
                                              random(0, Longitud, IndDef),
                                              IndAt =\= IndDef, !.

ataque(Soldados, IndAt, IndDef, SoldadosOut) :- nth0(IndAt, Soldados, Atacante),
                                                nth0(IndDef, Soldados, Defensor),
                                                select(Atacante, Soldados, Aux1),
                                                select(Defensor, Aux1, Aux2),
                                                

/* ataque
lista_soldados
logica para un indice para atacante,
indice defensor y se llama a la funcion ataque,
el defensor quedara dañado y en la lista se sustituye la vida del defensor,
en el caso de que la vida del defensor sea < 0 se elimina de la lista,
esto se repite hasta que solo quede uno. */