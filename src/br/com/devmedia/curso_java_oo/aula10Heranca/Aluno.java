package br.com.devmedia.curso_java_oo.aula10Heranca;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    private Turno turno;

    public Aluno() {
        super();
    }

    public Aluno(String nome, String sobreNome, LocalDate dataNascimento, char sexo, Turno turno) {
        super(nome, sobreNome, dataNascimento, sexo);
        this.turno = turno;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "turno=" + turno + "}";
    }
}
