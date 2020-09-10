/**
Demo solo para ser usado con javap
@author loriacarlos@gmail.com
@since II-2020
No distribuir sin permiso del autor fuera de sus grupos de EIF400 2020
*/

public class Foo{
    
    public static void main(String... args){}
	
	public String foo(int n){
		String s = "S0";
		switch(n){
			case 10:
			case 2: s = "S12"; break;
			case 30, 4, 5: s = "S345"; break;
			default: s = "Sn";
		}
		return s;
	}
	
	public String goo(int n){
		String s = "S0";
		switch(n){
			case 1:
			case 2: s = "S12"; break;
			case 3, 4, 5: s = "S345"; break;
			default: s = "Sn";
		}
		return s;
	}
}

/*  Autor: Luis Villalobos Gonzalez.
	
	Existe una diferencia entre los case de los switch.
	
	El metodo foo tiene los case 10, 2, 30, 4, 5    (genera una instruccion lookupswitch)
	Mientras que el metodo goo tiene 1, 2, 3, 4, 5  (genera una instruccion tableswitch)
	
	* Con lookupswitch el valor se compara con cada uno de los case hasta encontrar una coincidencia.
	
	*A diferencia de tableswitch, los numeros del case de goo van de 1 a 5 puede utilizarlos 
	como indice, para formar una tabla entonces la busqueda es mas rapida que en foo.
	
	
	Bytecode desensamblado de Foo.class:

	public java.lang.String foo(int);
		Code:
		   0: ldc           #7                  // String S0
		   2: astore_2
		   3: iload_1
		   4: lookupswitch  { // 5
						 2: 56
						 4: 62
						 5: 62
						10: 56
						30: 62
				   default: 68
			  }
		  56: ldc           #9                  // String S12
		  58: astore_2
		  59: goto          71
		  62: ldc           #11                 // String S345
		  64: astore_2
		  65: goto          71
		  68: ldc           #13                 // String Sn
		  70: astore_2
		  71: aload_2
		  72: areturn

	public java.lang.String goo(int);
		Code:
		   0: ldc           #7                  // String S0
		   2: astore_2
		   3: iload_1
		   4: tableswitch   { // 1 to 5
						 1: 40
						 2: 40
						 3: 46
						 4: 46
						 5: 46
				   default: 52
			  }
		  40: ldc           #9                  // String S12
		  42: astore_2
		  43: goto          55
		  46: ldc           #11                 // String S345
		  48: astore_2
		  49: goto          55
		  52: ldc           #13                 // String Sn
		  54: astore_2
		  55: aload_2
		  56: areturn
	  
*/
