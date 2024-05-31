/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luigi.trabalhofinal.classes;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Universidade {

    private String nome;
    private String endereço;
    private ArrayList<Bloco> blocos = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<ServidorPublico> servidores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Materia> materiasComuns = new ArrayList<>();

    public void imprimirInfo() {
        System.out.println("A " + this.nome + " conta com mais de " + this.servidores.size()
                + " servidores para prover um ensino de qualidade para " + this.alunos.size()
                + ", tendo uma estrutura com " + this.blocos.size() + "blocos!");
    }

    public void imprimirAlunos() {
        ;
        System.out.println("--- ALUNOS ---");
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("\nNome: " + alunos.get(i).getNome());
            System.out.println("Matricula: " + alunos.get(i).getMatricula());
            System.out.println("Data de nascimento: " + alunos.get(i).getDataNascimento());
            System.out.println("Curso: " + alunos.get(i).getCurso());
        }
    }

    public void imprimirServidores() {
        ;
        System.out.println("--- SERVIDORES ---");
        for (int i = 0; i < servidores.size(); i++) {
            System.out.println("\nNome: " + servidores.get(i).getNome());
            System.out.println("Data de nascimento: " + servidores.get(i).getDataNascimento());
            System.out.println("Funcao: " + servidores.get(i).getFuncao());
            System.out.println("Salario: R$ " + servidores.get(i).getSalario());
        }
    }

    public void imprimirCursos() {
        System.out.println("--- CURSOS ---");
        for (int i = 0; i < cursos.size(); i++) {
            System.out.println("\nNome: " + cursos.get(i).getNome());
            System.out.println("Carga horaria: " + cursos.get(i).getCargaHoraria());
        }
    }

    public void imprimirMateriasComuns() {
        System.out.println("--- MATERIAS DE TRONCO COMUM ---");
        for (int i = 0; i < materiasComuns.size(); i++) {
            System.out.println("\nNome: " + materiasComuns.get(i).getNome());
            System.out.println("Carga Horaria: " + materiasComuns.get(i).getCargaHoraria() + " horas");
            System.out.println("Sala: " + materiasComuns.get(i).getSala());
            System.out.println("Turno: " + materiasComuns.get(i).getTurno());

        }
    }

    public void matricular(Aluno a) {
        alunos.add(a);
    }

    public void contratar(ServidorPublico sp) {
        servidores.add(sp);
    }

    public void adicionarCurso(Curso c) {
        cursos.add(c);
    }

    public void adicionarMateriaComum(Materia materia) {
        materiasComuns.add(materia);
    }

    public Universidade(String nome, String endereço) {
        this.nome = nome;
        this.endereço = endereço;

    }

    public ArrayList<Materia> getMateriasComuns() {
        return materiasComuns;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

}
