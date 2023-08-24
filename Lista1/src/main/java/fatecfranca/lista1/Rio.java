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

    String nome;
    float nível;
    Boolean poluído;

    public Rio() {

    }

    public Rio(String nome, float nível, Boolean poluído) {
        this.nome = nome;
        this.nível = nível;
        this.poluído = poluído;
    }

    public void chover(float x) {
        this.nível = nível + x;
        System.out.println("Aumentou o nível do rio!");
    }

    public void ensolarar(float y) {
        if (this.nível >= y) {
            this.nível = nível - y;
            System.out.println("Baixou o nível do rio!");
        } else {
            System.out.println("Secou!");
        }
    }

    public void limpar() {
        this.poluído = false;
        System.out.println(this.poluído);
    }

    public void sujar() {
        this.poluído = true;
        System.out.println(this.poluído);
    }

    public void mostrar() {
        System.out.println("Nome do rio: " + this.nome + "\n Nível do rio: " + this.nível + "\n Poluído: " + this.poluído);
    }

}
