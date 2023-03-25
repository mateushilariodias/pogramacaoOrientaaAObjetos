//Implementação Iterativa

function fatorial(n){
    let resultado = 1
    for(let i=n; i > 1; i--) resultado *= i
    return resultado
}

console.log('Fatorial de 5:', fatorial(5))

//Implementação Recursiva

function fatorialRec(n){
    if(n <= 1) return 1
    return n * fatorialRec(n-1)
}

console.log('Fatorial Recursivo de 5: ', fatorialRec(5))