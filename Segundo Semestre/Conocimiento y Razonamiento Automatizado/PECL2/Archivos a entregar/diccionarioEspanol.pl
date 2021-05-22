% Determinantes
det(m(det_1),f,sg) --> [la].
det(m(det_1),m,sg) --> [el].
det(m(det_1),m,pl) --> [los].
det(m(det_1),f,pl) --> [las].
det(m(det_2),m,sg) --> [un].
det(m(det_2),f,sg) --> [una].
det(m(det_2),m,pl) --> [unos].
det(m(det_2),f,pl) --> [unas].
det(m(det_3),_,sg) --> [mi].
det(m(det_3),_,pl) --> [mis].

% Pronombres personales
% p1 / p2 / p3 --> Persona
% m / f --> Masculino / Femenino
% sg / pl --> Singular / Plural
pron_pers(persPron(persPron_1),p1,_,sg) --> [yo].
pron_pers(persPron(persPron_2),p2,_,sg) --> [tu].
pron_pers(persPron(persPron_3),p3,m,sg) --> [el].
pron_pers(persPron(persPron_4),p3,f,sg) --> [ella].
pron_pers(persPron(persPron_5),p1,m,pl) --> [nosotros].
pron_pers(persPron(persPron_5),p1,f,pl) --> [nosotras].
pron_pers(persPron(persPron_6),p2,m,pl) --> [vosotros].
pron_pers(persPron(persPron_6),p2,f,pl) --> [vosotras].
pron_pers(persPron(persPron_7),p3,m,pl) --> [ellos].
pron_pers(persPron(persPron_7),p3,f,pl) --> [ellas].

% Nombres
% m / f --> Masculino / Femenino
% sg / pl --> Singular / Plural
% c / p --> Comun / Propio
nombre(n(n_1),m,sg,c) --> [hombre].
nombre(n(n_2),m,pl,c) --> [hombres].
nombre(n(n_3),f,sg,c) --> [mujer].
nombre(n(n_4),f,pl,c) --> [mujeres].

nombre(n(n_5),m,sg,c) --> [gato].
nombre(n(n_6),m,pl,c) --> [gatos].

nombre(n(n_7),m,sg,c) --> [raton].
nombre(n(n_8),m,pl,c) --> [ratones].

nombre(n(n_9),f,sg,c) --> [manzana].
nombre(n(n_10),f,pl,c) --> [manzanas].

nombre(n(n_11),m,sg,c) --> [alumno].
nombre(n(n_12),m,pl,c) --> [alumnos].

nombre(n(n_13),m,sg,p) --> [juan].

nombre(n(n_14),f,sg,p) --> [maria].

nombre(n(n_15),m,sg,c) --> [perro].
nombre(n(n_16),m,pl,c) --> [perros].

nombre(n(n_17),f,sg,c) --> [universidad].
nombre(n(n_18),f,pl,c) --> [universidades].

nombre(n(n_19),m,sg,c) --> [jardin].

nombre(n(n_20),m,sg,c) --> [vecino].
nombre(n(n_21),m,pl,c) --> [vecinos].

nombre(n(n_22),m,sg,c) --> [canario].

nombre(n(n_23),m,sg,c) --> [cafe].

nombre(n(n_24),m,sg,c) --> [periodico].

nombre(n(n_25),m,sg,p) --> [oscar].

nombre(n(n_26),m,sg,p) --> [wilde].

nombre(n(n_27),m,sg,c) --> [fantasma,de,canterville].

% Verbos
% sg / pl --> Singular / Plural
% t / i --> Transitivos / Intransitivos
% p1 / p2 / p3 --> Persona
verbo(vb(vb_1),sg,t,p3) --> [ama].
verbo(vb(vb_1),pl,t,p3) --> [aman].
verbo(vb(vb_2),sg,i,p2) --> [comes].
verbo(vb(vb_2),sg,i,p3) --> [come].
verbo(vb(vb_2),pl,i,p3) --> [comen].
verbo(vb(vb_3),sg,i,p3) --> [estudia].
verbo(vb(vb_3),pl,i,p3) --> [estudian].
verbo(vb(vb_4),sg,t,p3) --> [cazo].
verbo(vb(vb_4),pl,t,p3) --> [cazaron].
verbo(vb(vb_5),sg,t,p3) --> [era].
verbo(vb(vb_5),pl,t,p3) --> [eran].
verbo(vb(vb_6),sg,t,p3) --> [es].
verbo(vb(vb_6),pl,t,p3) --> [son].
verbo(vb(vb_7),sg,t,p3) --> [persiguio].
verbo(vb(vb_8),pl,i,p1) --> [vimos].
verbo(vb(vb_9),sg,i,p3) --> [canta].
verbo(vb(vb_10),sg,t,p3) --> [toma].
verbo(vb(vb_11),sg,i,p3) --> [lee].
verbo(vb(vb_12),sg,t,p3) --> [escribio].

% Adjetivos
adjetivo(adj(adj_1),m,sg) --> [negro].
adjetivo(adj(adj_1),f,sg) --> [negra].
adjetivo(adj(adj_2),_,sg) --> [grande].
adjetivo(adj(adj_3),_,sg) --> [gris].
adjetivo(adj(adj_4),m,sg) --> [rojo].
adjetivo(adj(adj_4),f,sg) --> [roja].
adjetivo(adj(adj_5),m,sg) --> [amarillo].
adjetivo(adj(adj_6),f,sg) --> [alta].
adjetivo(adj(adj_7),m,sg) --> [delgado].

% Adverbios
adverbio(adv(adv_1)) --> [ayer].
adverbio(adv(adv_2)) --> [muy].
adverbio(adv(adv_3)) --> [bien].

% Preposiciones
preposicion(prep(prep_1)) --> [en].
preposicion(prep(prep_2)) --> [a].

%Pronombres relativos
pron_relativo(relPron(relPron_1)) --> [que].

% Complementos conjuntivos
comp_conjuntivo(conjComp(conjComp_1)) --> [y].
