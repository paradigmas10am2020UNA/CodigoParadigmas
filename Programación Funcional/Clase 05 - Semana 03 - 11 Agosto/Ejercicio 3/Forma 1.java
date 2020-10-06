Optional< List<Person> > oldestWomen( List<Person> persons ){
var oldFA = persons.stream().filter( p -> p.gender() == Gender.FEMALE).map( p -> p.age() ).reduce( ( old , actual ) -> old > actual ? old : actual).orElse(0);
return Optional.of( persons.stream().filter( p -> p.gender() == Gender.FEMALE ).filter( p -> p.age() == oldFA ).reduce( new ArrayList<Person>(), ( result, elem ) -> result.add( elem ) ? result : result , ( res , x ) -> res.addAll( x ) ? res : res) ); }

// El método usa el reduce de 3 parametros para tener más libertad en el acumulador, la porción del combiner no se utiliza pero se debe especificar. 
// No se hace uso de collect.(Collectors.toList()) por la restricción del problema 

// Autor(es):
//   Javier Alberto Amador Delgado
