package br.com.devmedia.curso_java_oo.aula20ClasseInternaAnonima;

/*

Classe annia não faz referencia a um objeto
Uma classe interna anonima pode ser definida como argumento e um método
Ou declarar a classe anonima dentro de um método , variavel

 */
public class Aula {

    public static void  main(String [] args) {

        Calculo C = new Calculo();
        System.out.println("Soma " + C.somar(10,5));
        System.out.println("Multiplicacao " + C.multiplicar(10,5));

        Aula a = new Aula();
        System.out.println("mySoma " + a.mySoma(8,5));

        a.imprime(new Executa() {
            @Override
            public void executar() {
                Calculo C = new Calculo();
                System.out.println("Soma " + C.somar(55,5));
                System.out.println("Multiplicacao " + C.multiplicar(55,10));
            }
        });
    }

    void imprime(Executa executa) {
        executa.executar();
    }

    int mySoma(int z, int y) {

        Adicao adicao = new Adicao() {
            @Override
            public int somar(int a, int b) {
                return b + a;
            }
        };
        return adicao.somar(z, y);
    }

}
