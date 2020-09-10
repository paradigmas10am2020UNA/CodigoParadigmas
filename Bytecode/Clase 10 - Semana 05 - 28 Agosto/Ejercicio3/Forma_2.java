public class Main{
	
	public int hoo(int x, int y){
	    int i = x;
		while( i > 0){
			y *= i;
			i--;
		}
		return y;
    }
	
    static public void main(String... args){
		/*El metodo hoo(int x, int y) 
		Obtiene el factorial de 'x', pero con 'y' al  inicio*/
	   System.out.println(new Main().hoo(4,2));  // 48 --> fact(4) = 24  * 2 = 48
    }
}

/*Autor(es): Jose Barrantes Araya
             Javier Amador Delgado
*/
