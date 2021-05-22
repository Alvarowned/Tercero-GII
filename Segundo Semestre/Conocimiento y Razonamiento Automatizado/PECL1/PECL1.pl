/* Logica basica del juego
   tablero-jugador--> (lineas de patron (lista de listas de tamaño diferente), pared (lista de listas igual tamaño),
                    linea de suelo (lista)) --> tableroJudador(numJugador, juega?, [lineasPatron], [Pared], [lineaSuelo])
   mesa--> (factoria (lista de 4 elem al azar, (2 jugadores --> 5 factorias),(3 jugadores --> 7 factorias), (4 jugadores --> 9 factorias))
        centro de la mesa (lista de fichas descartadas de las factorias, se puede elegir de la lista de factorias o de la mesa),
        bolcha de fichas (lista original de la que se sacan las piezas de las factorias),
        caja de fichas (lista de fichas sobrantes depues de montar el mosaico)) --> mesa([[facto1]....[facto9]],[bolsaFichas],[cajaFichas])
   Preparacion de ronda--> seguir apartado C (HECHO)
   Oferta de factoria--> seguir seccion A, turno del jugador, elegir fichas del mismo color (de una factoría o centro) y colocarlas en las lineas de patron (linea de suelo
                         las que sobren)
   Alicatado de pared--> aplicacion parcial de las reglas de la seccion B de azul sin contar puntos
   Interfaz por consola--> la mayor mierda que salga/ocurra sin ningun tipo de floritura (seguir ideologia de mientras funcione nos vale)(dudoso)*/

tableroJugador([[[x], [x,x], [x,x,x], [x,x,x,x], [x,x,x,x,x]],   % líneas de patrón
               [[x,x,x,x,x], [x,x,x,x,x], [x,x,x,x,x], [x,x,x,x,x], [x,x,x,x,x]],     % fachada
               [x,x,x,x,x,x,x]]).   % línea de suelo

mesa2([[[x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x]],           % factorias para 2 jugadores
      [],        % centro de la mesa
      [[20, a], [20, y], [20, r], [20, n], [20, b]],         % bolsa de fichas
      [[0, a], [0, y], [0, r], [0, n], [0, b]]]).     % caja de fichas

mesa3([[[x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x]],      % factorias para 3 jugadores
      [],        % centro de la mesa
      [[20, a], [20, y], [20, r], [20, n], [20, b]],         % bolsa de fichas
      [[0, a], [0, y], [0, r], [0, n], [0, b]]]).     % caja de fichas
      
mesa4([[[x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x], [x,x,x,x]],   % factorias para 4 jugadores
      [],        % centro de la mesa
      [[20, a], [20, y], [20, r], [20, n], [20, b]],         % bolsa de fichas
      [[0, a], [0, y], [0, r], [0, n], [0, b]]]).     % caja de fichas

% Colores válidos
color(a).
color(y).
color(r).
color(n).
color(b).

% Números válidos para elección de Factoria o Centro
numFoC(1).
numFoC(2).

% Números válidos para la elección de factoría 2Jug
nFact2Jug(1).
nFact2Jug(2).
nFact2Jug(3).
nFact2Jug(4).
nFact2Jug(5).

% Números válidos para la elección de factoría 3Jug
nFact3Jug(1).
nFact3Jug(2).
nFact3Jug(3).
nFact3Jug(4).
nFact3Jug(5).
nFact3Jug(6).
nFact3Jug(7).

% Números válidos para la elección de factoría 4Jug
nFact4Jug(1).
nFact4Jug(2).
nFact4Jug(3).
nFact4Jug(4).
nFact4Jug(5).
nFact4Jug(6).
nFact4Jug(7).
nFact4Jug(8).
nFact4Jug(9).


% Preparación de ronda
preparacionMesa(mesa2, MesaFin) :- mesa2(MesaIni), !, preparacionMesa(MesaIni, MesaFin).
preparacionMesa(mesa3, MesaFin) :- mesa3(MesaIni), !, preparacionMesa(MesaIni, MesaFin).
preparacionMesa(mesa4, MesaFin) :- mesa4(MesaIni), !, preparacionMesa(MesaIni, MesaFin).
preparacionMesa(MesaIni, MesaFin) :- MesaIni = [[_|BFactIni], CentroIni, BolsaIni, CajaIni],
                                     BFactIni \= [], !,
                                     preparacionFactoria(4, BolsaIni, CajaIni, HFactFin, BolsaFinAux, CajaFinAux),
                                     MesaIniAux = [BFactIni, CentroIni, BolsaFinAux, CajaFinAux],
                                     preparacionMesa(MesaIniAux, MesaFinAux),
                                     MesaFinAux = [BFactFin, _, BolsaFin, CajaFin],
                                     append([HFactFin], BFactFin, FactFin),
                                     MesaFin = [FactFin, CentroIni, BolsaFin, CajaFin];
                                     MesaIni = [_, CentroIni, BolsaIni, CajaIni],
                                     preparacionFactoria(4, BolsaIni, CajaIni, HFactFin, BolsaFin, CajaFin),
                                     MesaFin = [[HFactFin], CentroIni, BolsaFin, CajaFin], !.

