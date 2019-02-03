package br.com.devmedia.curso_java_oo.aula07Encapsulamento;

public class ExercicioLivro {
    public static  void  main(String[] args) {
        Livro l1 = new Livro();
        l1.setAutor("B1");
        l1.setPaginas(1);
        l1.setLançamento(true);
        l1.setTitulo("Lá vai o titulo do livro véi");

        System.out.println("Autor: " + l1.getAutor() + " Titulo: " + l1.getTitulo());
    }
}
