package br.com.devmedia.curso_java_oo.aula11SobrescritaMetodo;

public class Aula {

    public static  void main(String[] args) {
         Aluno a = new Aluno();
         a.setNome("Raquete");
         a.setMatricula("12345");
         System.out.println("Nome: " + a.getNome() + ", " + "Matricula: " + a.getMatricula());

         System.out.println();

         Aluno b = new Aluno();
         b.setNome("Jean");
         b.setMatricula("0123456789");
         a.imprime();
         System.out.println("Nome: " + b.getNome() + ", " + "Matricula: " + b.getMatricula());

         System.out.println();

         Professor p = new Professor();
         p.setNome("Oda");
         p.setMatricula("012345");
         System.out.println("Nome: " + p.getNome() + ", " + "Matricula: " + p.getMatricula());

         System.out.println();

         Professor p2 = new Professor();
         p2.setNome("Bahea");
         p2.setMatricula("12345678");
         System.out.println("Nome: " + p2.getNome() + ", " + "Matricula: " + p2.getMatricula());
    }

}
