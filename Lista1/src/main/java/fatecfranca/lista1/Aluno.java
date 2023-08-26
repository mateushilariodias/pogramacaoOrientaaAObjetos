/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;
    
        public Aluno(){

        }
    
        public Aluno(int numeroAluno, String nome, int idade, 
            float p1, float p2){
                this.numeroAluno = numeroAluno;
                this.nome = nome;
                this.idade = idade;
                this.p1 = p1;
                this.p2 = p2;
        }
        
        public float notaFinal(){
            float notaFinal = (p1 + p2) / 2;
            return notaFinal;
        }
    
        public String dadosAluno(){
            return "numero do aluno: " + this.numeroAluno + "\n Nome " + this.nome + "\nidade " + this.idade;
        }
        
        public String passou(){
            return (this.notaFinal() >= 6) ? "Aprovado!" : "Reprovado.";
        }
}
