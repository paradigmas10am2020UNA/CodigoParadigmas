 //Lista Inmutable Implementada por Carlos Loría.
import com.eif400.collections.ISList; 

// POJO 
// i = numero de iteración
// s = sumatoria total
// t = siguiente termino
record Estate( int i, double s, double t ){} 

// Método que calcula el siguiente estado.
Estate update( Estate a ){   
   return new Estate( a.i() + 1, a.s() + a.t(), a.t() / ( a.i() + 1 ) );
}

double aproximeE(int n){
  return Stream.iterate( new Estate( 0, 0, 1 ), e -> update( e ) )
               .filter( e -> e.i() > n)
               .map( e -> e.s() )
               .findFirst()
               .orElse(-1.0);
}

/* Autor(es):
     Kevin Andrés Flores García
*/
