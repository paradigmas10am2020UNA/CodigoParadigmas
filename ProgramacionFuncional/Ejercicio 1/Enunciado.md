# ¿Qué famosa función calcula el siguiente método?

**Notas:** `IntStream` es un stream especializado para integers (pero ojo: ¡no es subclase de `Stream`!). `rangeClosed` genera intervalos de valores en un rango dado, incluyendo el extremo derecho.

```java
int foo(int n){
    return IntStream.rangeClosed(1, n).reduce( (f, x) -> f * x).orElse(1);
}
```
