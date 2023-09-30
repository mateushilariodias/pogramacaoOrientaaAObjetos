/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista7;

/**
 *
 * @author mateu
 */
public class Testa {

    public static void mostra(Pessoa objeto){
        System.out.println(objeto.toString());
    }
    
    public static void main(String[] args) {
        Aluno objA = new Aluno ( "789", "ADS", "Sofia", "123", "São Paulo", "19/09/2004", "sofia@gmail.com");
        mostra(objA);
        Professor objP = new Professor (7.906f, "Mateus", "321", "Franca", "15/09/1989", "mateus@gmail.com");
        mostra(objP);
    }
    
}
