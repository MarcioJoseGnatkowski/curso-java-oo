package br.com.devmedia.curso_java_oo.aula17MembrosEstaticos;

public class Exercicio {
    static int a = 0;

    int b = 2;

    //1º executa
    static {
        System.out.println(a);
        a = a + 1;
    }

    //3.1º executa
    {
        System.out.println(b);
        b = b +a;
    }

    public static void main(String[] args) {
        //2º Executa
       System.out.println(a);

       //3ºexecuta
       Exercicio ex = new Exercicio();
       //4º executa
        System.out.println(ex.b);

        //5ºexecuta
        ex.b = ex.b + a;
        System.out.println(ex.b);
    }
}
