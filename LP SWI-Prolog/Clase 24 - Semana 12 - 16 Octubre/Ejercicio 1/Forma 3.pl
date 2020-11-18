% repeticiones(E, L, C) -> C es cuantas veces E se repite en la lista L.

% repeticiones(_, [], 0).
% repeticiones(E, [E | Ls0], C) :- repeticiones(E, Ls0, C0), C is C0 + 1, !.
% repeticiones(E, [_ | Ls0], C0) :- repeticiones(E, Ls0, C0).

% repeticionesCola(_, [], 0).
% repeticionesCola(E, [E | Ls0], C0 + 1) :- repeticionesCola(E, Ls0, C0), !.
% repeticionesCola(E, [_ | Ls0], C0) :- repeticionesCola(E, Ls0, C0).

repeticiones(E, L, C) :- repeticiones_(E, L, C0), C is C0.

repeticiones_(_, [], 0).
repeticiones_(E, [E | Ls0], C0 + 1) :- repeticiones_(E, Ls0, C0), !.
repeticiones_(E, [_ | Ls0], C0) :- repeticiones_(E, Ls0, C0).

/*
 * - David Alberto Guevara Sánchez
 */