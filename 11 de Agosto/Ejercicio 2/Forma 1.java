<T, R>
List<R> myMap(List<T> list, Function<T, R> f)  {
  return list.stream()
    .reduce(List.of(), (acc, x) -> new ArrayList<R>() {{ addAll(acc); add(f.apply(x)); }}, (x,y) -> new ArrayList<R>() {{ addAll(x); addAll(y); }});
}

// El método usa una sintaxis rara new ArrayList<R>() {{ addAll(x); addAll(y); }} para generar una nueva lista que fusione las dos listas en un solo statement.

// Autor(es):
//   David Alberto Guevara Sánchez
//   Natalia Solano Azofeifa
