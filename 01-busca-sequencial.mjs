/*
    ALGORITMO DE BUSCA SEQUENCIAL

    Percorre o vetor, verificando se cada um dos elementos corresponde
    ao valor de busca. Ao encontrar uma correspondência, retorna a posição
    onde o valor de busca está no vetor.

    Caso o valor de busca não exista no vetor, retorna o valor convencional
    -1.
*/

function buscaSequencial(vetor, valorBusca){
    for(let i=0; i < vetor.length; i++){
        if(vetor[i] === valorBusca) return i
    }
    return -1
}

// const frutas = ["laranja", "maça", "uva", "pera", "jabuticaba", "limão"]
// console.log("A posição da uva é: ", buscaSequencial(frutas, "uva"))

import { nomes } from './data/vetor-nomes.mjs'

console.log("Posição de ALEXANDRE: ", buscaSequencial(nomes, 'ALEXANDRE'))