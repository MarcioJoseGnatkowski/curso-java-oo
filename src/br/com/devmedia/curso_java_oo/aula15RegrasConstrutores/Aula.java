package br.com.devmedia.curso_java_oo.aula15RegrasConstrutores;

/*
  Regras Execucao Dos Construtores
  4

  3 public Pessoa(){   chama public Object() {}
      super();
  }
  2  public PessoaFisica() {   chama public Pessoa(){
     super();
  }
  1  new PessoaFisica()  o java chama o construtor do public PessoaFisica {

 */

public class Aula {

    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica("Raquete");
        System.out.println(pf.getNome());

        //StackOverflowError
        //ClasseB b = new ClasseB();
    }
}


