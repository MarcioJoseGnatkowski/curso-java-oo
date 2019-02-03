package br.com.devmedia.curso_java_oo.softBlue.ExcecoesPropagadas;

/*
  nesse caso o sistema emite uma exceção, pois foi propagada
 */
public class AplicacaoExcecao {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.realizarOperacao();
    }
}
