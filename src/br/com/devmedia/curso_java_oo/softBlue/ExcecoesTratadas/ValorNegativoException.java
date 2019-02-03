package br.com.devmedia.curso_java_oo.softBlue.ExcecoesTratadas;

/*
   classe de exceções definidas pelo gambiarrista (programador)
 */

public class ValorNegativoException  extends Exception {

    private double valor;

    public ValorNegativoException(double valor){
        this.valor = valor;
    }

    public double getValor(){
        return valor;
    }
}
