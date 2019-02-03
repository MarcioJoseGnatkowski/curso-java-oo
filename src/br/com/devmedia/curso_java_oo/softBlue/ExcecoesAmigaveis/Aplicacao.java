package br.com.devmedia.curso_java_oo.softBlue.ExcecoesAmigaveis;

/*
  O método sacar pode dar problema, usando try catch motra uma mensagem amigável
 */
public class Aplicacao {

    public static void main(String[] args) {
            ContaBancaria c = new ContaBancaria(1000);

            try {
                c.sacar(-100);
                System.out.println("Saque realizado com sucesso");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro no saque: " + e.getMessage());
            }

            try {
                c.sacar(100);
                System.out.println("Saque realizado com sucesso");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro no saque: " + e.getMessage());
            }

            try {
                c.sacar(2000);
                System.out.println("Saque realizado com sucesso");
            } catch (Exception e) {
                System.out.println("Ocorreu um erro no saque: " + e.getMessage());
            }

            System.out.println(c.getSaldo());
    }
}
