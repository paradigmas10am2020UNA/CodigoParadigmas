import static java.util.stream.Collectors.*;

enum Gender {MALE, FEMALE}
record Person(String name, Gender gender, Integer age) {}

int ageMargin(List<Person> persons, Gender gender) {
  return example_list.stream()
    .filter(p -> p.gender() == gender)
    .map(p -> p.age())
    .collect(
      Collectors.teeing(
        Collectors.maxBy(Integer::compareTo),
        Collectors.minBy(Integer::compareTo),
        (max , min) -> Math.abs(max.get() - min.get())
      )
    );
}

/**
 * Autores:
 * - David Alberto Guevara Sánchez
 */
