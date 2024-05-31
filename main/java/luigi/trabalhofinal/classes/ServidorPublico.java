/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luigi.trabalhofinal.classes;

/**
 *
 * @author aluno
 */
public class ServidorPublico {

//    private int id;
    private String nome;
    private String dataNascimento;
    private String funcao;
    private double salario;

    public ServidorPublico(String nome, String dataNascimento, String funcao, double salario) {
//        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.funcao = funcao;
        this.salario = salario;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

//    public int getId() {
//        return id;
//    }

    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return salario;
    }

}
