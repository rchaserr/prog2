
package br.com.java.academia.model;

public class Endereco extends Modelo<Endereco>{
    private String cep;
    private String rua;
    private int num;
    private Pessoa pessoa;
    private long idEndereco;
    
    public Endereco(String cep, String rua, int num, Pessoa pessoa){
        this.cep = cep;
        this.rua = rua;
        this.num = num;
        this.pessoa = pessoa;
    }
    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the rua
     */
    public String getRua() {
        return rua;
    }

    /**
     * @param rua the rua to set
     */
    public void setRua(String rua) {
        this.rua = rua;
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    
    
}
