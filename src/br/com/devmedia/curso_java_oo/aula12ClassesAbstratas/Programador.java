package br.com.devmedia.curso_java_oo.aula12ClassesAbstratas;

public class Programador  extends Funcionario{
    @Override
    public double calcularSalrio() {
        return  (getSalario() * 0.20) + getSalario();
    }
}
