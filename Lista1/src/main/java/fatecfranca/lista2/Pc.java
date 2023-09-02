/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista2;

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
    
    public Pc (String marca, String modelo, String processador, int ram, int disco) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setProcessador(processador);
        this.setRam(ram);
        this.setDisco(disco);
        
    }

    public final void setMarca(String marca) {
        this.marca = marca;
    }

    public final void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public final void setRam(int ram) {
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
    
    public final void setDisco(int disco){
        if (disco % 120 == 0) {
            this.disco = disco;
        }
        else {
            this.disco = 0;
            System.out.println("Como não foi passado nehum valor, atribuiremos ele a zero!");
        }
    }
    
    public final void setProcessador(String processador) {
        this.processador = processador;
    }
    
    public int getDisco(){
        return this.disco;
    }
    
    public String getProcessador(){
        return this.processador;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    @Override
    public String toString(){
        return "Marca "+ this.marca + "Modelo"+ this.modelo + "Processador"+ this.processador + "Ram "+ this.ram + "Disco" + this.disco;
    }
}
