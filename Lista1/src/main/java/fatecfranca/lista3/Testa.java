/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista3;

/**
 *
 * @author mateu
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Product objProject1 = new Product("Barra de chocolate", 12f);

        CarItem objCI1 = new CarItem(2, objProject1);
        CarItem objCI2 = new CarItem(5, objProject1);

        // System.out.println(objCI1.toString());
        // stem.out.println(objCI2.toString());
        ShoppingCart objSC1 = new ShoppingCart();
        
        objSC1.setId(10);
        objSC1.addCarItem(objCI1);
        objSC1.addCarItem(objCI2);
        System.out.println(objSC1.toString());

    }

}
