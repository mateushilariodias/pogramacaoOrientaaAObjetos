/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista2;

/**
 *
 * @author mateu
 */
public class Cliente {

    private String numeroConta, numeroAgencia, nome;
    private float saldo;

    public Cliente(String numeroConta, String numeroAgencia, String nome, float saldo) {
        this.setNumeroConta(numeroConta);
        this.setNumeroAgencia(numeroAgencia);
        this.setNome(nome);
        this.setSaldo(saldo);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public final void setNumeroConta(String numeroConta) {
        if (numeroConta.length() == 8 && numeroConta.charAt(6) == '-') {
            this.numeroConta = numeroConta;
        } else {
            this.numeroConta = "";
            System.out.println("Número da conta inválido!");
        }
    }

    public String getNumeroAgencia() {
        return numeroAgencia;
    }

    public final void setNumeroAgencia(String numeroAgencia) {
        if (numeroAgencia.length() == 6 && numeroAgencia.charAt(4) == '-') {
            this.numeroAgencia = numeroAgencia;
        } else {
            this.numeroAgencia = "";
            System.out.println("Número da agencia inválido!");
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

    public float getSaldo() {
        return saldo;
    }

    public final void setSaldo(float saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O saldo não pode ficar negativo!");
        }
    }
    
    public void depositar(float x) {
        this.setSaldo(this.saldo + x);
    }
    
    public void sacar(float y) {
        this.setSaldo(this.saldo - y);
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "numeroConta=" + numeroConta + ", numeroAgencia=" + numeroAgencia + ", nome=" + nome + ", saldo=" + saldo + '}';
    }

}
