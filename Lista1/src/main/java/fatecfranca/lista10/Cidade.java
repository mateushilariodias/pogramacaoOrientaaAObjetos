/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista10;

/**
 *
 * @author mateu
 */
public class Cidade {
    public void contrata(Professor p){
        p.ensina();
        p.trabalha();
    }
    public void contrata(Empregado e){
        e.trabalha();
    }
    public void cobrarDe(Contribuinte c){
        c.pagaIr();
    }
    public void registra(Cidadao c){
        c.tiraRg();
    }
    public void alimenta(Animal a){
        a.come();
    }
    
}
