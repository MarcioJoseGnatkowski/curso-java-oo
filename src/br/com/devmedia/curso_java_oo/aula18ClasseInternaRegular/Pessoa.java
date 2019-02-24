package br.com.devmedia.curso_java_oo.aula18ClasseInternaRegular;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    private String nome;
    private String sobreNome;
    private LocalDate dtNascimento;

    public CalculaIdade getIdade() {
        return  new Idade();
    }

    private class Idade implements CalculaIdade {

        @Override
        public int getAnos() {
            Period p = Period.between(dtNascimento, LocalDate.now());
            return p.getYears();
        }

        @Override
        public int getMeses() {
            Period p = Period.between(dtNascimento, LocalDate.now());
            return p.getMonths();
        }

        @Override
        public int getDias() {
            Period p = Period.between(dtNascimento, LocalDate.now());
            return p.getDays();
        }
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

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
