import Deque from './lib/Deque.mjs';

//Lista de compras

let listaCompras = new Deque();
console.log(listaCompras.isEmpty);
console.log(listaCompras.print());

//Produtos Alimentícios no início da lista
listaCompras.insertFront('Arroz');
listaCompras.insertBack('Feijão');
listaCompras.insertBack('Macarrão');
console.log(listaCompras.print());

//Produtos de Higiene/Limpeza no final da lista
listaCompras.insertBack('Sabão em pó');
listaCompras.insertBack('Sabonete');
listaCompras.insertBack('Pasta de dente');
console.log(listaCompras.print());

//produtos add depois
listaCompras.insertFront('Café');
listaCompras.insertBack('Agua Sanitária');

console.log(listaCompras.print());

//removendo produtos
let removido = listaCompras.removeBack();
listaCompras.removeFront();

console.log({removido});

console.log(listaCompras.print());

