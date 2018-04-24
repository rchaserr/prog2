package br.com.java.academia.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Disciplina extends Modelo<Disciplina>{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDisciplina;
    
    @OneToMany
    private List<Turma> turmas;
    
    @Column(nullable=false)
    private String nome;
    
    @Column(nullable=false)
    private double tempo;

    /**
     * @return the turmas
     */
    public List<Turma> getTurmas() {
        return turmas;
    }

    /**
     * @param turmas the turmas to set
     */
//    public void setTurmas(List<Turma> turmas) {
//        this.turmas = turmas;
//    }

    public Disciplina() {
        this.nome = "";
        this.tempo = 0;
        this.turmas = null;
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
    
    

    public long getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(long idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
}
