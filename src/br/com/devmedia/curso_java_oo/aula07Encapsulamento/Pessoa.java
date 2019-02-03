package br.com.devmedia.curso_java_oo.aula07Encapsulamento;

/*
  encapsulamento, não expor os atributos, afim de proteje-los
  esconde implementações e podemos ter regras no set e get
*/

public class Pessoa {

    private String nome;

    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade (int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            this.idade = 0;
        }

        /*
          Método acima refatorado e da mesmo resultado
        if (idade < 0) {
            idade = 0;
        }
        this.idade = idade;
        */
    }
}
