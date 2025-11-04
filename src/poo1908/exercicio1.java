package poo1908;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x, y;
            System.out.printf("Digite o primeiro numero a ser somado\n");
            x = sc.nextInt();
            System.out.printf("Digite o segundo numero a ser somado\n");
            y = sc.nextInt();
            x = x + y;
            System.out.printf("SOMA - %d\n", x);
        }
    }
}
