/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatecfranca.lista7;

/**
 *
 * @author mateu
 */
public class Aluno extends Pessoa{
    private String ra, curso;

    public Aluno(){
    }

    public Aluno(String ra, String curso, String nome, String cpf, String endereco, String dataDeNascimento, String email) {
        super(nome, cpf, endereco, dataDeNascimento, email);
        this.setRa(ra);
        this.setCurso(curso);
    }

    public String getRa() {
        return ra;
    }

    public final void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public final void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "\nAluno{" + "\nra=" + ra + "\n, curso=" + curso +  super.toString() + '}';
    }
    
}
