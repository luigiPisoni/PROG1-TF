/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luigi.trabalhofinal.classes;

/**
 *
 * @author aluno
 */
public class Aluno {

    private int matricula;
    private String nome;
    private String dataNascimento;
    private Curso curso;

    public Aluno(int matricula, String nome, String dataNascimento, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public Curso getCurso() {
        return curso;
    }

    
    
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
}
