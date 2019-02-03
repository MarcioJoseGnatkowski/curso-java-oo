package br.com.devmedia.curso_java_oo.aula23InterfaceFuncionalExpLambda;

@FunctionalInterface
public interface Funcionario {

    abstract double remuneracao();

    default void imprime() {
        System.out.println(remuneracao());
    }

}
