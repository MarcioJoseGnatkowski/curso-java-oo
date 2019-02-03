package br.com.devmedia.curso_java_oo.aula08Construtores;

public class Exercicio {

    public static  void  main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Peidao");
        p1.setSobrenome("Chubasa");
        p1.setIdade(24);
        p1.setSexo('M');

        System.out.println(p1.toString());

        Pessoa p2 = new Pessoa("Raquete");
        System.out.println(p2.toString());

        Pessoa p3 = new Pessoa("Márcio", "Gnatkowski", 32, 'M');
        System.out.println(p3.toString());
    }
}
