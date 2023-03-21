let pass, comp, trocas

function selecionSort(vetor){

    pass = 0, comp = 0, trocas = 0

    for (let posSel = 0; posSel < vetor.length -1; posSel++){
        pass++

        let posMenor = posSel+1

        for(let i = posMenor + 1; i < vetor.length; i++){
            if(vetor[posMenor] > vetor[i]){
                posMenor = i
                comp++
            }
        }

        if(vetor[posSel] > vetor[posMenor]){
            [ vetor[posSel], vetor[posMenor] ]= [ vetor[posMenor], vetor[posSel] ]
            trocas++
        }
    }
}

// let nums = [77, 44, 22, 33, 99, 55, 88, 0, 66, 11]

// selecionSort(nums)
// console.log(nums)

import {nomes} from './data/nomes-desord.mjs'

console.time('Tempo de ordenação')
selecionSort(nomes)
console.timeEnd('Tempo de ordenação')

console.log(nomes)
console.log({pass, comp, trocas})