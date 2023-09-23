/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista5;

/**
 *
 * @author mateu
 */
public class Testa {
    
    public static void mostra(Funcionario objeto){
        System.out.println(objeto.toString());
        System.out.println(objeto.calculaSalario());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Assistente objAss = new Assistente (4, "Sofia", "São Paulo", "123", 3000);
        mostra(objAss);
        Gerente objGer = new Gerente (1000, "Mateus", "Franca", "456", 12000);
        mostra(objGer);
        Diretor objDir = new Diretor (68, "Arthur", "Ribeirão Preto", "789", 5000000);
        mostra(objDir);
    }
    
}
