package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double a, b;
    System.out.println("Digite o primeiro valor");
    a = scan.nextDouble();

    System.out.println("Digite o segundo valor");
    b = scan.nextDouble();
    double soma = somar(a, b);
    double subtracao = subtrair(a, b);
    double multiplicacao = multiplicar(a, b);
    double divisao = dividir(a, b);
    System.out.println("soma: " + soma);
    System.out.println("subtração: " + subtracao);
    System.out.println("multiplicação: " + multiplicacao);
    System.out.println("divisão: " + divisao);
  }

  public static double somar(double a, double b) {
    return a + b;
  }

  public static double subtrair(double a, double b) {
    return a - b;
  }

  public static double multiplicar(double a, double b) {
    return a * b;
  }

  public static double dividir(double a, double b) {
    return a / b;
  }


}
