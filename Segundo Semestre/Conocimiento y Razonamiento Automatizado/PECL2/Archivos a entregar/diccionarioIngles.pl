% Modifiers
modifier(m(det_1),_,_) --> [the].
modifier(m(det_2),sg,cons) --> [a].
modifier(m(det_2),sg,voc) --> [an].
modifier(m(det_2),pl,_) --> [some].
modifier(m(det_3),_,_) --> [my].

% Pronombres personales
% p1 / p2 / p3 --> Persona
% sg / pl --> Singular / Plural
pers_pronoun(persPron(persPron_1),p1,sg) --> [i].
pers_pronoun(persPron(persPron_2),p2,sg) --> [you].
pers_pronoun(persPron(persPron_3),p3,sg) --> [he].
pers_pronoun(persPron(persPron_4),p3,sg) --> [she].
pers_pronoun(persPron(persPron_5),p1,pl) --> [we].
pers_pronoun(persPron(persPron_6),p2,pl) --> [you].
pers_pronoun(persPron(persPron_7),p3,pl) --> [they].

% Nombres
% m / f --> Masculino / Femenino
% sg / pl --> Singular / Plural
% voc / cons --> Tipo de letra inicial
% at / in --> Tipo de preposicion que se usa con este nombre
noun(n(n_1),m,sg,c,cons,_) --> [man].
noun(n(n_2),m,pl,c,cons,_) --> [men].
noun(n(n_3),f,sg,c,cons,_) --> [woman].
noun(n(n_4),f,pl,c,cons,_) --> [women].

noun(n(n_5),_,sg,c,cons,_) --> [cat].
noun(n(n_6),_,pl,c,cons,_) --> [cats].

noun(n(n_7),_,sg,c,cons,_) --> [mouse].
noun(n(n_8),_,pl,c,cons,_) --> [mice].

noun(n(n_9),_,sg,c,voc,_) --> [apple].
noun(n(n_10),_,pl,c,voc,_) --> [apples].

noun(n(n_11),_,sg,c,cons,_) --> [student].
noun(n(n_12),_,pl,c,cons,_) --> [students].

noun(n(n_13),m,sg,p,cons,_) --> [john].

noun(n(n_14),f,sg,p,cons,_) --> [mary].

noun(n(n_15),_,sg,c,cons,_) --> [dog].
noun(n(n_16),_,pl,c,cons,_) --> [dogs].

noun(n(n_17),_,sg,c,voc,at) --> [university].
noun(n(n_18),_,pl,c,voc,_) --> [universities].

noun(n(n_19),_,sg,c,cons,in) --> [garden].

noun(n(n_20),_,sg,c,cons,_) --> [neighbour].
noun(n(n_21),_,pl,c,cons,_) --> [neighbours].

noun(n(n_22),_,sg,c,cons,_) --> [canary].

noun(n(n_23),_,sg,c,cons,_) --> [coffee].

noun(n(n_24),_,sg,c,cons,_) --> [newspaper].

noun(n(n_25),_,sg,p,voc,_) --> [oscar].

noun(n(n_26),_,sg,p,cons,_) --> [wilde].

noun(n(n_27),_,sg,c,cons,_) --> [canterville,ghost].

% Verbos
% p3 / rp --> 3rd Person / Rest of Persons
verb(vb(vb_1),p1) --> [love].
verb(vb(vb_1),p2) --> [love].
verb(vb(vb_1),p3) --> [loves].
verb(vb(vb_2),p1) --> [eat].
verb(vb(vb_2),p2) --> [eat].
verb(vb(vb_2),p3) --> [eats].
verb(vb(vb_3),p1) --> [study].
verb(vb(vb_3),p2) --> [study].
verb(vb(vb_3),p3) --> [studies].
verb(vb(vb_4),_) --> [hunted].
verb(vb(vb_5),p1) --> [was].
verb(vb(vb_5),rp) --> [were].
verb(vb(vb_5),p3) --> [was].
verb(vb(vb_6),p1) --> [am].
verb(vb(vb_6),p2) --> [are].
verb(vb(vb_6),p3) --> [is].
verb(vb(vb_7),_) --> [chased].
verb(vb(vb_8),_) --> [saw].
verb(vb(vb_9),p3) --> [sings].
verb(vb(vb_10),p3) --> [has].
verb(vb(vb_11),p3) --> [reads].
verb(vb(vb_12),p3) --> [wrote].

% Adjetivos
adjective(adj(adj_1),cons) --> [black].
adjective(adj(adj_2),cons) --> [big].
adjective(adj(adj_3),cons) --> [grey].
adjective(adj(adj_4),cons) --> [red].
adjective(adj(adj_5),cons) --> [yellow].
adjective(adj(adj_6),cons) --> [tall].
adjective(adj(adj_7),cons) --> [thin].

% Adverbios
adverb(adv(adv_1)) --> [yesterday].
adverb(adv(adv_2)) --> [very].
adverb(adv(adv_3)) --> [well].

% Preposiciones
preposition(prep(prep_1),at) --> [at].
preposition(prep(prep_1),in) --> [in].

%Pronombres relativos
rel_pronoun(relPron(relPron_1)) --> [that].

% Complementos conjuntivos
conj_complement(conjComp(conjComp_1)) --> [and].