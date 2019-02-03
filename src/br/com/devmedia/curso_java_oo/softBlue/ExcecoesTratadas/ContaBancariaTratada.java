package br.com.devmedia.curso_java_oo.softBlue.ExcecoesTratadas;

/*
  throws diz que pode lançar uma exceção mas não necessáriamente precisa lançar exceção ex: throw
  throw vai laçar exceção então precisa do throws no método
 */
public class ContaBancariaTratada {

    private double saldo;

    public ContaBancariaTratada(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
        if (valor <= 0){
            throw new ValorNegativoException(valor);
        }

        if (saldo - valor < 0 ) {
            throw new SaldoInsuficienteException(valor, saldo);
        }

        this.saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
