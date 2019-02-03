package br.com.devmedia.curso_java_oo.softBlue.ExcecoesTratadas;

public class AplicacaoexcecaoTratada {
    public static void main(String[] args) {

        BancoExcecaoTratada banco = new BancoExcecaoTratada();

        try {
            banco.realizarOperacao();
        } catch (SaldoInsuficienteException e) {
            e.printStackTrace();
        } catch (ValorNegativoException e) {
            e.printStackTrace();
        }
    }
}
