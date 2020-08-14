int foo(int n) {
  return IntStream.rangeClosed(1, n).reduce((f, x) -> f * x).orElse(1);
}

// La respuesta es factorial, ya que multiplica todos los valores en un rango y acumula dicha multiplicación.

// Autor(es):
//   Todos
