/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class TestaCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1062231855, 016, "Mateus", 188.697f);
          obj1.realizarDeposito(17.620f);
          obj1.realizarSaque(1434.45f);
        Cliente obj2 = new Cliente(1062241855, 017, "Sofia", 145.697f);
          obj2.realizarDeposito(34.100f);
          obj2.realizarSaque(144.05f);
    }
    
}
