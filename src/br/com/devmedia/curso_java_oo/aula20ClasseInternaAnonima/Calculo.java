package br.com.devmedia.curso_java_oo.aula20ClasseInternaAnonima;

public class Calculo implements Adicao, Multiplicacao {
    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a *b;
    }
}
