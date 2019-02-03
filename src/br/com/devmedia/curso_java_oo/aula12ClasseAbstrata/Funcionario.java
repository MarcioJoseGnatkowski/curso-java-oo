package br.com.devmedia.curso_java_oo.aula12ClasseAbstrata;

public abstract class Funcionario {

    public abstract double calcularSalrio();

    private String nome;
    private  double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
