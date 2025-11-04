package poo2608;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x, y;
        String quadrante;
        System.out.printf("Digite o primeiro numero");
        x = sc.nextInt();
        System.out.printf("Digite o segundo numero");
        y = sc.nextInt();
        if (x > 0 && y > 0){
            quadrante = "Q1";
        } else if (x> 0 && y < 0){
            quadrante = "Q4";
        } else if (x< 0 && y > 0){
            quadrante = "Q2";
        } else if (x< 0 && y < 0){
            quadrante = "Q3";
        } else {
            quadrante = "Origem";
        }
        System.out.printf("%s", quadrante);
        sc.close();
    }
}

