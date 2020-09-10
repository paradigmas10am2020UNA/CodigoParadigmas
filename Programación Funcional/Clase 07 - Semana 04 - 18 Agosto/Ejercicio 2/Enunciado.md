#  Resuelva usando FP y recursivamente la estimación del número e.
__Notas:__ 

El número __e ≈ (2.718281828459045)__ se puede aproximar por esta sumatoria: __`∑ 1/𝑖! 𝑛 𝑖=0`__. Escriba una función en Java __`aproximeE(n)`__ que aproxime e usando dicha sumatoria. 
El número de multiplicaciones y divisiones  debe ser 𝑂(𝑛).  Si no es lineal en esa cantidad no se considera correcta. 

Use la idea de estado inflacionario inmutable. Use record. Separe la funcion delta (update de estado) del POJO de estado.
