package br.com.java.academia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Disciplina extends Modelo<Disciplina>{

    /**
     * @return the turmas
     */
    public List<Turma> getTurmas() {
        return turmas;
    }

    /**
     * @param turmas the turmas to set
     */
    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }
    
    @OneToMany
    private List<Turma> turmas;
    
    @Column(nullable=false)
    private String nome;
    
    @Column(nullable=false)
    private double tempo;
    
    @Column(nullable=false)
    private int quantidadeAulunos;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAula;
    
    @OneToMany
    private List<Aluno> alunos;
    
    @OneToOne
    private Professor professor;

    public Disciplina() {
        this.nome = "";
        this.tempo = 0;
        this.quantidadeAulunos = 0;
        this.alunos = new ArrayList();
        this.professor = null;
    }
    
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

    public long getIdAula() {
        return idAula;
    }

    public void setIdAula(long idAula) {
        this.idAula = idAula;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
