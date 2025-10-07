package poo3009;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] vet = new int[N];
        int qtdPares = 0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
        }

        System.out.print("NUMEROS PARES:");
        for (int i = 0; i < N; i++) {
            if (vet[i] % 2 == 0) {
                System.out.print(" " + vet[i]);
                qtdPares++;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + qtdPares);

        sc.close();
    }
}