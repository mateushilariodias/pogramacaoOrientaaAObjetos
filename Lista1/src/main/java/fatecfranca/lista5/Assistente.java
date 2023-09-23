/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista5;

/**
 *
 * @author mateu
 */
public class Assistente extends Funcionario{
    private float horasExtras;

    public Assistente() {
        super();
    }

    public Assistente(float horasExtras, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.setHorasExtras(horasExtras);
    }

    public float getHorasExtras() {
        return horasExtras;
    }

    public final void setHorasExtras(float horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public String toString() {
        return "\nAssistente{" + "\nhorasExtras=" + horasExtras + super.toString() + '}';
    }  
    
    @Override
    public float calculaSalario() {
        return this.salario +(this.horasExtras * 30);
    }
    
}
