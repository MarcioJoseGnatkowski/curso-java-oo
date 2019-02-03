package br.com.devmedia.curso_java_oo.aula14Interfaces;

public interface PlayerVideo extends Player, Video, Audio {
    void nomeArquivo(String arquivo);

}
