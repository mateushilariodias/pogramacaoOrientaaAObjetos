/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista7;

/**
 *
 * @author mateu
 */
public class Professor extends Pessoa{
    private float salario;

    public Professor() {
    }

    public Professor(float salario, String nome, String cpf, String endereco, String dataDeNascimento, String email) {
        super(nome, cpf, endereco, dataDeNascimento, email);
        this.setSalario(salario);
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nProfessor{" + "\nsalario=" + salario +  super.toString() + '}';
    }
    
}
