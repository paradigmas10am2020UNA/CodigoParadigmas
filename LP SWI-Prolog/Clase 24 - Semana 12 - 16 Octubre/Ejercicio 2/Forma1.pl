my_map_foldl(Lambda, L, R) :- 
	foldl({Lambda}/[X,Y,Acc] >> (call(Lambda, X, R1), 
	append(Y, [R1], Acc)), L, [], R)
.

/**
- Natalia Solano
*/
