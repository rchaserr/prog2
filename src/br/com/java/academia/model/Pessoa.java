package br.com.java.academia.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Pessoa extends Modelo<Pessoa>{
    
    @Column(nullable=false)
    private String nome;
    
    @Column(nullable=false, unique=true)
    private String cpf;
    
    @OneToOne
    private Endereco endereco;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPessoa;

    public String getNome() {
        return nome;
    }
  
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Pessoa() {
        this.nome = "";
        this.cpf = "";
    }
    
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
}