preparacionFactoria(0, BolsaIni, CajaIni, [], BolsaIni, CajaIni) :- !.
preparacionFactoria(Longitud, BolsaIni, CajaIni, [HFactFin|BFactFin], BolsaFin, CajaFin) :-
                                                          bolsaVacia(BolsaIni, Vacia), Vacia == true,
                                                          pasarCajaABolsa(CajaIni, CajaFinAux, BolsaFinAux),
                                                          repeat,
                                                          random(0, 5, Rand),
                                                          nth0(Rand, BolsaFinAux, FichaInfo, RestoBolsa),
                                                          nth0(0, FichaInfo, NumFichas),
                                                          NumFichas > 0, !,
                                                          NumFichasFin is NumFichas - 1,
                                                          nth0(1, FichaInfo, ColorFicha),
                                                          HFactFin = ColorFicha,
                                                          nth0(Rand, BolsaFinAux2, [NumFichasFin, ColorFicha], RestoBolsa),
                                                          LongitudAux is Longitud - 1,
                                                          preparacionFactoria(LongitudAux, BolsaFinAux2, CajaFinAux, BFactFin, BolsaFin, CajaFin);
                                                          CajaFinAux = CajaIni,
                                                          repeat,
                                                          random(0, 5, Rand),
                                                          nth0(Rand, BolsaIni, FichaInfo, RestoBolsa),
                                                          nth0(0, FichaInfo, NumFichas),
                                                          NumFichas > 0, !,
                                                          NumFichasFin is NumFichas - 1,
                                                          nth0(1, FichaInfo, ColorFicha),
                                                          HFactFin = ColorFicha,
                                                          nth0(Rand, BolsaFinAux, [NumFichasFin, ColorFicha], RestoBolsa),
                                                          LongitudAux is Longitud - 1,
                                                          preparacionFactoria(LongitudAux, BolsaFinAux, CajaFinAux, BFactFin, BolsaFin, CajaFin).

% Comprueba si la bolsa está vacía
bolsaVacia([HBolsa|BBolsa], Vacia) :- nth0(0, HBolsa, NumFichas),
                                      NumFichas == 0, bolsaVacia(BBolsa, Vacia), !;
                                      Vacia = false.
bolsaVacia([], true).

% Pasa las fichas de la caja a la bolsa
pasarCajaABolsa(CajaIni, CajaFin, BolsaFin) :- BolsaFin = CajaIni,
                                               CajaFin = [[0, a], [0, y], [0, r], [0, n], [0, b]].

% Fin de preparación de ronda


% Oferta de factoría
ofertaDeFactoria(2, TabIn, MesaIn, TabOut, MesaOut) :- TabIn = [TabJ1, TabJ2],
                                                       MesaAux = MesaIn, Terminado = false,
                                                       repeat,
                                                       turnoIndividual(Terminado, 1, 2, TabJ1, MesaAux, TabJ1Out, MesaOut1),
                                                       MesaAux = MesaOut1, TabJ1 = TabJ1Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       turnoIndividual(Terminado, 2, 2, TabJ2, MesaAux, TabJ2Out, MesaOut2),
                                                       MesaAux = MesaOut2, TabJ2 = TabJ2Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       Terminado == true,
                                                       MesaOut = MesaAux, TabOut = [TabJ1, TabJ2].
                                                       
ofertaDeFactoria(3, TabIn, MesaIn, TabOut, MesaOut) :- TabIn = [TabJ1, TabJ2, TabJ3],
                                                       MesaAux = MesaIn, Terminado = false,
                                                       repeat,
                                                       turnoIndividual(Terminado, 1, 3, TabJ1, MesaAux, TabJ1Out, MesaOut1),
                                                       MesaAux = MesaOut1, TabJ1 = TabJ1Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       turnoIndividual(Terminado, 2, 3, TabJ2, MesaAux, TabJ2Out, MesaOut2),
                                                       MesaAux = MesaOut2, TabJ2 = TabJ2Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       turnoIndividual(Terminado, 3, 3, TabJ3, MesaAux, TabJ3Out, MesaOut3),
                                                       MesaAux = MesaOut3, TabJ3 = TabJ3Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       Terminado == true,
                                                       MesaOut = MesaAux, TabOut = [TabJ1, TabJ2, TabJ3].
                                                       
