#  Pase a FP el siguiente algoritmo:

```java
List<Integer> euclid(int x, int y){       
        int q = 0; int r = x;  
        while (r >= y){
            q++; r -= y;
        }
        return Arrays.asList(q, r); 
 }
```