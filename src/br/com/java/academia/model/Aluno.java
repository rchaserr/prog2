package br.com.java.academia.model;

import java.util.List;

public class Aluno extends Pessoa {
    
    private String matricula;
    private long idMatricula;
    
    //plural listas
    private List<Aula> aula;
    
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
    
    public void addAula(Aula aula) {
        this.aula.add(aula);
    } 
}
