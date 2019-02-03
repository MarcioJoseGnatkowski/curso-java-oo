package br.com.devmedia.curso_java_oo.aula07Encapsulamento;

public class Aula {
    private boolean ativo;

    /*
       padrão agora é is no get do boolean
     */
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public static  void  main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.setNome("Márcio");
        p1.setIdade(32);

        System.out.println(p1.getNome() + " - " + p1.getIdade());

        Pessoa p2 = new Pessoa();
        p2.setNome("Bahea");
        p2.setIdade(-20);

        System.out.println(p2.getNome() + " - " + p2.getIdade());
    }

}
