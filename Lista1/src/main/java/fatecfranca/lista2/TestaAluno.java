/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatecfranca.lista2;

/**
 *
 * @author mateu
 */
public class TestaAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno obj1 = new Aluno(123456, 17, "Douglas", 7.8f, 6.3f);
        System.out.println(obj1.notaFinal());
        System.out.println(obj1.dadosAluno());

        //int nomeDoAluno = obj1.nome;
        //  Ao tentar acessar as variáveis de instância da classe Aluno sem os métodos get e set, ocorre um erro de compilação devido ao modificador de acesso private dessas variáveis. Elas são inacessíveis fora da classe Aluno.
    }

}
