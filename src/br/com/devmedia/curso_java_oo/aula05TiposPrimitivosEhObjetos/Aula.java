package br.com.devmedia.curso_java_oo.aula05TiposPrimitivosEhObjetos;

/*
  Tipos primitivos e objeto
  PRIMITIVOS int, byte, long...
  OBJETOS Integer, Byte, Long...
 */

public class Aula {

    public static  void main(String[] args) {

        int a = 1;
        Integer a1 = 2;
        Integer a2 = new Integer(2);

        //tipo primitivo
        byte b = 5;
        //Byte Objeto
        Byte b1 = new Byte(b);
        Byte b2 = new Byte("60");
        Byte b3 = 40;

        int c =4;
        Integer c1 = c;
        int c2 = c1;

        int d = b;
        //int d2 = d1;
    }
}
