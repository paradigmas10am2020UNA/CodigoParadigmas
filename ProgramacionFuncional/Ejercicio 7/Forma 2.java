/**
Demo para Collectors
@author loriacarlos@gmail.com

*/

/* 
  Autor(es) de la solucion:
    Kevin Flores Garcia
    Carlos Gutierrez Chaves 
*/

enum Gender{FEMALE, MALE}

enum Province {SAN_JOSE, PUNTARENAS, CARTAGO, LIMON, GUANACASTE, ALAJUELA, HEREDIA}

record Person(String name, int age, Gender gender, Province province){
    int compareTo(Person p){
        return this.age() - p.age();
    }
}

var rand = new Random(666);

List<Integer> genAges(int a, int b, int max){
    return rand.ints(a, b).limit(max).boxed().collect(Collectors.toList());
}

List<Gender> genGenders(int max){
    return rand.ints().limit(max)
                          .boxed()
                          .map(n -> n % 2 == 0 ? Gender.FEMALE : Gender.MALE)
                          .collect(Collectors.toList());
}

//  Este metodo genera una lista de largo < max > con Provincias 
//  seleccionadas aleatoriamente

List<Province> genProvinces(int max){
    return rand.ints( 0, Province.values().length )
               .limit( max )
               .boxed()
               .map( n -> Province.values()[n] )
               .collect( Collectors.toList() );
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

// Metodo que agrupa por Province y despues por Gender
// Retorna Un Map de Map's, el segundo siendo un Map de Listas De Personas.

Map<Province, Map<Gender, List<Person>>> byProviceAndGender(List<Person> persons){
    return persons.stream()
                  .collect( 
                      Collectors.groupingBy( 
                        Person::province, 
                        Collectors.groupingBy( Person::gender ) 
                      ) 
                   );
}
