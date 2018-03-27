package modelo;

public class Administrativo extends Funcionario {
    
    private int codAdm;
    private long idAdm;

    public Administrativo(String nome, String cpf, int codAdm) {
        super(nome, cpf);
        this.codAdm = codAdm;
    }

        
    public int getCodAdm() {
        return codAdm;
    }

   
    public void setCodAdm(int codAdm) {
        this.codAdm = codAdm;
    }

    
    public long getIdAdm() {
        return idAdm;
    }

  
    public void setIdAdm(long idAdm) {
        this.idAdm = idAdm;
    }
    
    
}
