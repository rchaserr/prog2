
package modelo;

import java.util.List;



public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    private long idPessoa;
    
public Pessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
}
    
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

    
    public void setEnderecos(Endereco endereco) {
        this.endereco = endereco;
    }
    
      
}
