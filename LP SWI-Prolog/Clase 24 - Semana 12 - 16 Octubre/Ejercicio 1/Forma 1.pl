repeticiones(_,[],0).
repeticiones(E, [E | R], C) :- repeticiones(E, R ,Con), C is Con + 1, !.
repeticiones(E, [_ | R], C) :- repeticiones(E, R, C).

/*
- Natalia Solano
*/
