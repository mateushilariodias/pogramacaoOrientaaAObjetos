/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista8;

import java.util.ArrayList;

/**
 *
 * @author mateu
 */
public class Cinema {
    private String nome, local;
    private ArrayList<Filme> filmes;

    public Cinema() {
        this.filmes = new ArrayList();
    }
    
    public Cinema(String nome, String local) {
        this.nome = nome;
        this.local = local;
        this.filmes = new ArrayList();
    }

    public Cinema(String nome, String local, ArrayList<Filme> filmes) {
        this.setNome(nome);
        this.setLocal(local);
        this.setFilmes(filmes);
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public final void setLocal(String local) {
        this.local = local;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public final void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
    public void addFilme(Filme filme) {
        this.filmes.add(filme);
    }

    public boolean removeFilme(Filme filme) {
        return this.filmes.remove(filme);
    }

    @Override
    public String toString() {
        return "\nCinema{" + "\nnome=" + nome + "\n, local=" + local + "\n, filmes=" + filmes + '}';
    }
    
}
