
package br.com.java.academia.util;

import br.com.java.academia.model.Administrativo;
import br.com.java.academia.model.Aluno;
import br.com.java.academia.model.Aula;
import br.com.java.academia.model.Endereco;
import br.com.java.academia.model.Professor;

/**
 *
 * @author josé henrique
 */
public class GerarBancoDeDados {
    public static void main(String []args){
           /* Criando a aula de natacao*/
        Aula piscina = new Aula();
        piscina.setNome("natacao");
        piscina.setQuantidadeAulunos(10);
        piscina.setTempo(50.0);
        piscina.inserir();
        
        Professor prof1 = new Professor();
        prof1.setNome("João");
        prof1.setCpf("11111111111");
        prof1.setEndereco(new Endereco("11111140", "rua x", 11,null ));
        prof1.inserir();
        
        
        Aluno al1 = new Aluno();
        al1.setMatricula("20181");
        al1.setCpf("22222222222");
        al1.setNome("Paula");
        al1.setEndereco(new Endereco("2222222","av z",50, null));
        al1.inserir();
        
        Endereco end1 = new Endereco();
        end1.setCep("21211211");
        end1.setNum(20);
        end1.setRua("rua brasil");
        end1.setPessoa(prof1);
        end1.inserir();
        
        Administrativo adm1 = new Administrativo();
        adm1.setCpf("33333333333");
        adm1.setNome("Juarez");
        adm1.setEndereco(new Endereco("33333330","rua p",10,null ));
        adm1.inserir();
        
        
        
     
 
        
    }
    
}
