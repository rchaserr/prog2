package br.com.java.academia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Professor extends Funcionario{
    
    @OneToMany
     private List<Turma> turmas;
    
    @OneToMany
    private List<Disciplina> aulas;

    public Professor() {
        super();
        this.aulas = new ArrayList();
    }
    
    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    public List<Disciplina> getAulas() {
        return aulas;
    }

    public void addAula(Disciplina aula) {
        this.aulas.add(aula);
    }
}