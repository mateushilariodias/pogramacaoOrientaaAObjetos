/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista4;

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
        Person objPrs1 = new Person ("Mateus", "mateushilariodias");
        Message objMsg1 = new Message ("Oii, estou melhor agora falando com você", objPrs1);
        Message objMsg2 = new Message ("Oii, bobo kkkk", objPrs1);
        Forum objFr1 = new Forum ();
        objFr1.setName("Rafael");
        objFr1.setUrl("www.lover.com.br");
        Forum objFr2 = new Forum("Sofia", "http://forumlgbtqpniaplus.com");
        objFr1.addMessage(objMsg1);
        objFr1.addMessage(objMsg2);
        objFr1.removeMessage(objMsg1);
        System.out.println(objFr1.toString());
        
    }
    
}
