// ESTRUTURA DE DADOS LISTA DUPLAMENTE ENCADEADA

class Node{
  
  prev
  data
  next

  constructor(val){
    this.prev = null // ponteiro para o nó anterior
    this.data = val  // armazena a informação relevante para o usuário
    this.next = null // ponteiro para o próximo nó
  } 
}

export default class DoublyLinkedList{

  #head  // início da lista
  #tail  // fim da lista
  #count // quantidade de nós na lista

  constructor(){
    this.#head = null
    this.#tail = null
    this.#count = 0
  }

  // Getter que retorna se a lista está vazia
  get isEmpty(){
    return this.#count === 0
  }

  // Getter que retorna a quantidade de nós na lista
  get count(){
    return this.#count
  }

  // Método PRIVADO que encontra um nodo por sua posição
  #findNode(pos){
    let node
    if(pos < this.#count / 2) {
      node = this.#head
      for (let i = 0; i < pos; i++) {
        node = node.next
      }
    } else {
      node = this.#tail
      for (let i = this.#count - 1; i > pos; i--) {
        node = node.prev
      }
    }
    return node
  }

  // Método para inserir em qualquer posição
  insert(pos, val){

    let inserted = new Node(val)

    // 1º caso: lista vazia
    if(this.isEmpty){
      this.#head = inserted
      this.#tail = inserted
    }

    // 2º caso: inserção no início
    else if(pos === 0){
      inserted.next = this.#head
      this.#head.prev = inserted
      this.#head = inserted
    }

    // 3º caso: inserção no fim
    else if(pos >= this.#count){
      inserted.prev = this.#tail
      this.#tail.next = inserted
      this.#tail = inserted
    }

  }
}