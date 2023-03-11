let pass, trocas, comp

function bubbleSort(vetor){

    pass= 0, trocas = 0, comp =0

    let swap

    do{
        pass++
        swap = false

        for(let i=0; i < vetor.length - 1; i++){
            comp++
            if(vetor[i] > vetor[i+1]){
                [ vetor[i], vetor[i+1] ] = [ vetor[i+1] , vetor[i] ]
                swap = true
                trocas++
            }
        }

    }while(swap)
}
// let nums = [0,1,2,3,4,5,6,7,8,9]

// bubbleSort(nums)
// console.log("Ordenação: ", nums)
// console.log({pass, comp, trocas})
import {nomes} from './data/nomes-desord.mjs'

console.time('Tempo de ordenação')
bubbleSort(nomes)
console.timeEnd('Tempo de ordenação')

console.log(nomes)
console.log({pass, comp, trocas})
