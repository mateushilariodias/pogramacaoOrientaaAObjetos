function bubbleSort(vetor, fnComp){
    let swap

    do{
        swap = false
        for(let i=0; i < vetor.length - 1; i++){
            if(fnComp(vetor[i], vetor[i+1])){
                [ vetor[i], vetor[i+1] ] = [ vetor[i+1] , vetor[i] ]
                swap = true
            }
        }
    }while(swap)
}

import {objMotoristas} from './data/motoristas-obj-desord.mjs'

// //ordenação crescente
// console.time('Tempo de ordenação')
// bubbleSort(objMotoristas,(elem1,elem2) => elem1.nome_motorista > elem2.nome_motorista)
// console.timeEnd('Tempo de ordenação')
// console.log(objMotoristas)

// //ordenação decrescente
// console.time('Tempo de ordenação')
// bubbleSort(objMotoristas,(elem1,elem2) => elem1.nome_motorista < elem2.nome_motorista)
// console.timeEnd('Tempo de ordenação')
// console.log(objMotoristas)

//ordenação decrescente ignorando acentos
// console.time('Tempo de ordenação')
// bubbleSort(objMotoristas,(elem1,elem2) => elem1.nome_motorista.localeCompare(elem2.nome_motorista, 'pt-br') <=0)
// console.timeEnd('Tempo de ordenação')
// console.log(objMotoristas)


//Ordenação Dois Níveis: primeiro por razão_social, depois por nome_motorista
bubbleSort(objMotoristas, (elem1, elem2) => {
    if(elem1.razao_social === elem2.razao_social){
        return elem1.nome_motorista > elem2.nome_motorista
        }
        return elem1.razao_social > elem2.razao_social
})

console.log(objMotoristas)