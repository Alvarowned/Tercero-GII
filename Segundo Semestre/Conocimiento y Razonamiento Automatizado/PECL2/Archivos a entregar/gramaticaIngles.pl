:-consult(diccionarioIngles).
:-consult(draw).

% Reglas gramaticales
sentence(s(VP)) --> verbal_phrase(VP,_).   % Sujeto omitido
sentence(s(NP, VP)) --> noun_phrase_subj(NP,sg), verbal_phrase(VP,p3).   % Grupo nominal + Grupo verbal (sujeto singular)
sentence(s(NP, VP)) --> noun_phrase_subj(NP,pl), verbal_phrase(VP,p2).   % Grupo nominal + Grupo verbal (sujeto plural)
sentence(s(PP, VP)) --> pers_pronoun(PP,P,sg), verbal_phrase(VP,P).   % Pronombre personal + Grupo verbal (sujeto singular)
sentence(s(PP, VP)) --> pers_pronoun(PP,_,pl), verbal_phrase(VP,p2).   % Pronombre personal + Grupo verbal (sujeto plural)
sentence(s(NP,VP,Conj,CS)) --> noun_phrase_subj(NP,sg), verbal_phrase(VP,p3), conj_complement(Conj), coor_sentence(CS,p3).   % Oraciones coordinadas con sujeto singular
sentence(s(NP,VP,Conj,CS)) --> noun_phrase_subj(NP,pl), verbal_phrase(VP,p2), conj_complement(Conj), coor_sentence(CS,p2).   % Oraciones coordinadas con sujeto plural
sentence(s(PP,VP,Conj,CS)) --> pers_pronoun(PP,P,sg), verbal_phrase(VP,P), conj_complement(Conj), coor_sentence(CS,P).   % Oraciones coordinadas con pronombre singular
sentence(s(PP,VP,Conj,CS)) --> pers_pronoun(PP,_,pl), verbal_phrase(VP,p2), conj_complement(Conj), coor_sentence(CS,p2).   % Oraciones coordinadas con pronombre plural
coor_sentence(cs(VP),P) --> verbal_phrase(VP,P).   % Un solo sujeto en la frase coordinada
coor_sentence(cs(NP,VP),_) --> noun_phrase_subj(NP,sg), verbal_phrase(VP,p3).   % Grupo nominal + Grupo verbal   
coor_sentence(cs(NP,VP),_) --> noun_phrase_subj(NP,pl), verbal_phrase(VP,p2).
coor_sentence(cs(PP,VP),_) --> pers_pronoun(PP,P,sg), verbal_phrase(VP,P).   % Pronombre personal + Grupo verbal   
coor_sentence(cs(PP,VP),_) --> pers_pronoun(PP,_,pl), verbal_phrase(VP,p2).           
coor_sentence(cs(NP,VP,Conj,CS),_) --> noun_phrase_subj(NP,sg), verbal_phrase(VP,p3), conj_complement(Conj), coor_sentence(CS,p3).   % Oraciones coordinadas con sujeto
coor_sentence(cs(NP,VP,Conj,CS),_) --> noun_phrase_subj(NP,pl), verbal_phrase(VP,p2), conj_complement(Conj), coor_sentence(CS,p2).
coor_sentence(cs(PP,VP,Conj,CS),_) --> pers_pronoun(PP,P,sg), verbal_phrase(VP,P), conj_complement(Conj), coor_sentence(CS,P).   % Oraciones coordinadas con pronombre 
coor_sentence(cs(PP,VP,Conj,CS),_) --> pers_pronoun(PP,_,pl), verbal_phrase(VP,p2), conj_complement(Conj), coor_sentence(CS,p2).
                                                                                                             % Las oraciones coordinadas estan separadas en dos grupos (sujeto y pronombre) porque si se pone 
                                                                                                             % como Oracion + Conjuncion + Oracion se llena la pila siempre debido a la recursividad

% Para sujetos
noun_phrase_subj(np(N),sg) --> noun(N,_,sg,p,_,_).   % Nombre propio
noun_phrase_subj(np(N,Ap),sg) --> noun(N,_,sg,p,_,_), noun(Ap,_,sg,p,_,_).   % Nombre propio + Apellido
noun_phrase_subj(np(N),pl) --> modifier(m(det_2),pl,_), noun(N,_,pl,c,_,_).   % Composicon con some + Nombre comun plural
noun_phrase_subj(np(N),pl) --> noun(N,_,pl,c,_,_).   % Composicon con some + Nombre comun plural
noun_phrase_subj(np(M,N),Num) --> modifier(M,Num,Voc), noun(N,_,Num,c,Voc,_).   % Determinante + Nombre comun
noun_phrase_subj(np(M,N,Adj),Num) --> modifier(M,Num,Voc), adjective(Adj,Voc), noun(N,_,Num,c,_,_).   % Determinante + Nombre comun + Adjetivo
noun_phrase_subj(np(M,N,RC),Num) --> modifier(M,Num,Voc), noun(N,_,Num,c,Voc,_), relative_complement(RC).   % Determinante + Nombre comun + Adjetivo + Complemento relativo
noun_phrase_subj(np(M,N,Adj,RC),Num) --> modifier(M,Num,Voc), adjective(Adj,Voc), noun(N,_,Num,c,_,_), relative_complement(RC).    % Determinante + Nombre comun + Adjetivo + Complemento relativo
noun_phrase_subj(np(M,N,GPrep),Num) --> modifier(M,Num,Voc), noun(N,_,Num,c,Voc,_), prep_group(GPrep).   % Determinante + Nombre comun + Complemento circunstancial (preposicion)

