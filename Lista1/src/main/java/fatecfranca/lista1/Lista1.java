/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package fatecfranca.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author daniel.pires
 */
public class Lista1 {

    public static void main(String[] args) {
        // cria os objetos da classe Produto
        // () indica a chamada de um método, especial chamado construtor
        // método tem o mesmo nome da classe 
        Produto obj1 = new Produto(1, "bolacha", "recheada com chocolate",
                30, false, 10f);
        // toda classe em Java recebe um pacote chamado 
        // java.lang, que possui várias classes
        obj1.mostraObjeto();
        
        Produto obj2 = new Produto(2, "sorvete", "sabor baunilha", 
                        12, true, 6.80f);
        // toda classe em Java recebe um pacote chamado 
        // java.lang, que possui várias classes
        obj2.mostraObjeto();
        
        JOptionPane.showMessageDialog(null, 
           "Id: " + obj2.id + "\n Nome " + obj2.nome + "\n Descrição " + 
           obj2.descricao + "\n Qtde: " +obj2.qtde + "\n Preço " + obj2.preco);
    
        obj1.comprar(30);
        obj1.vender(61);
        obj1.aumentarPreco(10);
        obj1.diminuirPreco(10);
    }
}