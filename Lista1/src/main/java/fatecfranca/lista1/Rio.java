/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class Rio {

    public String nome;
    public float nivel;
    public Boolean poluido;

    public Rio() {

    }

    public Rio(String nome, float nivel, Boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x) {
        this.nivel = nivel + x;
        System.out.println("Aumentou o nível do rio!");
    }

    public void ensolarar(float y) {
        if (this.nivel >= y) {
            this.nivel = nivel - y;
            System.out.println("Baixou o nível do rio!");
        } else {
            System.out.println("Secou!");
        }
    }

    public void limpar() {
        this.poluido = false;
        System.out.println(this.poluido);
    }

    public void sujar() {
        this.poluido = true;
        System.out.println(this.poluido);
    }

    public void mostrar() {
        System.out.println("Nome do rio: " + this.nome + "\n Nível do rio: " + this.nivel + "\n Poluído: " + this.poluido);
    }

}
