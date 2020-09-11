;;;;;;; Membri del gruppo:

Paini Matteo            Matricola: 829917
Quaini Giacomo Maria    Matricola: 830593
Sancini Tommaso         Matricola: 833304




DESCRIZIONE PREDICATI UTILIZZATI:


1) IS_REGEXP(RE):

è vero quando RE è un’espressione regolare. Numeri e atomi sono le espressioni regolari più semplici; 

2) LIST_EXP([L | Ls]):

serve per scorrere la lista che corrisponde all' espressione regolare da analizzare


3) NFA_REGEXP_COMP(FA_Id,RE):

è vero quando RE è compilabile in un automa, che viene inserito nella base dati del Prolog. FA_Id diventa un identificatore per l’automa;


4) CREATE_AT(FA_Id, [X | Xs], S, F):

serve a inizializzare e definire i sotto-automi che uniti rappresenteranno l' automa definito dalla RE in ingresso


5) CREATE_OR(FA_Id, [X | Xs], S, F): 

crea il sotto-automa dell’espressione regolare base contenente OR;


6) CREATE_SEQ(FA_Id, [X | Xs], S, F)

crea il sotto-automa dell’espressione regolare base contenente SEQ;


7) CREATE_STAR(FA_Id, [X | Xs], S, F)

crea il sotto-automa dell’espressione regolare base contenente STAR;


8) CREATE_PLUS(FA_Id, [X | Xs], S, F)

crea il sotto-automa dell’espressione regolare base contenente PLUS;


9) CREATE_ATOM(FA_Id, X, S, Z)

crea il sotto-automa dell’espressione regolare atomica;


10) NFA_TEST(FA_Id, Input):

è vero quando l’input per l’automa identificato da FA_Id viene consumato completamente e l’automa si trova in uno stato finale. Input è una lista Prolog di simboli dell’alfabeto; 
 
11) ACCEPT(FA_Id, [L | Ls], S):

Utilizzato per eseguire le transizioni tra gli stati dove è possibile;


12) NFA_CLEAR(): 

pulisce la base di dati da tutti gli automi precedentemente presenti.

13) NFA_CLEAR(FA_Id):

Pulisce la base di dati dall' automa definito dal nominativo FA_Id.

14) NFA_LISTING():

Elenca tutti gli automi presenti nella base di dati.

15) NFA_LISTING(FA_Id):

Elenca l' automa richiesto e rappresentato da FA_Id, se presente nella base di dati.


