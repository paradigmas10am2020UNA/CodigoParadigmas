import com.eif400.collections.ISList;  //Lista Inmutable Implementada por Carlos Loría.

record Estate( int i, double s, double t ){} // POJO

Estate update( Estate a ){  // Método que calcula el siguiente estado. 
   return new Estate( a.i() + 1, a.s() + a.t(), a.t() / ( a.i() + 1 ) );
}

double aproximeE(int n){
  return Stream.iterate( new Estate( 0, 0, 1 ), e -> update( e ) )
               .filter( e -> e.i() > n)
               .map( e -> e.s() )
               .findFirst()
               .orElse( -1.0 );
}

/* Autor(es):
     Kevin Andrés Flores García
*/
