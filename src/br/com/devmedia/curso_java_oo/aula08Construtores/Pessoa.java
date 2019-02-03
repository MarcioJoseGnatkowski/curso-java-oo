package br.com.devmedia.curso_java_oo.aula08Construtores;

public class Pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private char sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }



    public Pessoa() {
        super();
    }

    public Pessoa(String nome){
        super();
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome, int idade, char sexo) {
        super();
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                ", sexo=" + sexo +
                '}';
    }
}
