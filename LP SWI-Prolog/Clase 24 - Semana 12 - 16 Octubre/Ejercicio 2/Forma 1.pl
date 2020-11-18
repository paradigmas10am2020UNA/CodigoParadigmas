mapRe(_, [], []). 
mapRe(LAM, [X | R], [LamdaF | LamdaR])  :-
    call(LAM, X, LamdaF),
    map(LAM, R, LamdaR).
    
    
/**
- Natalia Solano
*/
