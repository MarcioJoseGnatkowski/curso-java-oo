package br.com.devmedia.curso_java_oo.aula14Interfaces;
/*
  aparelho com as funções para execução de midia
  todos métodos da interface são publicos, indiferente se coloca public
  se não colocar asbtract também não faz difereção, pois entende como abstract
 */
public interface Player {
    public  abstract void play();
    abstract void stop();
    void pause();
    void volume (int volume);
}
