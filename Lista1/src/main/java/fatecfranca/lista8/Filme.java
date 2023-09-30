/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista8;

/**
 *
 * @author mateu
 */
public class Filme {
    private String nome;
    private Integer duracao;
    private float precoDeExibicao;

    public Filme() {
    }

    public Filme(String nome, Integer duracao, float precoDeExibicao) {
        this.setNome(nome);
        this.setDuracao(duracao);
        this.setPrecoDeExibicao(precoDeExibicao);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public final void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public float getPrecoDeExibicao() {
        return precoDeExibicao;
    }

    public final void setPrecoDeExibicao(float precoDeExibicao) {
        this.precoDeExibicao = precoDeExibicao;
    }

    @Override
    public String toString() {
        return "\nFilme{" + "\nnome=" + nome + "\n, duracao=" + duracao + "\n, precoDeExibicao=" + precoDeExibicao + '}';
    }
        
}
