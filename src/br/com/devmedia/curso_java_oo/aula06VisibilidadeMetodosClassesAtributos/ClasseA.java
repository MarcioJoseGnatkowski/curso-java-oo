package br.com.devmedia.curso_java_oo.aula06VisibilidadeMetodosClassesAtributos;

public class ClasseA {

    private String privado;

    protected String protegido;

    public String publico;

    //visivel dentro do pacote, tipo default
    String pacote;

    public static void main(String[] args) {

        ClasseA a = new ClasseA();
        a.pacote = "pacote a";
        a.protegido = "protegido a";
        a.publico = "publico a";
        a.privado = "privado a";

        //ex classe default
        ClasseD d = new ClasseD();
        d.metodoD();
    }
}
