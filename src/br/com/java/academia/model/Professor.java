package br.com.java.academia.model;

import java.util.List;
import javax.persistence.*;

@Entity
public class Professor extends Funcionario{
    
    @OneToMany
    private List<Aula> aulas;

    public Professor() {
        super();
    }
    
    public Professor(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }
}