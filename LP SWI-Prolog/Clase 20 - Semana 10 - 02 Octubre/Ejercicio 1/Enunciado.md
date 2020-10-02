### Ejercicio 1

1) Estudie este ejemplo (corresponde al built-in append de Prolog). Notando que app(A, B, C) un modo de sus parámetros concatena A con B resultando en Z (siendo A, B, y C listas)  
~~~prolog
	app([], X, X).  
	app([X | R], Y, [X | Z] ) :- app(R, Y, Z).
~~~

a) Trate de entender cómo funciona
b) Haga esta consulta

~~~prolog
	app(A, B, [1,2,3,4])
~~~

Describa en palabras qué está haciendo app en ese caso.  
¿Cuántas soluciones genera?