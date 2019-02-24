package br.com.devmedia.curso_java_oo.aula09ConstantesStaticEnum;

/*
 3 tipos de constantes
 globais - o que torna elaglobal é static e final
 locais - dentro de método
 enum - escopo estático
 */
public class Aula {

    public static  final String OURO = "ouro";
    public static  final String PAUS = "paus";
    public static  final String ESPADAS = "espadas";
    public static  final String COPAS = "copas";

    public int VALOR = 0;

    public void valor() {
        System.out.println(VALOR);
    }

    public static void main(String[] args){
        TrueOrFalse t = TrueOrFalse.FALSE;
        System.out.println(t);
        System.out.println(t.getIndex());
        System.out.println(t.getDesc());

        System.out.println("Agora executa o for");
        for (TrueOrFalse t2: TrueOrFalse.values()) {
            System.out.println(t2);
        }
        System.out.println("----------");

        //ENUM
        String carta = Aula.ESPADAS;
        switch (carta) {
            case OURO:
                System.out.println("Sua carta é de ouro");
                break;
            case PAUS:
                System.out.println("Sua carta é de paus");
                break;
            case ESPADAS:
                System.out.println("Sua carta é de espadas");
                break;
            case COPAS:
                System.out.println("Sua carta é de copas");
                break;
            default:
                System.out.println("Nenhum naipe est´presente");
                break;
        }

        //CONSTANTES

        String naipe = Aula.PAUS;
        switch (naipe) {
            case Aula.OURO:
            System.out.println("Sua carta é de ouro");
            break;
            case Aula.PAUS:
                System.out.println("Sua carta é de paus");
                break;
            case Aula.ESPADAS:
                System.out.println("Sua carta é de espadas");
                break;
            case Aula.COPAS:
                System.out.println("Sua carta é de copas");
                break;
            default:
                System.out.println("Nenhum naipe est´presente");
                break;
        }
        //NÃO funciona, teri que criar uma classe
        //System.out.println(VALOR);
    }
}
