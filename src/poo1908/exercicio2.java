package poo1908;

import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double r;
    System.out.printf("Escreva o raio do circulo");
    r = sc.nextFloat();
    r = 3.14159 * r * r;
    System.out.printf("A=%.4f", r);
    sc.close();
    }
}
