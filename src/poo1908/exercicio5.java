package poo1908;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double PI = 3.14159;
        System.out.println("Escreva 3 valores");
        try (Scanner sc = new Scanner(System.in)){
            double A = sc.nextDouble();
            double B = sc.nextDouble();
            double C = sc.nextDouble();
            
            
            double triangulo = (A * C) / 2.0;
            double circulo   = PI * C * C;
            double trapezio  = ((A + B) * C) / 2.0;
            double quadrado  = B * B;
            double retangulo = A * B;

            System.out.printf("TRIANGULO: %.3f%n", triangulo);
            System.out.printf("CIRCULO: %.3f%n", circulo);
            System.out.printf("TRAPEZIO: %.3f%n", trapezio);
            System.out.printf("QUADRADO: %.3f%n", quadrado);
            System.out.printf("RETANGULO: %.3f%n", retangulo);
        }
    }
}
