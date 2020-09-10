<T, R> List<R> myMap(List<T> list, Function<T, R> f){
    return list.stream()
               .reduce( new CopyOnWriteArrayList<R>(), 
                      ( result, x ) -> result.add( f.apply( x ) ) ? result : result,
                      ( x, y ) -> x.addAll( y ) ? x : x );
}

/* Para este método usamos CopyOnWriteArrayList que es una lista "inmutable", recomendada por
   el profesor. Se utiliza reduce de 3 parametros:
                    
                        <U> U reduce( U identity,
                                      BiFunction<U,? super T,U> accumulator,
                                      BinaryOperator<U> combiner )
*/

/* Autor(es):
    Kevin Andrés Flores García
*/