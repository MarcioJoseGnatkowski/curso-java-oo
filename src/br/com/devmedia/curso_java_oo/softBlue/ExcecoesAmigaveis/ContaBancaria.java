package br.com.devmedia.curso_java_oo.softBlue.ExcecoesAmigaveis;

/*
  throws diz que pode lançar uma exceção mas não necessáriamente precisa lançar exceção ex: throw
  throw vai laçar exceção então precisa do throws no método
 */
public class ContaBancaria {

    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) throws Exception {
        if (valor <= 0){
            throw new Exception("Valor para saque é negativo");
        }

        if (saldo - valor < 0 ) {
            throw new Exception("Saldo para saque é insuficiente");
        }

        this.saldo = valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
