package model;

import java.util.List;

public class Aula {
    
  private double tempo;
  private int quantidadeAulunos;
  private long idAula;
  private List<Aluno> aluno;
  private List<Professor> professor;
    
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

    
    public List<Aluno> getAluno() {
        return aluno;
    }

   
    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

   
    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = (List<Professor>) professor;
    }
  
  
    
}
