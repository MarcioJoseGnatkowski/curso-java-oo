package br.com.devmedia.curso_java_oo.aula11SobrescritaMetodo;

public class Aluno extends Pessoa {

    @Override
    public void setMatricula(String matricula) {
        if (matricula.length() == 10) {
            super.setMatricula(matricula);
        } else {
            System.out.println("Mátricula invalida para o aluno " + getNome());
        }
    }

    @Override
    protected void imprime() {
        super.imprime();
    }
}
