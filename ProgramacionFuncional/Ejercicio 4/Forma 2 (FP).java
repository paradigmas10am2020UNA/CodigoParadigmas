// POJO
record Estate( int q, int r, int x, int y ){

    public static Estate initial( int x, int y ){
        return new Estate( 0, x, x, y );
    }
    
    public Estate update(){
        return new Estate( q+1, r-y, x, y );
    }
    
    public boolean isFinal(){
        return r < y;
    }
}

List<Integer> euclid_fp( int x, int y ){

    Estate s = Stream.iterate( Estate.initial( x, y ), Estate::update )
                     .filter( Estate::isFinal )
                     .findFirst()
                     .orElse( null );
                     
    return s != null ? Arrays.asList( s.q(), s.r() ) : Arrays.asList();
}

/* Autor(es):
    Kevin Flores Garcia
*/
