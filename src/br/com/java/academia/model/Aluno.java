package br.com.java.academia.model;

import java.util.List;
import javax.persistence.*;

@Entity
public class Aluno extends Pessoa {
    
    @Column(nullable=false)
    private String matricula;
    
    @OneToMany
    private List<Aula> aulas;

    public Aluno() {
        super();
        this.matricula = "";
    }
    
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
        return aulas;
    }
    
    public void addAula(Aula aula) {
        this.aulas.add(aula);
    } 
}
