
BinaryOperator<Integer> swapArgs( BinaryOperator<Integer> f ) {
return (x,y) -> f.apply(y,x); 
}

/* Autor(es):
     Javier Alberto Amador Delgado
     Kevin Flores García
     Natalia Solano Azofeifa
     David Alberto Guevara Sánchez
     Joy Bonilla Fley
*/
