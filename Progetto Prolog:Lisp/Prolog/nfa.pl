%%%% -*- Mode: Prolog -*-

%%%% nfa.pl

%%%% Membri del gruppo:
%%%% Paini Matteo          Matricola: 829917
%%%% Quaini Giacomo Maria  Matricola: 830593
%%%% Sancini Tommaso       Matricola: 833304


%%% is_regexp/1
is_regexp(RE) :-
    atomic(RE),
    !.

is_regexp(RE) :-
    compound(RE),
    functor(RE, X, _),
    X \= seq,
    X \= or,
    X \= star,
    X \= plus,
    !.

is_regexp(RE) :-
    compound(RE),
    functor(RE, seq, _),
    RE =.. Ts,
    list_exp(Ts),
    !.

is_regexp(RE) :-
    compound(RE),
    functor(RE, or, _),
    RE =.. Ts,
    list_exp(Ts),
    !.

is_regexp(RE) :-
    compound(RE),
    functor(RE, star, 1),
    RE =.. Ts,
    list_exp(Ts),
    !.

is_regexp(RE) :-
    compound(RE),
    functor(RE, plus, 1),
    RE =.. Ts,
    list_exp(Ts),
    !.

%%% list_exp/1
list_exp([]).

list_exp([X]) :-
    is_regexp(X).

list_exp([_, Y | Ys]) :-
    is_regexp(Y),
    list_exp([Y | Ys]).


%%%nfa_regexp_comp/2
nfa_regexp_comp(FA_Id, RE)  :-
    nonvar(FA_Id),
    is_regexp(RE),
    retract(nome(FA_Id)),
    assert(nome(FA_Id)),
    !,
    fail.

nfa_regexp_comp(FA_Id, RE) :-
    is_regexp(RE),
    nonvar(FA_Id),
    atomic(RE),
    assert(nome(FA_Id)),
    assert(epsilon(FA_Id, 0, 0)),
    create_atom(FA_Id, RE, S, F),
    assert(initial(FA_Id, S)),
    assert(final(FA_Id, F)),
    !.
nfa_regexp_comp(FA_Id, RE) :-
    is_regexp(RE),
    nonvar(FA_Id),
    compound(RE),
    functor(RE, X, _),
    X \= seq,
    X \= or,
    X \= star,
    X \= plus,
    assert(nome(FA_Id)),
    assert(epsilon(FA_Id, 0, 0)),
    create_atom(FA_Id, RE, S, F),
    assert(initial(FA_Id, S)),
    assert(final(FA_Id, F)),
    !.

nfa_regexp_comp(FA_Id, RE) :-
    nonvar(FA_Id),
    is_regexp(RE),
    assert(nome(FA_Id)),
    RE =.. L,
    gensym(q, S),
    assert(initial(FA_Id, S)),
    create_at(FA_Id, L, S, F),
    assert(final(FA_Id, F)),
    !.

%%%create_at/4
create_at(FA_Id, [X | Xs], S, F) :-
    X = or,
    gensym(q, F),
    create_or(FA_Id, Xs, S, F),
    !.

create_at(FA_Id, [X | Xs], S, F) :-
    X = seq,
    gensym(q, F),
    create_seq(FA_Id, Xs, S, F),
    !.

create_at(FA_Id, [X | Xs], S, F) :-
    X = star,
    gensym(q, F),
    create_star(FA_Id, Xs, S, F),
    !.

create_at(FA_Id, [X | Xs], S, F) :-
    X = plus,
    gensym(q, F),
    create_plus(FA_Id, Xs, S, F),
    !.

create_at(FA_Id, [X | Xs], S, F) :-
    atomic(X),
    create_atom(FA_Id, Xs, S, F).

%%%create_or/4
create_or(_, [], _, _).

create_or(FA_Id, [X |Xs], S, F) :-
    atomic(X),
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    create_or(FA_Id, Xs, S, F),
    !.

create_or(FA_Id, [X | Xs], S, F) :-
    compound(X),
    functor(X, Y, _),
    Y \= seq,
    Y \= or,
    Y \= star,
    Y \= plus,
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    create_or(FA_Id, Xs, S, F),
    !.

create_or(FA_Id, [X | Xs], S, F) :-
    compound(X),
    X =.. L,
    create_at(FA_Id, L, S, I),
    assert(epsilon(FA_Id, I, F)),
    create_or(FA_Id, Xs, S, F),
    !.

%%%create_seq/4
create_seq(FA_Id, [], S, F) :-
    assert(epsilon(FA_Id, S, F)).

