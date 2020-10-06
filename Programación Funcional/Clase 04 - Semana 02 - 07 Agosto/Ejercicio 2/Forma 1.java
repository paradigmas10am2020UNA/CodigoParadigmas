
// Parte a)
int sumAgesByGender(List<Person> persons, Gender g){ 

return persons.stream().filter(p -> p.gender() == g).map( p -> p.age() ).reduce(0, (acumulador, n) -> acumulador + n); 

}

// Parte b)
Optional<Person> oldest(List<Person> persons){
	
return persons.stream().reduce( ( old , actual ) -> old.age() > actual.age() ? old : actual);

}

// Nota: Oldest se implementó con Optional por si se da el caso de que la lista que le pasan es vacía.

// Autor(es):
//   Javier Alberto Amador Delgado
