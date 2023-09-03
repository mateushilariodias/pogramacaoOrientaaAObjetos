/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista2;

/**
 *
 * @author mateu
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente obj1 = new Cliente("123456-7", "1234-5", "Mateus", 70000000.00f);
        obj1.depositar(5000.00f);
        obj1.sacar(7000.0f);
        System.out.println(obj1.toString());
        
        Cliente obj2 = new Cliente("1236-7", "12347-75", "Sofia", 1000.00f);
        obj2.depositar(3000.00f);
        obj2.sacar(8000.0f);
        System.out.println(obj2.toString());
        
        //int nomeDoCliente = obj1.nome;
        //  Ao tentar acessar as variáveis de instância da classe Cliente sem os métodos get e set, ocorre um erro de compilação devido ao modificador de acesso private dessas variáveis. Elas são inacessíveis fora da classe Cliente.

    }
    
}
