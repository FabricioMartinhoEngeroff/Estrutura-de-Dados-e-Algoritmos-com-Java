package org.estruturaDeDados.vetorMultidimencional.registroProfessor;

public class Professor {

    private int matricula;
    private String nome;
    private String lotacao;
    private double salario;

    public Professor(int matricula, String nome, String lotacao, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.lotacao = lotacao;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLotacao() {
        return lotacao;
    }

    public void setLotacao(String lotacao) {
        this.lotacao = lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", lotacao='" + lotacao + '\'' +
                ", salario=" + salario +
                '}';
    }
}

