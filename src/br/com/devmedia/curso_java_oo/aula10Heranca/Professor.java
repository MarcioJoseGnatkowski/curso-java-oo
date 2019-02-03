package br.com.devmedia.curso_java_oo.aula10Heranca;

public class Professor extends Pessoa {

    private Horas horas;

    public Horas getHoras() {
        return horas;
    }

    public void setHoras(Horas horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString() + "horas=" + horas + '}';
    }
}