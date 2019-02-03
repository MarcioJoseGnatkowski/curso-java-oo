package br.com.devmedia.curso_java_oo.aula16MetodoEstaticos;

public class MyClass extends Aula{
    /*
    acessar de fora o nome
     */
    @Override
    void imprime() {
        System.out.println(Aula.nome + " " + new Aula().sobrenome);

        Aula.show();

        new Aula().imprime();
    }

    static void show(){
        System.out.println(Aula.nome + " " + new Aula().sobrenome);
    }
}
