# Demuestre que map se puede simular con un reduce.

**Hágalo así:** escriba un método `<T, R> List<R> myMap(List<T> list, Function<T, R> f)` que reciba una lista _list_ del tipo indicado y retorne el equivalente de calcular `list.stream().map(x -> f.apply(x)).collect(Collectors.toList())`.

Pero sólo usando `reduce`. Sin estatutos tampoco. Puede usar declaraciones; por ejemplo: `var una_lista = new CopyOnWriteArrayList<T>();`.

Va  a ocupar una Lista inmutable, probablemente. Considere usar `CopyOnWriteArrayList` que es una variante `ArrayList` pero que es inmutable.

Nota: `Function<T, R>` es el tipo de una lambda que denota una función va desde un tipo de objeto `T` hasta un tipo de objeto `R` (genéricos). Function es una interfaz del API. Para llamar a una lambda que cumpla con Function se le debe llamar al método `R apply(T x)`. A ese tipo de interfaz se le dice Interfaz Funcional. Lo explicaremos con más detalle en la próxima clase. Por ahora sólo úselo.
