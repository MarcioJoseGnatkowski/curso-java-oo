package br.com.devmedia.curso_java_oo.aula17MembrosEstaticos;

/*
  criando uma classe a primeira coisa que é executada é o código estático o bloco estático

 */
public class Aula {
    static int vStatic = 1;

    int vInstance = 1;

    static {
        System.out.println("Bloco estatico");
        System.out.println(vStatic);
        System.out.println(new Aula().vInstance);
    }

    {
        System.out.println("Bloco de instancia");
        System.out.println(vStatic + vInstance);
        vStatic = 8;
    }

    public Aula() {
        super();
        System.out.println("New aula ()");
        this.vInstance = 9;
    }

    public static void main(String[] args) {
        Aula a = new Aula();
        a.vInstance = 5;
        System.out.println(a.vInstance);
    }
}
