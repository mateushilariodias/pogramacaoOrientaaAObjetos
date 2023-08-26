/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_2_ex0;

/**
 *
 * @author mateu
 */
public class Pc {

    private String marca, modelo;
    private String processador;
    private int ram, disco;

    public Pc() {

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setRam(int ram) {
        if (ram % 2 == 0 && ram >= 0) {
            this.ram = ram;
        } else {
            System.out.println("A ram deve ser maior que zero e ímpar");
            this.ram = 0;
        }
    }

    public int getRam(){
        return this.ram;
    }
    
}
