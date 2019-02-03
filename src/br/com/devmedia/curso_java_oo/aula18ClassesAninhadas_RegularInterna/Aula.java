package br.com.devmedia.curso_java_oo.aula18ClassesAninhadas_RegularInterna;

import java.time.LocalDate;

/*
Internas estaticas
Interna Regulares ou não estaticas
Interna de método - local
Interna anonima
*/
public class Aula {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Márcio José");
        p.setSobreNome("Gnatkowski");
        p.setDtNascimento(LocalDate.of(1986, 8, 12));

        System.out.printf("%s %s possui %d anos, %d meses e %d dias. ",
                p.getNome(),
                p.getSobreNome(),
                p.getIdade().getAnos(),
                p.getIdade().getMeses(),
                p.getIdade().getDias());
    }
}

