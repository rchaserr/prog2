

package modelo;


public class Salario {
    
    private double valor;
    private long idSalario;
    
    public double getValor() {
        return valor;
    }

    
    public void setValor(double valor) {
        if(valor>=0){
        this.valor = valor;
        }
    }
    
    
    
}
