package br.com.devmedia.curso_java_oo.aula15RegrasConstrutores;

public class PessoaFisica extends Pessoa{

    public PessoaFisica() {
        super();
        System.out.println("Construindo - Pessoa Fisica");
    }

    public PessoaFisica(String nome) {
        //chamar o construtor que recebe parâmetro
        super(nome);
        System.out.println("Construindo - Pessoa Fisica com string");
    }

}