ofertaDeFactoria(4, TabIn, MesaIn, TabOut, MesaOut) :- TabIn = [TabJ1, TabJ2, TabJ3],
                                                       MesaAux = MesaIn, Terminado = false,
                                                       repeat,
                                                       turnoIndividual(Terminado, 1, 4, TabJ1, MesaAux, TabJ1Out, MesaOut1),
                                                       MesaAux = MesaOut1, TabJ1 = TabJ1Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       turnoIndividual(Terminado, 2, 4, TabJ2, MesaAux, TabJ2Out, MesaOut2),
                                                       MesaAux = MesaOut2, TabJ2 = TabJ2Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       turnoIndividual(Terminado, 3, 4, TabJ3, MesaAux, TabJ3Out, MesaOut3),
                                                       MesaAux = MesaOut3, TabJ3 = TabJ3Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       turnoIndividual(Terminado, 4, 4, TabJ4, MesaAux, TabJ4Out, MesaOut4),
                                                       MesaAux = MesaOut4, TabJ4 = TabJ4Out,
                                                       mesaVacia(MesaAux, Terminado),
                                                       Terminado == true,
                                                       MesaOut = MesaAux, TabOut = [TabJ1, TabJ2, TabJ3, TabJ4].
                                                       
turnoIndividual(true, _, _, TabIn, MesaIn, TabIn, MesaIn).
turnoIndividual(false, NumJug, Jugs, TabIn, MesaIn, TabOut, MesaOut) :-
                                                                  write("- TURNO DEL JUGADOR "), write(NumJug), writeln(": "),
                                                                  TabIn = [LinPatronIn, FachIn, LinSueloIn], MesaIn = [FactsIn, CentroIn, BolsaIn, CajaIn],
                                                                  imprimirMesa(MesaIn), imprimirTableroJugador(TabIn),
                                                                  readFoC(FactsIn, CentroIn, FoC), FoC == 1, !,
                                                                  readFactoriaCorrecta(Jugs, FactsIn, NF),
                                                                  nth1(NF, FactsIn, FactoriaIni, RestoFactorias),
                                                                  readColorCorrecto(FactoriaIni, ColorIn),
                                                                  sacarFichas(FactoriaIni, ColorIn, FactoriaOut, Mano),
                                                                  nth1(NF, FactsOut, FactoriaOut, RestoFactorias),
                                                                  introducirEnLinPatron(Mano, LinPatronIn, LinSueloIn, LinPatronOut, LinSueloOut),
                                                                  TabOut = [LinPatronOut, FachIn, LinSueloOut], MesaOut = [FactsOut, CentroIn, BolsaIn, CajaIn];
                                                                  TabIn = [LinPatronIn, FachIn, LinSueloIn], MesaIn = [FactsIn, CentroIn, BolsaIn, CajaIn],
                                                                  readColorCorrecto(CentroIn, ColorIn),
                                                                  sacarFichas(CentroIn, ColorIn, CentroOut, Mano),
                                                                  introducirEnLinPatron(Mano, LinPatronIn, LinSueloIn, LinPatronOut, LinSueloOut),
                                                                  TabOut = [LinPatronOut, FachIn, LinSueloOut], MesaOut = [FactsIn, CentroOut, BolsaIn, CajaIn].

introducirEnLinPatron(Mano, LinPatronIn, LinSueloIn, LinPatronOut, LinSueloOut) :-
                                                                  Mano = [NumFichas, Color],
                                                                  leerLinPatron(LinPatronIn, Color, NLinPatron),
                                                                  nth1(NLinPatron, LinPatronIn, LPAux, RestoLP),
                                                                  insertarEnLP(NumFichas, Color, LPAux, LinSueloIn, LPOut, LinSueloOut),
                                                                  nth1(NLinPatron, LinPatronOut, LPOut, RestoLP).

insertarEnLP(0, _, LPIn, LSIn, LPIn, LSIn) :- !.
insertarEnLP(NF, Color, [], [HLSIn|BLSIn], LPOut, LSOut) :- HLSIn == 'x', !, NFAux is NF - 1,
                                                            insertarEnLP(NFAux, Color, [], BLSIn, LPOut, LSAux), append([Color], LSAux, LSOut);
                                                            !, insertarEnLP(NF, Color, [], BLSIn, LPOut, LSAux), append([HLSIn], LSAux, LSOut).
