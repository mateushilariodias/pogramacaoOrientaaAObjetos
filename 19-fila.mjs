import Queue from './lib/Queue.mjs';

let fila = new Queue();

console.log("Está vazia?", fila.isEmpty);

fila.enqueue("João");
fila.enqueue("Maria");
fila.enqueue("José");
fila.enqueue("Orkutilson");
fila.enqueue("Osnir");

console.log("Está vazia?", fila.isEmpty);

//imprimir a fila
console.log(fila.print());

//espiar o início da fila
console.log("Próximo:", fila.peek());

//remover dados da fila
let atendido = fila.dequeue();
console.log("Atendido:", atendido);

console.log(fila.print());

//espiar o início da fila
console.log("Próximo:", fila.peek());