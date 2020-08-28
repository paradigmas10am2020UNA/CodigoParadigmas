// POJO
record Estate( int n1, int n2, int i ){

    public static Estate initial(int n){
        return new Estate( 0, 1 , n );
    }
    
    public Estate update(){
        return new Estate( n2, n1 + n2, i - 1 );
    }    
    
    public boolean isFinal(){
        return i == 0;
    }
    
}

Integer fibonacci_fp( int n ){
    return Stream.iterate( Estate.initial(n), Estate::update )
                 .filter( Estate::isFinal )
                 .findFirst()
                 .get()
                 .n1();                
}

/* Autor(es):
    Kevin Flores Garcia
    Javier Amador Delgado
    Carlos Gutierrez Chaves
*/
