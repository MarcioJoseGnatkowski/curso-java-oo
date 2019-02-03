package br.com.devmedia.curso_java_oo.aula16MetodoEstaticos;

/*

 */
public class Aula {

    static String nome = "Ana";

    String sobrenome = "Monteiro";

    void imprime() {
        System.out.println(nome + " " + sobrenome);
    }

    public static void main(String[] args) {
        //para acessar sobrenome tenho que instanciar 'Aula', ex: abaixo não vai funcionar
        //System.out.println(nome + " " + sobrenome);

        //   new Aula().imprime();
        //  System.out.println(nome + " " + new Aula().sobrenome);
        //   show();

       //    MyClass my = new MyClass();
       //   my.imprime();
       //   MyClass.show();

        Aula a1 = new Aula();
        /*
        se mudar o nome aqui, daqui para frente ele asume esse nome
         */
        //nome = "xyz";
        a1.sobrenome = "da silva";

        Aula a2 = new Aula();
        a2.sobrenome = "de souza";

        Aula a3 = new Aula();
        a3.sobrenome = "Moura";

        System.out.println("a1 " + nome + " " + a1.sobrenome);
        System.out.println("a2 " + nome + " " + a2.sobrenome);
        System.out.println("a3 " + nome + " " + a3.sobrenome);
        System.out.println("a4 " + nome + " " + new Aula().sobrenome);

    }

    static void show(){
        System.out.println(nome + " " + new Aula().sobrenome);
    }
}
