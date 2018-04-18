
package br.com.java.academia.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Funcionario extends Pessoa {
    
    @Column
    private float salario;
        
    public Funcionario(){
        super();
    }
    
    public Funcionario(String nome, String cpf, float salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}