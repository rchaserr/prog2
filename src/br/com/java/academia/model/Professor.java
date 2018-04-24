package br.com.java.academia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Professor extends Funcionario{
    
    @OneToMany
     private List<Turma> turmas;

    public Professor() {
        super();
        this.turmas = null;
    }
    
    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    public List<Turma> getTurmas() {
        return turmas;
    }
}