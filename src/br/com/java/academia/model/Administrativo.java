package br.com.java.academia.model;

public class Administrativo extends Funcionario {

    private long idAdm;

    public Administrativo(String nome, String cpf) {
        super(nome, cpf);
    }
 
    public long getIdAdm() {
        return idAdm;
    }

    public void setIdAdm(long idAdm) {
        this.idAdm = idAdm;
    }
}