insertarEnLP(NF, Color, [HLPIn|BLPIn], LSIn, LPOut, LSOut) :- HLPIn == Color, !, insertarEnLP(NF, Color, BLPIn, LSIn, LPOutAux, LSOut), append([Color], LPOutAux, LPOut);
                                                              HLPIn == 'x', !, NFAux is NF - 1,
                                                              insertarEnLP(NFAux, Color, BLPIn, LSIn, LPOutAux, LSOut), append([Color], LPOutAux, LPOut).
                                                              
                                                                  
leerLinPatron(LPatronIn, Color, NLP) :- repeat, write("¿Que linea de patron desea rellenar?: "),
                                        read(NLP), nth1(NLP, LPatronIn, LPAux),
                                        comprobarValidezLPatron(LPAux, Color, Valida), Valida == true.
                                        
comprobarValidezLPatron(LP, Color, Valida) :- filaVacia(LP, Valida), Valida == true, !;
                                              mismoColor(LP, Color, Valida), Valida == true, !;
                                              writeln("Esa linea de patron no es valida."), Valida = false.

mismoColor([], _, true) :- !.
mismoColor([HLP|BLP], Color, Valida) :- HLP == Color, !, mismoColor(BLP, Color, Valida);
                                        HLP == 'x', !, mismoColor(BLP, Color, Valida);
                                        Valida = false.

sacarFichas(FactIn, Color, FactOut, ManoOut) :- sacarFichasAux(0, FactIn, Color, FactOut, ManoOut).
sacarFichasAux(Cont, [], Color, [], ManoOut) :- ManoOut = [Cont, Color], !.
sacarFichasAux(Cont, [HFactIn|BFactIn], Color, FactOut, ManoOut) :- HFactIn == Color, !,
                                                                    ContAux is Cont + 1,
                                                                    sacarFichasAux(ContAux, BFactIn, Color, FactOutAux, ManoOut),
                                                                    append(['x'], FactOutAux, FactOut);
                                                                    sacarFichasAux(Cont, BFactIn, Color, FactOutAux, ManoOut),
                                                                    append([HFactIn], FactOutAux, FactOut).

readFoC(FactsIn, CentroIn, FoCOut) :- repeat, write("¿Desea coger fichas de una factoria (1) o del centro (2)?: "),
                                      read(FoCOut), numFoC(FoCOut), comprobarValidezFoC(FoCOut, FactsIn, CentroIn, Vacia), \+Vacia.
comprobarValidezFoC(1, FactsIn, _, Vacia) :- factoriasVacias(FactsIn, Vacia), Vacia == true, !,
                                             writeln("Las factorias estan vacias.");
                                             Vacia = false.
comprobarValidezFoC(2, _, CentroIn, Vacia) :- filaVacia(CentroIn, Vacia), Vacia == true, !, writeln("El centro esta vacio.");
                                              Vacia = false.
                   
readFactoriaCorrecta(2, FactsIn, NFactOut) :- repeat, write("¿De que factoria desea cogerlas? "),
                                              read(NFactOut), nFact2Jug(NFactOut),
                                              nth1(NFactOut, FactsIn, Factoria),
                                              comprobarValidezFact(Factoria, Vacia), \+Vacia.
readFactoriaCorrecta(3, FactsIn, NFactOut) :- repeat, write("¿De que factoria desea cogerlas? "),
                                              read(NFactOut), nFact3Jug(NFactOut),
                                              nth1(NFactOut, FactsIn, Factoria),
                                              comprobarValidezFact(Factoria, Vacia), \+Vacia.
readFactoriaCorrecta(4, FactsIn, NFactOut) :- repeat, write("¿De que factoria desea cogerlas? "),
                                              read(NFactOut), nFact4Jug(NFactOut),
                                              nth1(NFactOut, FactsIn, Factoria),
                                              comprobarValidezFact(Factoria, Vacia), \+Vacia.
comprobarValidezFact(FactIn, Vacia) :- filaVacia(FactIn, Vacia), Vacia == true, !,
                                       writeln("Esa factoria esta vacia.");
                                       Vacia = false.
                                             
readColorCorrecto(FactIn, ColorOut) :- repeat, write("¿Que color de fichas quiere coger (a,y,n,r,b)? "),
                                       read(ColorOut), color(ColorOut), member(ColorOut, FactIn).

