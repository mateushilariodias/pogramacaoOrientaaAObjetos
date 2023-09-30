/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista7;

/**
 *
 * @author mateu
 */
public abstract class Pessoa {
    protected String nome, cpf, endereco, dataDeNascimento, email;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, String endereco, String dataDeNascimento, String email) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setDataDeNascimento(dataDeNascimento);
        this.setEmail(email);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public final void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public final void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public final void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public final void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nPessoa{" + "\nnome=" + nome + "\n, cpf=" + cpf + "\n, endereco=" + endereco + "\n, dataDeNascimento=" + dataDeNascimento + "\n, email=" + email + '}';
    }
    
}
