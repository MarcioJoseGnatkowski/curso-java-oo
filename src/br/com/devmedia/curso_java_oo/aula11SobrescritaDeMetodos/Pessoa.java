package br.com.devmedia.curso_java_oo.aula11SobrescritaDeMetodos;

public class Pessoa {

    private String nome;
    private String matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    /*
      esse método jamais pode ser reescrito
      public final void imprime() {
     */
    protected void imprime() {

    }
}
