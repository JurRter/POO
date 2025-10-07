package poo3009;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int N = sc.nextInt();
        double[] vet = new double[N];
        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }
        double media = soma / N;
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < N; i++) {
            if (vet[i] < media)
                System.out.printf("%.1f%n", vet[i]);
        }

        sc.close();
    }
}