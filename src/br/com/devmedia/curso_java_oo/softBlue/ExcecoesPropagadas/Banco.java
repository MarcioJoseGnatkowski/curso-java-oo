package br.com.devmedia.curso_java_oo.softBlue.ExcecoesPropagadas;

import br.com.devmedia.curso_java_oo.softBlue.ExcecoesAmigaveis.ContaBancaria;

public class Banco {
    public void realizarOperacao() throws Exception {
        ContaBancaria c = new ContaBancaria(1000);
        c.sacar(-100);
        System.out.println("Saque realizado com sucesso");

        System.out.println(c.getSaldo());

    }
}
