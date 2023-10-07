/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista5;

/**
 *
 * @author mateu
 */
public abstract class Funcionario {

    protected String nome, endereco, cpf;
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String endereco, String cpf, float salario) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public final void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" + "\nnome=" + nome + "\n, endereco=" + endereco + ",\n cpf=" + cpf + ",\n salario=" + salario + '}';
    }

    public abstract float calculaSalario();

}
