/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class aluno {
    int numeroAluno;
    String nome;
    int idade;
    float p1;
    float p2;
    
    public aluno(){
        
    }
    
        public aluno(int numeroAluno, String nome, int idade, 
            float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
        }
        
        public void notaFianl(){
            float notaFinal = (p1 + p2) / 2;
            System.out.println(notaFinal);
        }
    
        public void dadosAluno(){
             System.out.println("numero do aluno: " + this.numeroAluno + "\n Nome " + 
            this.nome + "\nidade " + this.idade);
        }
    
}
