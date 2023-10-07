/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista9;

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
        JogadorBasquete objJB = new AtletaBasqueteFutebol();
        objJB.arremessar();
        objJB.enterrar();
        objJB.fazerBandeja();
        
        AtletaBasqueteFutebol objABF = new AtletaBasqueteFutebol();
        objABF.arremessar();
        objABF.baterPenalti();
        objABF.enterrar();
        objABF.fazerBandeja();
        objABF.fazerCera();
        objABF.fazerGol();
        
    }
    
}
