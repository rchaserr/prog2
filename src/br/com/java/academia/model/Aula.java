package br.com.java.academia.model;

import java.util.List;

public class Aula extends Modelo<Aula>{
  private String nome; 
  private double tempo;
  private int quantidadeAulunos;
  private long idAula;
  
  private List<Aluno> alunos;
  private List<Professor> professores;
  
  
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getTempo() {
        return tempo;
    }
    
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    public int getQuantidadeAulunos() {
        return quantidadeAulunos;
    }
    
    public void setQuantidadeAulunos(int quantidadeAulunos) {
        this.quantidadeAulunos = quantidadeAulunos;
    }
    
    public List<Aluno> getAlunos() {
        return this.alunos;
    }
   
    public void addAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }
   
    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void addProfessor(Professor professor) {
        this.professores.add(professor);
    }   
    

}
