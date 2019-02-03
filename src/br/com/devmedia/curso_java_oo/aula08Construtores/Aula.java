package br.com.devmedia.curso_java_oo.aula08Construtores;

/*
  Construtores
 */
public class Aula {

    public static  void  main(String[] args) {

        Livro l1 = new Livro();

        l1.setTitulo("Delphi I");
        l1.setAutor("Raquete");
        l1.setPaginas(50);
        l1.setLancamento(true);
        System.out.println(l1.toString());

        Livro l2 = new Livro("Delphi 2");
        System.out.println(l2.toString());

        Livro l3 = new Livro(24);
        System.out.println(l3.toString());

        Livro l4 = new Livro("Go", "Oda", 1000, false);
        System.out.println(l4.toString());
    }
}