mesaVacia(MesaIn, Vacia) :- MesaIn = [Fact, Centro, _, _],
                            factoriasVacias(Fact, FactVac),
                            filaVacia(Centro, CentVac),
                            FactVac == true, CentVac == true,
                            Vacia = true, !;
                            Vacia = false.

factoriasVacias([], true).
factoriasVacias([HFact|BFact], Vacias) :- filaVacia(HFact, V),
                                          V == true,
                                          factoriasVacias(BFact, Empty),
                                          Vacias = Empty, !;
                                          Vacias = false.

filaVacia([], true) :- !.
filaVacia([HF|BF], Vacia) :- HF == 'x',
                             filaVacia(BF, V),
                             Vacia = V, !;
                             Vacia = false.



% IMPRESIÓN POR PANTALLA
                                                                                 
%imprimir mesa
imprimirMesa(Mesa) :-
      Mesa = [Fact,Centro,Bolsa,Caja],
      imprimirFactorias(Fact),
      imprimirCentro(Centro),
      imprimirBolsa(Bolsa),
      imprimirCaja(Caja).

%impresion de factorias
imprimirFactorias(Fact) :- mostrarFactorias(1,Fact).

mostrarFactorias(_,[]) :- !.
mostrarFactorias(Num,[HFact|BFact]) :-
      mostrarFactoriaAux(Num),
      mostrarFactoria(HFact),nl,
      NumAux is Num + 1,
      mostrarFactorias(NumAux,BFact).

mostrarFactoria([]) :- !.
mostrarFactoria([HFact|BFact]) :-
      mostrarFactoriaAux2(HFact),
      mostrarFactoria(BFact).

mostrarFactoriaAux(Num) :-  write("Factoria "),write(Num),write(": ").

mostrarFactoriaAux2(Pos) :-
      Pos == 'x', !, write("[ ]");
      write("["),write(Pos),write("]").

%impresion del centro de la mesa
imprimirCentro(Centro) :- nl, write("Centro de mesa: "), mostrarCentro(Centro),nl.

mostrarCentro([]) :- !.
mostrarCentro([HCentro|BCentro]) :-
      mostrarCentroAux(HCentro),
      mostrarCentro(BCentro).

mostrarCentroAux(Pos) :-
      Pos == 'x', !, write("[ ]");
      write("["),write(Pos),write("]").

%imprimir Bolsa
imprimirBolsa(Bolsa) :- nl,write("Bolsa: "), mostrarBolsa(Bolsa),nl.

mostrarBolsa([]) :- !.
mostrarBolsa([HBolsa|BBolsa]) :-
      mostrarColorBolsa(HBolsa),
      mostrarBolsa(BBolsa).

mostrarColorBolsa(Bolsa) :- write(Bolsa).

%imprimir caja
imprimirCaja(Caja) :- nl,write("Caja: "), mostrarCaja(Caja),nl.

mostrarCaja([]) :- !.
mostrarCaja([HCaja|BCaja]) :-
      mostrarColorCaja(HCaja),
      mostrarCaja(BCaja).

mostrarColorCaja(Caja) :- write(Caja).

%Imprimir tablero jugador
imprimirTableroJugador(Tablero) :-
      Tablero = [Patron, Fachada, Suelo],
      imprimirFachada(Fachada),
      imprimirPatron(Patron),
      imprimirLineaSuelo(Suelo), !.

%impresion de linea de suelo
imprimirLineaSuelo(Suelo) :-
      nl, Suelo == 'x', !, write("[ ]");
      write("Linea de suelo: "),write(Suelo),nl.

%impresion fachada
imprimirFachada(Fachada) :- write("Fachada: "),nl,mostrarFachada(Fachada).

mostrarFachada([]) :- !.
mostrarFachada([HFachada|BFachada]) :-
      mostrarFachadaAux(HFachada),
      mostrarFachada(BFachada).

mostrarFachadaAux(LineaFachada) :-
      LineaFachada == 'x', !, write("[ ]");
      write(LineaFachada), nl.

%impresion patron
imprimirPatron(Patron) :- nl, write("Lineas de Patron: "),nl, mostrarPatron(Patron).

mostrarPatron([]) :- !.
mostrarPatron([HPatron|BPatron]) :-
      mostrarPatronAux(HPatron),
      mostrarPatron(BPatron).

mostrarPatronAux(Pos) :-
      Pos == 'x', !, write("[ ]");
      write(Pos),nl.

%Fin de impresiones por pantalla