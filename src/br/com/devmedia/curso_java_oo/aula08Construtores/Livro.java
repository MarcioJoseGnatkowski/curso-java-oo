package br.com.devmedia.curso_java_oo.aula08Construtores;

/*
  super é a super classe do java o object
 */
public class Livro {

    private String titulo;
    private String autor;
    private int paginas;
    private boolean lancamento;

    public Livro() {
        super();
        System.out.println("Construtor default");
    }

    /*
      aqui eu fiz um construtor com parâmetros
     */
    public Livro(String titulo) {
        super();
        this.titulo = titulo;
    }

    public Livro(int paginas) {
        super();
        this.paginas = paginas;
    }

    /*
      o super faz o override da super classe do java
      se vc alterar para this como exemplo abaixo ele vai remeter ao create da propria instancia
     */
    public Livro(String titulo, String autor, int paginas, boolean lancamento) {
        //super();
        this();
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.lancamento = lancamento;
        System.out.println("Construtor com 4 args");
    }

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

    public boolean isLancamento() {
        return lancamento;
    }

    public void setLancamento(boolean lancamento) {
        this.lancamento = lancamento;
    }

    /*
      botão direito generate e  seleciona toString
      immpre todos os valores do meu objeto
     */

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", lancamento=" + lancamento +
                '}';
    }


}
