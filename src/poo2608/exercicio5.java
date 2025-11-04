package poo2608;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x, y;
        float prec1;
        System.out.printf("Digite o primeiro numero");
        x = sc.nextInt();
        switch (x) {
            case 1 -> prec1 = 4f;
            case 2 -> prec1 = 4.5f;
            case 3 -> prec1 = 5f;
            case 4 -> prec1 = 2f;
            case 5 -> prec1 = 1.5f;
            default -> {prec1 = 0f;}
        }
        System.out.printf("Digite o segundo numero");
        y = sc.nextInt();
        prec1 = prec1 * y;
        System.out.printf("Total: R$ %.2f", prec1);
        sc.close();
        }
    }
