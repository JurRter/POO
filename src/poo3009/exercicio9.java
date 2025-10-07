package poo3009;

import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];

        int maisVelho = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            if (idades[i] > idades[maisVelho]) {
                maisVelho = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + nomes[maisVelho]);

        sc.close();
    }
}