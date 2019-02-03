package br.com.devmedia.curso_java_oo.aula07Encapsulamento;
/*
  Classe do exercicio de encapsulamento
*/
public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private boolean lançamento;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isLançamento() {
        return lançamento;
    }

    public void setLançamento(boolean lançamento) {
        this.lançamento = lançamento;
    }
}
