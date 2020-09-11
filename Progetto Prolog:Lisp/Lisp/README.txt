;;;;;;; Membri del gruppo:

Paini Matteo                    Matricola: 829917
Quaini Giacomo Maria            Matricola: 830593
Sancini Tommaso                 Matricola: 833304




DESCRIZIONE FUNZIONI UTILIZZATE:


1) IS-REGEXP

Ritorna vero quando RE è un’espressione regolare. Numeri e atomi sono le espressioni regolari più semplici; 

2) LIST-EX

serve per scorrere la lista che corrisponde all' espressione regolare da analizzare


3) NFA-REGEXP-COMP

Ritorna l’automa ottenuto dalla compilazione di RE,se è un’espressione regolare, altrimenti ritorna NIL


4) NFA-SUBREGEXP-COMP

serve a inizializzare e definire i sotto-automi che uniti rappresenteranno l' automa definito dalla RE in ingresso


5) CREATE-OR

crea il sotto-automa dell’espressione regolare contenente OR;


6) CREATE-SEQ

crea il sotto-automa dell’espressione regolare contenente SEQ;


7) CREATE-STAR

crea il sotto-automa dell’espressione regolare contenente STAR;


8) CREATE-PLUS

crea il sotto-automa dell’espressione regolare contenente PLUS;


9) CREATE-ATOM

crea il sotto-automa dell’espressione regolare atomica;


10) CONTA-STATI

Restituisce il numero di stati necessari a creare l’automa corrispondente a RE

11) NFA-TEST

Ritorna vero quando l’input per l’automa FA viene consumato completamente e l’automa si trova nello stato finale, altrimenti ritorna NIL. Se FA non ha la struttura corretta di un’ automa la funzione genera un errore

12) NFA-SUBTEST

Funzione ausiliaria utilizzata da ifa-test.

13) LIST-TEST

Serve per svolgere le transizioni tra gli stati dove possibile

14) IS-AUTOMA

Ritorna vero quando l’input ha la struttura corretta di un’automa







