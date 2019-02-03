package br.com.devmedia.curso_java_oo.aula14Interfaces;

public class Aula {

    private PlayerVideo video;

    void videos() {
        video = new WMV();
        video.play();
        video.pause();
        video.volume(5);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("Video aula.WMV");
        video.stop();

        System.out.println("----");

        video = new RMV();
        video.play();
        video.pause();
        video.volume(8);
        video.taxaDeBits();
        video.taxaDeQuadros();
        video.nomeArquivo("Video aula.RMV");
        video.stop();

    }

    public  static void main (String[] args) {

        new Aula().videos();
        //comentado para testes do método acima
        /*
        MP3 mp3 = new MP3();
        mp3.play();
        mp3.pause();
        mp3.volume(5);
        mp3.taxaDeBits();
        mp3.stop();

        System.out.println("----");

        AVI avi = new AVI();
        avi.play();
        avi.pause();
        avi.volume(8);
        avi.taxaDeBits();
        avi.taxaDeQuadros();
        avi.stop();
        */
    }

}
