//ESTRUTURA DE DADOS FILA

export default class Queue {
  #data  //vetor privado

  constructor() {
    this.#data = []
  }

  //inserir dados na fila
  enqueue(val){
    this.#data.push(val)
  }

  //remover dados da fila
  dequeue(){
    return this.#data.shift() 
  }

  //espiar o início da fila
  peek() {
    return this.#data[0]
  }

  //fila está vazia?
  get isEmpty(){
    return this.#data.length === 0
  }

  //imprimir a fila
  print() {
    let output = '[ '
    for (let i = 0; i < this.#data.length; i++) {
      
      if(output !== '[ ') output += ', '

      output += `(${i+1}º da fila): ${this.#data[i]}`

    }
    return output + ' ]'
  }
}