:-consult(diccionarioEspanol).

% Reglas gramaticales
oracion(s(GV)) --> g_verbal(GV,_,_).   % Sujeto omitido
oracion(s(GN,GV)) --> g_nominal(GN,_,Num), g_verbal(GV,Num,p3).   % Grupo nominal + Grupo verbal
oracion(s(PP,GV)) --> pron_pers(PP,P,_,Num), g_verbal(GV,Num,P).   % Pronombre personal + Grupo verbal
oracion(s(GN,GV,Conj,O)) --> g_nominal(GN,_,Num), g_verbal(GV,Num,p3), comp_conjuntivo(Conj), oracion_coor(O,Num,p3).   % Oraciones coordinadas con sujeto
oracion(s(PP,GV,Conj,O)) --> pron_pers(PP,P,_,Num), g_verbal(GV,Num,P), comp_conjuntivo(Conj), oracion_coor(O,Num,P).   % Oraciones coordinadas con pronombre
oracion_coor(cs(GV),Num,P) --> g_verbal(GV,Num,P).   % Un solo sujeto en la frase coordinada
oracion_coor(cs(GN,GV),_,_) --> g_nominal(GN,_,Num), g_verbal(GV,Num,p3).   % Grupo nominal + Grupo verbal   
oracion_coor(cs(PP,GV),_,_) --> pron_pers(PP,P,_,Num), g_verbal(GV,Num,P).   % Pronombre personal + Grupo verbal              
oracion_coor(cs(GN,GV,Conj,O),_,_) --> g_nominal(GN,_,Num), g_verbal(GV,Num,p3), comp_conjuntivo(Conj), oracion_coor(O,Num,p3).   % Oraciones coordinadas con sujeto
oracion_coor(cs(PP,GV,Conj,O),_,_) --> pron_pers(PP,P,_,Num), g_verbal(GV,Num,P), comp_conjuntivo(Conj), oracion_coor(O,Num,P).   % Oraciones coordinadas con pronombre                                                                                            
                                                                                                             % Las oraciones coordinadas estan separadas en dos grupos (sujeto y pronombre) porque si se pone 
                                                                                                             % como Oracion + Conjuncion + Oracion se llena la pila siempre debido a la recursividad

g_nominal(np(N),Gen,Num) --> nombre(N,Gen,Num,_).   % Nombre
g_nominal(np(N,Ap),Gen,Num) --> nombre(N,Gen,Num,p), nombre(Ap,_,Num,p).   % Nombre + Apellido
g_nominal(np(Det,N),Gen,Num) --> det(Det,Gen,Num), nombre(N,Gen,Num,c).   % Determinante + Nombre comun
g_nominal(np(Det,N,Adj),Gen,Num) --> det(Det,Gen,Num), nombre(N,Gen,Num,c), adjetivo(Adj,Gen,Num).   % Determinante + Nombre comun + Adjetivo
g_nominal(np(Det,N,CR),Gen,Num) --> det(Det,Gen,Num), nombre(N,Gen,Num,c), complemento_relativo(CR).   % Determinante + Nombre comun + Adjetivo + Complemento relativo
g_nominal(np(Det,N,Adj,CR),Gen,Num) --> det(Det,Gen,Num), nombre(N,Gen,Num,c), adjetivo(Adj,Gen,Num), complemento_relativo(CR).    % Determinante + Nombre comun + Adjetivo + Complemento relativo
g_nominal(np(Det,N,GPrep),Gen,Num) --> det(Det,Gen,Num), nombre(N,Gen,Num,c), g_preposicional(GPrep).   % Determinante + Nombre comun + Complemento circunstancial (preposicion)

g_verbal(vp(V),Num,P) --> verbo(V,Num,i,P).   % Verbo intransitivo
g_verbal(vp(V,GAdv),Num,P) --> verbo(V,Num,i,P), g_adverbial(GAdv).   % Verbo intransitivo + Grupo adverbial
g_verbal(vp(V,GPrep),Num,P) --> verbo(V,Num,_,P), g_preposicional(GPrep).   % Verbo + Complemento circunstancial (preposicional)
g_verbal(vp(V,Adj),Num,P) --> verbo(V,Num,t,P), adjetivo(Adj,_,Num).   % Verbo transitivo + Adjetivo
g_verbal(vp(V,Adj,GPrep),Num,P) --> verbo(V,Num,t,P), adjetivo(Adj,_,Num), g_preposicional(GPrep).   % Verbo transitivo + Adjetivo + Complemento circunstancial (preposicional)
g_verbal(vp(V,GN),Num,P) --> verbo(V,Num,_,P), g_nominal(GN,_,_).   % Verbo + Complemento directo
g_verbal(vp(V,GN,GPrep),Num,P) --> verbo(V,Num,_,P), g_nominal(GN,_,_), g_preposicional(GPrep).   % Verbo + Complemento directo + Complemento circunstancial (preposicional)

g_preposicional(pp(Prep,Det,N)) --> preposicion(Prep), det(Det,Gen,Num), nombre(N,Gen,Num,c).   % Preposicion + Grupo nominal
g_preposicional(pp(Prep,N)) --> preposicion(Prep), nombre(N,_,_,p).   % Preposicion + Nombre propio

g_adverbial(advp(Adv)) --> adverbio(Adv).   % Adverbio solo
g_adverbial(advp(Adv, GAdv)) --> adverbio(Adv), g_adverbial(GAdv).   % Adverbio + Grupo adverbial

complemento_relativo(relComp(PR,GV)) --> pron_relativo(PR), g_verbal_relativo(GV).   % Pronombre relativo + Grupo verbal
complemento_relativo(relComp(PR,O)) --> pron_relativo(PR), oracion_rel(O).   % Pronombre relativo + Oracion

g_verbal_relativo(relVP(V,N)) --> verbo(V,sg,_,p3), nombre(N,_,_,p).
g_verbal_relativo(relVP(V,N)) --> nombre(N,_,_,p), verbo(V,sg,_,p3).
g_verbal_relativo(relVP(V,Det,N)) --> verbo(V,Num,_,p3), det(Det,Gen,Num), nombre(N,Gen,Num,c).
g_verbal_relativo(relVP(V,Det,N)) --> det(Det,Gen,Num), nombre(N,Gen,Num,c), verbo(V,Num,_,p3).

oracion_rel(s(persPron(persPron_1),GV)) --> g_verbal(GV,sg,p1).
oracion_rel(s(persPron(persPron_2),GV)) --> g_verbal(GV,sg,p2).
oracion_rel(s(persPron(persPron_3),GV)) --> g_verbal(GV,sg,p3).
oracion_rel(s(persPron(persPron_5),GV)) --> g_verbal(GV,pl,p1).
oracion_rel(s(persPron(persPron_6),GV)) --> g_verbal(GV,pl,p2).
oracion_rel(s(persPron(persPron_7),GV)) --> g_verbal(GV,pl,p3).   % Sujeto omitido en relativas
oracion_rel(s(GN,GV)) --> g_nominal(GN,_,Num), g_verbal(GV,Num,p3).   % Grupo nominal + Grupo verbal
oracion_rel(s(PP,GV)) --> pron_pers(PP,P,_,Num), g_verbal(GV,Num,P).   % Pronombre personal + Grupo verbal
