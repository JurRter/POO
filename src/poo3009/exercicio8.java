package poo3009;

import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();
        int[] vet = new int[N];
        int somaPares = 0, qtdPares = 0;

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextInt();
            if (vet[i] % 2 == 0) {
                somaPares += vet[i];
                qtdPares++;
            }
        }

        if (qtdPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            System.out.printf("MEDIA DOS PARES = %.1f%n", ((double)somaPares / qtdPares));
        }

        sc.close();
    }
}
