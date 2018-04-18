package br.com.java.academia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Professor extends Funcionario{
    
    @OneToMany
    private List<Aula> aulas;

    public Professor() {
        super();
        this.aulas = new ArrayList();
    }
    
    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void addAula(Aula aula) {
        this.aulas.add(aula);
    }
}