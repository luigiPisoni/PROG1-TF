/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package luigi.trabalhofinal;

import luigi.trabalhofinal.classes.Curso;
import luigi.trabalhofinal.classes.Materia;
import luigi.trabalhofinal.classes.ServidorPublico;
import luigi.trabalhofinal.classes.Universidade;

/**
 *
 * @author luigi
 */
public class TrabalhoFinal {

    public static void main(String[] args) {
        Universidade uffs = new Universidade("UFFS", "Xilindró");

        uffs.contratar(new ServidorPublico("Antonio", "12/12/2012", "Professor PHD", 8000));
        uffs.contratar(new ServidorPublico("Maria", "11/11/2013", "Professora PHD", 10000));
        uffs.contratar(new ServidorPublico("Carlos", "11/10/2006", "Professore PHD", 15000));
        uffs.contratar(new ServidorPublico("Dona Maria", "11/1/1815", "Merendeira Master Chef", 99000));

        uffs.adicionarMateriaComum(new Materia("Economia e sosiedad", "910B", "Tarde", 4));
        uffs.adicionarMateriaComum(new Materia("Matematica basica", "1110B", "Tarde", 10));
        uffs.adicionarMateriaComum(new Materia("Historia", "910B", "Tarde", 6));
        uffs.adicionarMateriaComum(new Materia("Historia da fronteira sul", "210B", "Tarde", 1));

//        uffs.imprimirServidores();
//        uffs.imprimirMateriasComuns();
        Curso cc = new Curso("cc");

        cc.adicionarMateria(new Materia("matematica secreta", "310B", "Tarde", 20));
        cc.adicionarMateria(new Materia("matematica discreta", "310B", "Tarde", 30));
        cc.adicionarMateria(new Materia("matematica indiscreta", "310B", "Tarde", 90));

        uffs.adicionarCurso(cc);
        
        uffs.imprimirCursos();
    }
}
