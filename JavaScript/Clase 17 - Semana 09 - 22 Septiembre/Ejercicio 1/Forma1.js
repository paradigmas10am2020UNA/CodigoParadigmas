function util(f, start, end, frequency){
    setTimeout( () => {
        let a = setInterval(f, frequency*1000);
        setTimeout(() => {clearInterval(a) }, (end - start)*1000);
    }, start*1000); 
}

/**
 * Autor(es): 
 * - Luis Villalobos
 * - Natalia Solano
 * - Joy Bonilla
 */
