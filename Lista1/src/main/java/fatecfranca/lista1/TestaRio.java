/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class TestaRio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rio obj1 = new Rio("Tiete", 23.4f, true);
        obj1.chover(1.4f);
        obj1.ensolarar(2.6f);
        obj1.sujar();
        obj1.mostrar();
        Rio obj2 = new Rio("Nilo", 27.9f, false);
        obj2.chover(4.2f);
        obj2.ensolarar(4.1f);
        obj2.limpar();
        obj2.mostrar();
    }
    
}
