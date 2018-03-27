
package modelo;

import java.util.List;


public class Aluno extends Pessoa{
    private String matricula;
    private long idMatricula;
    //plural listas
    private List<Aula> aula;
    private List<Professor> professor;
    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    
    public String getMatricula() {
        return matricula;
    }

    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

   
    public List<Aula> getAula() {
        return aula;
    }

    
    public void setAula(Aula aula) {
        this.aula = (List<Aula>) aula;
    }
    
    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = (List<Professor>) professor;
    }
    
}
