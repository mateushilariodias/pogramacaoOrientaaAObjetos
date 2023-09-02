/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista2;

/**
 *
 * @author mateu
 */
public class TestaPc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pc obj1 = new Pc();
        obj1.setMarca("Lenovo");
        obj1.setModelo("Ideapad 3");
        obj1.setRam(8);
        System.out.println("Ram " + obj1.getRam());
        obj1.setDisco(256);
        obj1.setProcessador("I7");
        
    }
    
    
    
}
