package br.com.devmedia.curso_java_oo.aula12ClassesAbstratas;

public class Analista extends Funcionario {
    @Override
    public double calcularSalrio() {
        return  (getSalario() * 0.30) + getSalario();
    }
}
