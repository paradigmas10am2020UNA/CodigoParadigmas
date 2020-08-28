import java.util.stream.Collectors;

/**
Demo para Collectors
@author loriacarlos@gmail.com

*/
enum Gender{FEMALE, MALE}
record Person(String name, int age, Gender gender){
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
List<Person> genPersons() throws Exception{
    var names = Files.lines(Paths.get("names.txt")).collect(Collectors.toList());
    var ages = genAges(18, 90, names.size());
    var genders = genGenders(names.size());
    return IntStream.range(0, names.size()).boxed()
           .map( i -> new Person(names.get(i), ages.get(i), genders.get(i) )) 
           .collect(Collectors.toList());
}
/*
    Retorna la diferencia entre la mayor edad y la menor edad de la lista
    persons según género utlizando Collectors.teeing.

    Autor(es) del método:
        Javier Alberto Amador Delgado
        Philippe Gairaud Quesada
        Kevin Flores Garcia

*/

int ageMargin(List<Person> persons, Gender gender){
    return persons.stream().filter(p -> p.gender() == gender)
           .collect(Collectors.teeing(Collectors.maxBy(Person::compareTo)
           , Collectors.minBy(Person::compareTo), (a, b) -> a.get().age() 
           - b.get().age()));



}

