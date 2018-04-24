package br.com.java.academia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Aluno extends Pessoa {
    
    @OneToMany
     private List<Turma> turmas;
    
    @Column(nullable=false)
    private String matricula;

    public Aluno() {
        super();
        this.matricula = "";
        this.turmas = null;
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
   
    public List<Turma> getTurmas() {
        return this.turmas;
    }
}
