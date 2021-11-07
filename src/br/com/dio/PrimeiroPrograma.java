package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
  public static void main(String[] args) {
    Gato gato = new Gato("Luke", "cinza", 4);
    int gatoIdade = gato.getIdade();
    System.out.println(gatoIdade);

    /* int a = 19;
    int b = 7;
    System.out.println("hello world!!" + (a + b));*/

  }
}
