/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Aluno obj1 = new Aluno(1062231855, "Mateus", 18, 8.9f , 9.8f);
          System.out.println(obj1.dadosAluno());
          System.out.println(obj1.notaFinal());
          System.out.println(obj1.passou());
    }
    
}