create_seq(FA_Id, [X | Xs], S, F) :-
    atomic(X),
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, S, E)),
    create_seq(FA_Id, Xs, I, F),
    !.

create_seq(FA_Id, [X | Xs], S, F) :-
    compound(X),
    functor(X, Y, _),
    Y \= seq,
    Y \= or,
    Y \= star,
    Y \= plus,
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, S, E)),
    create_seq(FA_Id, Xs, I, F),
    !.

create_seq(FA_Id, [X | Xs], S, F) :-
    compound(X),
    X =.. L,
    create_at(FA_Id, L, S, I),
    create_seq(FA_Id, Xs, I, F),
    !.

%%%create_star/4
create_star(_, [], _, _).

create_star(FA_Id, [X | Xs], S, F) :-
    atomic(X),
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, I, E)),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    assert(epsilon(FA_Id, S, F)),
    create_star(FA_Id, Xs, S, F),
    !.

create_star(FA_Id, [X | Xs], S, F) :-
    compound(X),
    functor(X, Y, _),
    Y \= seq,
    Y \= or,
    Y \= star,
    Y \= plus,
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, I, E)),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    assert(epsilon(FA_Id, S, F)),
    create_star(FA_Id, Xs, S, F),
    !.

create_star(FA_Id, [X | Xs], S, F) :-
    compound(X),
    X =.. L,
    gensym(q, E),
    create_at(FA_Id, L, E, I),
    assert(epsilon(FA_Id, I, E)),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    assert(epsilon(FA_Id, S, F)),
    create_star(FA_Id, Xs, S, F),
    !.


%%%create_plus/4
create_plus(_, [], _, _).

create_plus(FA_Id, [X | Xs], S, F) :-
    atomic(X),
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, I, E)),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    create_plus(FA_Id, Xs, S, F),
    !.

create_plus(FA_Id, [X | Xs], S, F) :-
    compound(X),
    functor(X, Y, _),
    Y \= seq,
    Y \= or,
    Y \=star,
    Y \=plus,
    create_atom(FA_Id, X, E, I),
    assert(epsilon(FA_Id, I, E)),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    create_plus(FA_Id, Xs, S, F),
    !.

create_plus(FA_Id, [X | Xs], S, F) :-
    compound(X),
    X =.. L,
    gensym(q, E),
    create_at(FA_Id, L, E, I),
    assert(epsilon(FA_Id, I, E)),
    assert(epsilon(FA_Id, S, E)),
    assert(epsilon(FA_Id, I, F)),
    create_plus(FA_Id, Xs, S, F),
    !.

%%%create_atom/4
create_atom(_, [], _, _).

create_atom(FA_Id, X, S, Z) :-
    gensym(q, S),
    gensym(q, Z),
    assert(delta(FA_Id, S, X, Z)),
    create_atom(FA_Id, [], S, Z),
    !.

%%%nfa_test/2
nfa_test(FA_Id, I) :-
    initial(FA_Id, S),
    accept(FA_Id, I, S),
    !.

%%%accept/3
accept(FA_Id, [], Q) :-
    final(FA_Id, Q),
    !.

accept(FA_Id, [L | Ls], S) :-
    delta(FA_Id, S, L, N),
    accept(FA_Id, Ls, N),
    !.

accept(FA_Id, L, S) :-
    epsilon(FA_Id, S, N),
    accept(FA_Id, L, N),
    !.

%%%nfa_clear/0
nfa_clear():-
    abolish(nome/1),
    abolish(initial/2),
    abolish(nome/1),
    abolish(final/2),
    abolish(delta/4),
    abolish(epsilon/3).

%%nfa_clear/1
nfa_clear(FA_Id) :-
    retractall(nome(FA_Id)),
    retractall(initial(FA_Id, _)),
    retractall(final(FA_Id, _)),
    retractall(delta(FA_Id, _, _, _)),
    retractall(epsilon(FA_Id, _, _)).

%%%nfa_listing/0
nfa_listing() :-
    listing(nome/1),
    listing(initial/2),
    listing(final/2),
    listing(delta/4),
    listing(epsilon/3).

%%%nfa_listing/1
nfa_listing(FA_Id) :-
    listing(nome(FA_Id)),
    listing(initial(FA_Id, _)),
    listing(final(FA_Id, _)),
    listing(delta(FA_Id, _, _, _)),
    listing(epsilon(FA_Id, _, _)).



%%%% end of file -- nfa.pl















