package br.com.devmedia.curso_java_oo.aula15RegrasDeExecucaoDeConstrutores;

public class Pessoa {

    private String nome;

    public Pessoa() {
        super();
        System.out.println("Construindo - Pessoa");
    }

    public Pessoa(String nome) {
        //se deixar super chama o do Object
        //super();
        //o this remete ao construtor da classe
        this();
        this.nome = nome;
        System.out.println("Construindo - Pessoa com string");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

