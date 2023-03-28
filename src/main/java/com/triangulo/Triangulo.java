package com.triangulo;

public class Triangulo {

  public static String determinarTipo(int lado1, int lado2, int lado3) {
    if (lado1 == lado2 && lado2 == lado3) {
      return "equilátero";
    } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
      return "isósceles";
    } else {
      return "escaleno";
    }
  }
}
