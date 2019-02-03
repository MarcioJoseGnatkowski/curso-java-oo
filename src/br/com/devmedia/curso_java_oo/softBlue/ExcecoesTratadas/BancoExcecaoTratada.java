package br.com.devmedia.curso_java_oo.softBlue.ExcecoesTratadas;

public class BancoExcecaoTratada {
    public void realizarOperacao() throws SaldoInsuficienteException, ValorNegativoException {
        ContaBancariaTratada c = new ContaBancariaTratada(1000);
        c.sacar(-100);
        System.out.println("Saque realizado com sucesso");

        System.out.println(c.getSaldo());

    }
}


