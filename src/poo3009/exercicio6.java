package poo3009;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.print("VETOR RESULTANTE: ");
        for (int i = 0; i < N; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}