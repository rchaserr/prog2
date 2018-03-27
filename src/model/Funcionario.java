
package model;


public abstract class Funcionario extends Pessoa{
    
    private long idFunc;
    
    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }
}