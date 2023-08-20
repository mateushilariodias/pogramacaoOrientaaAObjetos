/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista1;

/**
 *
 * @author mateu
 */
public class Cliente {
    int numeroConta ;
    int numeroAgencia ;
    String nome ;
    float saldo ;

        public Cliente(){

        }
    
        public Cliente( int numeroConta, int numeroAgencia, String nome , float saldo){
                this.numeroConta = numeroConta;
                this.numeroAgencia = numeroAgencia;
                this.nome = nome;
                this.saldo = saldo;
        }
        
        public void realizarDeposito(float x){
            this.saldo = saldo + x;
            System.out.println("Depositado com sucesso!");
        }
        
        public void realizarSaque(float y){
            if(y > this.saldo){
                System.out.println("Não se pode sacar mais do que se tem!");
            }else{
                saldo = saldo - y;
                System.out.println("Saque realizado com sucesso!");
            }
        }
        
        public void mostraObjeto(){
        System.out.println("Númeero da conta: " + this.numeroConta + "\n Nome do cliente " + 
            this.nome + "\n Saldo " + this.saldo);
    }
        
}
