package br.com.java.academia.model;

import javax.persistence.*;

@Entity
public class Administrativo extends Funcionario {

    public Administrativo(String nome, String cpf, float salario) {
        super(nome, cpf, salario);
    }
    
    public Administrativo() {
        super();
    }
}
