package br.com.devmedia.curso_java_oo.aula10UsoDaHeranca;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String sobreNome;
    private LocalDate dataNascimento;
    private char sexo;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String sobreNome, LocalDate dataNascimento, char sexo) {
        super();
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobreNome='" + sobreNome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", sexo=" + sexo + ", ";
    }
}
