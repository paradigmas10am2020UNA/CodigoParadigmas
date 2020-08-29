### Añada a Foo.java estos métodos y desensamble. Trate de deducir qué hizo el compilador. ¿Por qué la diferencia de instrucción generada?¿Puede explicarlo?

```java
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
```
