package br.com.devmedia.curso_java_oo.aula19ClassesInternasEstaticasMetLocal;

import br.com.devmedia.curso_java_oo.aula18ClassesAninhadas_RegularInterna.CalculaIdade;

/*
  Uma classe estatica não tem acesso aos membros externos de instancia
  criar método e a classe vai estar dentro dele
*/
public class Aula {
    public static void main (String [] args) {
        System.out.println("Soma = " + new Aula().getCalculo(9,5));
    }

    int getCalculo(int x, int y) {
        System.out.println("Valor de x = " + x);
        System.out.println("Valor de y = " + y);
        final int  z = 10;
        class Calculo {
            private int a;
            private int b;

            Calculo() {

            }
            Calculo(int a, int b){
                this.a = a;
                this.b = b;
            }

            int soma() {
                return x + y;
            }

            int multiplicar() {
                return a * b * z;
            }
        }

        System.out.println("Soma = " + new Calculo().soma());

        return new Calculo(10,2).soma();
    }
}
