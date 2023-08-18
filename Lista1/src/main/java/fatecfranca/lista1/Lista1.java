/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatecfranca.lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class Lista1 {

    public static void main(String[] args) {
        
        Produto obj1 = new Produto();
        
        obj1.id = 1;
        obj1.nome = "bolacha";
        obj1.descricao = "Recheio";
        obj1.quantidade = 30;
        obj1.estoqueCritico = false;
        obj1.preco = 3.20f;
                
        System.out.println("id: "+ obj1.id + 
        "\nnome: "+ obj1.nome +
        "\ndescrição: "+ obj1.descricao +
        "\nquantidade: "+ obj1.quantidade +
        "\npreço: "+ obj1.preco );
        
        
        Produto obj2 = new Produto();
        
        obj2.id = 1;
        obj2.nome = "Sorvete";
        obj2.descricao = "Delicial";
        obj2.quantidade = 11;
        obj2.estoqueCritico = true;
        obj2.preco = 6.80f;
                
        System.out.println("id: "+ obj2.id + 
        "\nnome: "+ obj2.nome +
        "\ndescrição: "+ obj2.descricao +
        "\nquantidade: "+ obj2.quantidade +
        "\npreço: "+ obj2.preco );
        
        JOptionPane.showMessageDialog(null,
            "id: "+ obj2.id + 
            "\nnome: "+ obj2.nome +
            "\ndescrição: "+ obj2.descricao +
            "\nquantidade: "+ obj2.quantidade +
            "\npreço: "+ obj2.preco);
    }
}
