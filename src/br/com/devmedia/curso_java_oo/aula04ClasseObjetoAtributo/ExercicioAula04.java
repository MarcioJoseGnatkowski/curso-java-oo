package br.com.devmedia.curso_java_oo.aula04ClasseObjetoAtributo;

public class ExercicioAula04 {
    void tabuada(int valor) {
        for (int i = 0; i < 11; i++) {
            System.out.println(i + " X " + valor + " = " + i*valor);
            //System.out.println(valor * i);
        }
    }
    public static void main(String[] args) {
        ExercicioAula04 a = new ExercicioAula04();

        a.tabuada(5);
    }
}
