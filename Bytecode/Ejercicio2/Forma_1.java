public class Main{
	public int hoo(int x, int y){
		for(int i = x; i > 0; i--)
			y *= i;
		return y;
    }
    static public void main(String... args){
		/*El metodo hoo(int x, int y) 
		Obtiene el factorial de 'x', pero con 'y' al  inicio*/
	   System.out.println(new Main().hoo(4,2));  // 48 --> fact(4) = 24  * 2 = 48
    }
}
/* Autor: Luis Villalobos Gonzalez

public int hoo(int, int);
    Code:
       0: iload_1					// Cargando 'x'
       1: istore_3					// Almacenando 'x' en i
       2: iload_3					// Cargando i
       3: ifle          16          // si i es mayor que 0
       6: iload_2					// Cargando y
       7: iload_3					// Cargando i
       8: imul						// Multiplicando y * i
       9: istore_2					// Almacenando en y
      10: iinc          3, -1		// Decrementando i en 1
      13: goto          2			// Volviendo a ejecutar el ciclo
      16: iload_2					// Cargando y
      17: ireturn					// Retornando y
*/