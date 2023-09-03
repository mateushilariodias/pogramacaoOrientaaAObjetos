/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista2;

/**
 *
 * @author mateu
 */
public class Aluno {
    private int numeroAluno, idade;
    private String nome;
    private float p1, p2;

    public Aluno(int numeroAluno, int idade, String nome, float p1, float p2) {
        this.setNumeroAluno(numeroAluno);
        this.setIdade(idade);
        this.setNome(nome);
        this.setP1(p1);
        this.setP2(p2);
    }

    public Aluno() {}
    
    public int getNumeroAluno() {
        return numeroAluno;
    }

    public final void setNumeroAluno(int numeroAluno) {
        if (String.valueOf(numeroAluno).length() == 6) {
            this.numeroAluno = numeroAluno;
        } else {
            System.out.println("Número da conta inválido!");
        }
    }

    public int getIdade() {
        return idade;
    }

    public final void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser negativa!");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if (nome.length() <= 30) {
            this.nome = nome;
        } else {
            this.nome = "";
            System.out.println("Nome muito longo! Deve ter no máximo 30 caracteres.");
        }
    }

    public float getP1() {
        return p1;
    }

    public final void setP1(float p1) {
        if (p1 >= 0) {
            this.p1 = p1;
        } else {
            System.out.println("A nota da p1 não pode ser negativa!");
        }
    }

    public float getP2() {
        return p2;
    }

    public final void setP2(float p2) {
        if (p2 >= 0) {
            this.p2 = p2;
        } else {
            System.out.println("A nota da p2 não pode ser negativa!");
        }
    }
    
    public float notaFinal() {
        return ((this.p1 + this.p2) /2);
    }

    public String dadosAluno() {
        return "Aluno{" + "numeroAluno=" + numeroAluno + ", idade=" + idade + ", nome=" + nome + '}';
    }
    
}
