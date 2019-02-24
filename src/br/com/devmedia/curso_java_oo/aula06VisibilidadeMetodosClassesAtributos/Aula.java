package br.com.devmedia.curso_java_oo.aula06VisibilidadeMetodosClassesAtributos;

/*
  para usar classes de outros pacotes é preciso importar a mesma
 */
import br.com.devmedia.curso_java_oo.aula05TiposPrimitivosEhObjetos.ClasseB;

/*
  extende da classeB do outro pacote
 */
public class Aula extends ClasseB {

    public static void main(String[] args) {

        ClasseA a = new ClasseA();
        a.pacote = "pacote a";
        a.protegido = "protegido a";
        a.publico = "publico a";

        Aula aula = new Aula();
        aula.publico = "publico de B";
        aula.protegido = "protegido de B por herança";
    }
}
