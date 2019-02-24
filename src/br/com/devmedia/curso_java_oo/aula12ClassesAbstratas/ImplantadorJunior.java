package br.com.devmedia.curso_java_oo.aula12ClassesAbstratas;

public class ImplantadorJunior extends Implantador{
    @Override
    public double calcularSalrio() {
        return  (getSalario() * 0.40) + getSalario();
    }
}
