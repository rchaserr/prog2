
package model;


public class Professor extends Funcionario{
    
    private long idProfessor;
   

    public Professor(String nome, String cpf,long idProfessor) {
        super(nome, cpf);
        this.idProfessor = idProfessor;
    }

   
   

   
    public long getIdProfessor() {
        return idProfessor;
    }

    
    public void setIdProfessor(long idProfessor) {
        this.idProfessor = idProfessor;
    }
    
    
    
}