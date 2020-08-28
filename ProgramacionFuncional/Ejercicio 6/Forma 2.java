import java.util.Random;
enum Gender{FEMALE, MALE}
enum Province{HEREDIA, ALAJUELA, PUNTARENAS, SANJOSE, GUANACASTE, LIMON, CARTAGO}

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
List<Province> genProvince(int max){
	Random RANDOM = new Random();
    return rand.ints().limit(max)
                          .boxed()
                          .map(n -> Province.values()[RANDOM.nextInt(7)])
                          .collect(Collectors.toList());
}
List<Person> genPersons() throws Exception{
    var names = Files.lines(Paths.get("names.txt")).collect(Collectors.toList());
    var ages = genAges(18, 90, names.size());
    var genders = genGenders(names.size());
	var provinces = genProvince(names.size());
    return IntStream.range(0, names.size()).boxed()
           .map( i -> new Person(names.get(i), ages.get(i), genders.get(i), provinces.get(i) )) 
           .collect(Collectors.toList());
}
var personas = genPersons();
import static java.util.stream.Collectors.*;
personas.stream().map( Person::name ).collect( joining(", ") )
var p1 = personas.stream().map( Person::name ).collect( joining(", ") );
var p2 = personas.stream().collect(maxBy( (a, b) -> a.age() - b.age() ));
var p3 = personas.stream().collect(minBy( (a, b) -> a.age() - b.age() ));
var p4 = personas.stream().collect( partitioningBy( p ->p.gender() == Gender.MALE));
var p5 = personas.stream().collect( groupingBy( Person::age ));
p5.get(32)
p5.get(62)
var a = Arrays.asList(Arrays.asList(1,2,3,4,5));
var b = a.stream().flatMap( x -> x.stream() ).collect( toList() );
var p6 = personas.stream().collect(averagingDouble(Person::age));

int ageMargin(List<Person> persons, Gender gender){
	return persons.stream().collect( 
                            Collectors.teeing(
                                    Collectors.maxBy( (a, b) -> a.age() - b.age() ),
                                    Collectors.minBy( (a, b) -> a.age() - b.age() ),
                                    (e1, e2) -> e1.get().age() - e2.get().age()));
}
//autora: Natalia Solano Azofeifa
