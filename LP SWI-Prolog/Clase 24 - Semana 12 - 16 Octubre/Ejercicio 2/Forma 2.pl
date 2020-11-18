my_map_recursive(_, [], []).
my_map_recursive(G, [E0 | Ls0], [E | Ls]) :-
  call(G, E0, E),
  my_map_recursive(G, Ls0, Ls).
  
/*
 * - David Alberto Guevara Sánchez
 */
