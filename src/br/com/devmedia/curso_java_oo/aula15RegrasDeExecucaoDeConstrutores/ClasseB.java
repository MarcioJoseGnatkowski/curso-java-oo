package br.com.devmedia.curso_java_oo.aula15RegrasDeExecucaoDeConstrutores;

public class ClasseB {

    public ClasseB() {
        go();
    }

    public ClasseB(String b) {
        this();
    }

    private void go() {
        new ClasseB("b");
    }
}
