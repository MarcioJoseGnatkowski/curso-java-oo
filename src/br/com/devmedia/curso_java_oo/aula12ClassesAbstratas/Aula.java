package br.com.devmedia.curso_java_oo.aula12ClassesAbstratas;
/*
classe abstrata
 */
public class Aula {

    public static void main(String[] args) {

        Programador p = new Programador();
        p.setNome("Cabelo");
        p.setSalario(1000.20);
        System.out.printf("Programador  %s - R$: %.2f", p.getNome(), p.calcularSalrio());

        System.out.println();

        Analista a = new Analista();
        a.setNome("Oda");
        a.setSalario(1000.20);
        System.out.printf("Analista  %s - R$: %.2f", a.getNome(), a.calcularSalrio());

        System.out.println();

        ImplantadorJunior ij = new ImplantadorJunior();
        ij.setNome("Soneca");
        ij.setSalario(1000.20);
        System.out.printf("Implantador Junior  %s - R$: %.2f", ij.getNome(), ij.calcularSalrio());
    }
}
