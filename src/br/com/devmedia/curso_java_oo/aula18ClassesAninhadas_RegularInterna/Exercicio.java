package br.com.devmedia.curso_java_oo.aula18ClassesAninhadas_RegularInterna;

public class Exercicio {
    private class MyInnerClass {
        public void Hello() {
            System.out.println("Olá ");
        }
    }

   // public MyInnerClass GetMyInnerClass() {
   //     return  new MyInnerClass();
   // }

    public static void main(String[] args) {
        //new Exercicio().GetMyInnerClass().Hello();

        MyInnerClass mic = new Exercicio().new MyInnerClass();
        mic.Hello();
    }
}
