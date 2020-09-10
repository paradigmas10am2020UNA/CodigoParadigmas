/**
Demo para Collectors
@author loriacarlos@gmail.com

*/

enum Gender{FEMALE, MALE}
enum Province{ SAN_JOSE,LIMON,HEREDIA,CARTAGO,GUANACASTE,PUNTARENAS,ALAJUELA}

record Person(String name, int age, Gender gender, Province province){
    int compareTo(Person p){
        return this.age() - p.age();
    }
}

var rand = new Random(666);

/*Método que devuelve una provincia en base a un int del 1 al 7*/
Province getPrvcByNum( int n ){
	
	switch(n) {
	  case 1:
		return Province.SAN_JOSE;
		
	  case 2:
		return Province.LIMON;
		
	  case 3:
		return Province.HEREDIA;
		
	  case 4:
		return Province.CARTAGO;
		
	  case 5:
		return Province.GUANACASTE;
		
	  case 6:
		return Province.PUNTARENAS;
		
	  case 7:
		return Province.ALAJUELA;
		
	  default:
		return Province.SAN_JOSE;
	}
	
}

List<Integer> genAges(int a, int b, int max){
    return rand.ints(a, b).limit(max).boxed().collect(Collectors.toList());
}

List<Gender> genGenders(int max){
    return rand.ints().limit(max)
                          .boxed()
                          .map(n -> n % 2 == 0 ? Gender.FEMALE : Gender.MALE)
                          .collect(Collectors.toList());
}

/* Método que genera una lista con n cantidad de provincias utilizando el método getPrvcByNum( int n ) */
List<Province> genProvinces(int max){
    return rand.ints(1,8).limit(max)
                          .boxed()
                          .map(n -> getPrvcByNum(n))
                          .collect(Collectors.toList());
}

List<Person> genPersons() throws Exception{
    var names = Files.lines(Paths.get("names.txt")).collect(Collectors.toList());
    var ages = genAges(18, 90, names.size());
    var genders = genGenders(names.size());
	var provinces = genProvinces(names.size());
    return IntStream.range(0, names.size()).boxed()
           .map( i -> new Person(names.get(i), ages.get(i), genders.get(i), provinces.get(i) )) 
           .collect(Collectors.toList());
}


/*Método byProvinceAndGender que devuelve la agrupación de personas según provincia y dentro de estas se agrupan por género. 
El tipo devuelto es Map< Province, Map< Gender, List< Person > > > */ 
Map< Province, Map< Gender, List< Person > > > byProvinceAndGender( List<Person> persons ){
return persons.stream().collect( Collectors.groupingBy(Person::province, Collectors.groupingBy(Person::gender) )); 
}



/* Autor(es):
     Javier Alberto Amador Delgado
*/
