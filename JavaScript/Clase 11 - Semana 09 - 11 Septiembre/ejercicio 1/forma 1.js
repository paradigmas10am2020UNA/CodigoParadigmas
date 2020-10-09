function map(ga, f) {
    let g = [];
    let iter = ga[Symbol.iterator]();
    let gai = iter.next();
    while (!gai.done) {
        g.push(f(gai.value));
        gai = iter.next();
    }
    return g;
}

//resuelto por jose barrantes
