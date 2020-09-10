### Escriba  un método `hoo` cuyo `bytecode` compilado sea exactamente el siguiente (eso se le dice reverse engineering)

```bytecode
  public int hoo(int, int);
    Code:
       0: iload_1
       1: istore_3
       2: iload_3
       3: ifle          16
       6: iload_2
       7: iload_3
       8: imul
       9: istore_2
      10: iinc          3, -1
      13: goto          2
      16: iload_2
      17: ireturn
```