% Para complementos (no aparecen nombres propios)
noun_phrase_comp(np(m(det_1),n(n_17)),Num) --> noun(n(n_17),_,Num,c,_,_).   % Determinante + Nombre comun (LA UNIVERSIDAD CASO ESPECIAL)
noun_phrase_comp(np(N),pl) --> modifier(m(det_2),pl,_), noun(N,_,pl,c,_,_).   % Composicon con some + Nombre comun plural
noun_phrase_comp(np(N),pl) --> noun(N,_,pl,c,_,_).   % Composicon con some + Nombre comun plural
noun_phrase_comp(np(M,N),Num) --> modifier(M,Num,Voc), noun(N,_,Num,c,Voc,_).   % Determinante + Nombre comun
noun_phrase_comp(np(M,N,Adj),Num) --> modifier(M,Num,Voc), adjective(Adj,Voc), noun(N,_,Num,c,_,_).   % Determinante + Nombre comun + Adjetivo
noun_phrase_comp(np(M,N,RC),Num) --> modifier(M,Num,Voc), noun(N,_,Num,c,Voc,_), relative_complement(RC).   % Determinante + Nombre comun + Adjetivo + Complemento relativo
noun_phrase_comp(np(M,N,Adj,RC),Num) --> modifier(M,Num,Voc), adjective(Adj,Voc), noun(N,_,Num,c,_,_), relative_complement(RC).    % Determinante + Nombre comun + Adjetivo + Complemento relativo
noun_phrase_comp(np(M,N,GPrep),Num) --> modifier(M,Num,Voc), noun(N,_,Num,c,Voc,_), prep_group(GPrep).   % Determinante + Nombre comun + Complemento circunstancial (preposicion)

verbal_phrase(vp(V),P) --> verb(V,P).   % Verbo intransitivo
verbal_phrase(vp(V,Advp),P) --> verb(V,P), adv_phrase(Advp).   % Verbo intransitivo + Grupo adverbial
verbal_phrase(vp(V,GPrep),P) --> verb(V,P), prep_group(GPrep).   % Verbo + Complemento circunstancial (preposicional)
verbal_phrase(vp(V,Adj),P) --> verb(V,P), adjective(Adj,_).   % Verbo transitivo + Adjetivo
verbal_phrase(vp(V,Adj,GPrep),P) --> verb(V,P), adjective(Adj,_), prep_group(GPrep).   % Verbo transitivo + Adjetivo + Complemento circunstancial (preposicional)
verbal_phrase(vp(V,NP),P) --> verb(V,P), noun_phrase_comp(NP,_).   % Verbo + Complemento directo
verbal_phrase(vp(V,NP,GPrep),P) --> verb(V,P), noun_phrase_comp(NP,_), prep_group(GPrep).   % Verbo + Complemento directo + Complemento circunstancial (preposicional)

prep_group(pp(prep(prep_2),NP)) --> noun(NP,_,_,p,_,_).   % Preposicion + Nombre propio (a)
prep_group(pp(Prep,m(det_1),NP)) --> preposition(Prep,at), noun(NP,_,_,_,_,at).   % Preposicion + Nombre (at)
prep_group(pp(Prep,M,NP)) --> preposition(Prep,in), modifier(M,Num,Voc), noun(NP,_,Num,_,Voc,in).   % Preposicion + Nombre (in)

adv_phrase(advp(Adv)) --> adverb(Adv).   % Adverbio solo
adv_phrase(advp(Adv, Advp)) --> adverb(Adv), adv_phrase(Advp).   % Adverbio + Grupo adverbial

relative_complement(relComp(PR,VP)) --> rel_pronoun(PR), rel_verbalP(VP).   % Pronombre relativo + Grupo verbal
relative_complement(relComp(PR,S)) --> rel_pronoun(PR), sentence(S).   % Pronombre relativo + Oracion
rel_verbalP(relVP(V,N)) --> noun(N,_,_,p,_,_), verb(V,p3).
rel_verbalP(relVP(V,Det,N)) --> modifier(Det,sg,Voc), noun(N,_,sg,c,Voc,P), verb(V,P).
