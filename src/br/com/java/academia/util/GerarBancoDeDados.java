
package br.com.java.academia.util;

import br.com.java.academia.model.Administrativo;
import br.com.java.academia.model.Aluno;
import br.com.java.academia.model.Disciplina;
import br.com.java.academia.model.Endereco;
import br.com.java.academia.model.Professor;

/**
 *
 * @author josé henrique
 */
public class GerarBancoDeDados {
    public static void main(String []args){
        
        /* criando aluno */
        Aluno al1 = new Aluno();
        al1.setMatricula("20181");
        al1.setCpf("22222222222");
        al1.setNome("Paula");
//        al1.inserir();
        
        /* criando endereco */
        Endereco end1 = new Endereco();
        end1.setCep("21211211");
        end1.setNum(20);
        end1.setRua("rua brasil");
//        end1.inserir();
        
        /* criando administrativo */
        Administrativo adm1 = new Administrativo();
        adm1.setCpf("33333333333");
        adm1.setNome("Juarez");
//        adm1.setEndereco(new Endereco("33333330","rua p",10,null ));
        
        /*criando professor */
        Professor prof1 = new Professor();
        prof1.setNome("João");
        prof1.setCpf("11111111111");
        prof1.setSalario(100.0f);
//        prof1.inserir();
        
        /* criando aula = piscina */
        Disciplina piscina = new Disciplina();
        piscina.setNome("natacao");
//        piscina.setQuantidadeAulunos(10);
        piscina.setTempo(50.0);
//        piscina.inserir();
        
//        al1.addAula(piscina);
//        al1.setEndereco(end1);
//        end1.setPessoa(al1);
//        
//        piscina.addAlunos(al1);
//        piscina.setProfessor(prof1);
//        
//        prof1.addAula(piscina);
        
//        al1.inserir();
//        piscina.inserir();
//        prof1.inserir();
//        end1.inserir();
        adm1.inserir(); 
    } 
}
