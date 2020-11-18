% repeticiones(+E, +L, +C) = true si  C es cuantas veces E se repite en la lista L.
repeticiones_cola(_,[],0) :- !.
repeticiones_cola(E, [F | R], C) :- 
  E == F -> C1 is C - 1, 
  repeticiones_cola(E, R, C1); 
  repeticiones_cola(E, R, C).
/*
 * Authors:
 * - Kevin Flores
 * - Javier Amador
*/
