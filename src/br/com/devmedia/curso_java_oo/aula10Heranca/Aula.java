package br.com.devmedia.curso_java_oo.aula10Heranca;

import com.sun.deploy.util.Waiter;

import java.time.LocalDate;

public class Aula {
    public static void main(String[] args) {

        Professor p = new Professor();
        p.setNome("Cabelo");
        p.setSobreNome("Silva");
        p.setDataNascimento(LocalDate.of(1985, 2, 4));
        p.setSexo('M');
        p.setHoras(Horas.QUARENTA_HORAS);
        System.out.println(p.toString());

        Aluno a = new Aluno();
        a.setNome("Renato");
        a.setSobreNome("Oda");
        a.setSexo('N');
        a.setDataNascimento(LocalDate.of(1990, 8, 25));
        a.setTurno(Turno.MANHA);
        System.out.println(a.toString());

        Aluno a2 = new Aluno("Humberto", "Senna",
                LocalDate.of(1985, 2, 4), 'M', Turno.MANHA );
        System.out.println(a2.toString());
    }
}
