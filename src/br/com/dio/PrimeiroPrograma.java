package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
  public static void main(String[] args) {
    Gato gato = new Gato("Luke", "cinza", 4);
    int gatoIdade = gato.getIdade();
    System.out.println(gatoIdade);

    Livro livro1 = new Livro("portões de fogo", 350);
    System.out.println(livro1);
    /* int a = 19;
    int b = 7;
    System.out.println("hello world!!" + (a + b));*/

  }
}
class Livro {
  private String nome;
  private Integer numPaginas;

  public Livro(String nome, Integer numPaginas) {
    this.nome = nome;
    this.numPaginas = numPaginas;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getNumPaginas() {
    return numPaginas;
  }

  public void setNumPaginas(Integer numPaginas) {
    this.numPaginas = numPaginas;
  }

  @Override
  public String toString() {
    return "Livro{" +
            "nome='" + nome + '\'' +
            ", numPaginas=" + numPaginas +
            '}';
  }
}
