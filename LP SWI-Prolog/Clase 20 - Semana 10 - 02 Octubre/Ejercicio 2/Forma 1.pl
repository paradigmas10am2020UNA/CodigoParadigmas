% penultimo(+L, ?P)
penultimo([P,_], P). % caso base
penultimo([_|R], X) :- penultimo(R, X). % caso recursivo

/**
 * Autor(es): 
 * - Joy Bonilla
 * - Natalia Solano
 * - Javier Amador D.
 * - Kevin Flores G.
 */
