 //Lista Inmutable Implementada por Carlos Loría.
import com.eif400.collections.ISList; 

List<Integer> euclid( int x, int y ){
	
return Stream.iterate( ISList.asList( 0 , x ), pair -> ISList.asList( pair.first() + 1, pair.rest().first() - y ) )
.filter( rs -> rs.rest().first() < y ).findFirst().orElse( ISList.asList( 0, x ) ).toList(); 

}

/* Autor(es):
     Javier Amador Delgado
*/
