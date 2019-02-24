package br.com.devmedia.curso_java_oo.aula19ClassesInternasEstaticasDeMetodoLocal;

public class MyClass {
    private int a;
    private static int valor = 1000;
    public MyClass(int a) {
        this.a = a;
    }
    public MyStaticClass getMyStaticClass() {
        return new MyStaticClass(a);
    }

    public static class MyStaticClass {

        private int valor;
        public MyStaticClass(int valor) {
            this.valor = valor;
        }

        public void imprimir() {
            System.out.println(valor);
            //no exemplo acima não consigo acessar
        }
    }

    public static void main (String [] args) {
        int a = MyClass.valor;

        MyStaticClass m = new MyClass.MyStaticClass(1200);
        m.imprimir();

        MyClass mc = new MyClass(999);
        mc.getMyStaticClass().imprimir();
    }
}
