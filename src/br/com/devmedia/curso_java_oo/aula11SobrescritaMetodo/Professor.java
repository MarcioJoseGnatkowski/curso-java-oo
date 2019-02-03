package br.com.devmedia.curso_java_oo.aula11SobrescritaMetodo;

public class Professor extends Pessoa {
    @Override
    public void setMatricula(String matricula) {
        if (matricula.length() == 8) {
            super.setMatricula(matricula);
        } else {
            super.setMatricula("MATRICULA INVALIDA");
        }
    }
}
