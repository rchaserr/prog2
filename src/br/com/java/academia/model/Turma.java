/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.academia.model;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author alunoti
 */

@Entity
public class Turma extends Modelo<Turma>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTurma;
    
    @OneToOne
    private Disciplina disciplina;
    
    @OneToOne
    private Professor professor;
    
    @OneToMany
    private List<Aluno> alunos;
    
    @Column(nullable=false)
    private int quantidadeAulunos;
    

    public long getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(long idTurma) {
        this.idTurma = idTurma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }
    
    public int getQuantidadeAulunos() {
        return quantidadeAulunos;
    }
    
    public void setQuantidadeAulunos(int quantidadeAulunos) {
        this.quantidadeAulunos = quantidadeAulunos;
    }

    public Turma(long idTurma, Disciplina disciplina, Professor professor, List<Aluno> alunos) {
        this.idTurma = idTurma;
        this.disciplina = disciplina;
        this.professor = professor;
        this.alunos = alunos;
    }
    
    public Turma() {
        this.idTurma = 0;
        this.disciplina = null;
        this.professor = null;
        this.alunos = null;
    }
}
