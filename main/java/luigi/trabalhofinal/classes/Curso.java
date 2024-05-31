/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luigi.trabalhofinal.classes;

import java.util.ArrayList;

/**
 *
 * @author luigi
 */
public class Curso {

    private String nome;
    private int cargaHoraria = 0;
    private ArrayList<Materia> materias = new ArrayList<>();

    public void adicionarMateria(Materia m) {
        materias.add(m);
        this.cargaHoraria += m.getCargaHoraria();
    }

    public Curso(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
