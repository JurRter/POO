package poo3009;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int N = sc.nextInt();
        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        int pos = 0;
        for (int i = 1; i < N; i++) {
            if (vet[i] > maior) {
                maior = vet[i];
                pos = i;
            }
        }

        System.out.printf("MAIOR VALOR = %.1f%n", maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + pos);

        sc.close();
    }
}