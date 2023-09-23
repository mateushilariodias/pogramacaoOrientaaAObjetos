/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista5;

/**
 *
 * @author mateu
 */
public class Diretor extends Funcionario{
    private float acoesEmpresa;

    public Diretor() {
    }

    public Diretor(float acoesEmpresa, String nome, String endereco, String cpf, float salario) {
        super(nome, endereco, cpf, salario);
        this.setAcoesEmpresa(acoesEmpresa);
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public final void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }

    @Override
    public String toString() {
        return "\nDiretor{" + "\nacoesEmpresa=" + acoesEmpresa + super.toString() + '}';
    }
    
    @Override
    public float calculaSalario() {
        return this.salario + (8 * this.acoesEmpresa) / 12;
    }
    
}
