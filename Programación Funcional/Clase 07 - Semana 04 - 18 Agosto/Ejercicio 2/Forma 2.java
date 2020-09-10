import java.util.stream.Stream;

record EState(Integer i, Double s, Double t) {
  EState update() {
    return new EState(i + 1, s + t, t * 1/(i + 1));
  }
}

Double calculateEuler(Double precision) {
  return Stream.iterate(new EState(0, 0.0d, 1.0d), e -> e.update())
    .filter(e -> e.t() < precision)
    .findFirst()
    .orElse(null)
    .s();
}
