package br.com.java.academia.model;

public class Professor extends Funcionario{
    
    private long idProfessor;
    
    public Professor(){
        this.idProfessor=idProfessor;
    }
   
    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    public long getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(long idProfessor) {
        this.idProfessor = idProfessor;
    }
    
}