/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista6;

/**
 *
 * @author mateu
 */
public class testa {

    public static void show(Animal animal) {
        System.out.println(animal.toString());
        System.out.println(animal.move());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Snake objSnake = new Snake(true, false, "Cobra", 3);
        show(objSnake);
        Horse objHorse = new Horse(true, "Cavalo", 5);
        show(objHorse);

    }

}
