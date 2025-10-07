package poo3009;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

        int menores16 = 0;
        double somaAlturas = 0;
        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            idades[i] = sc.nextInt();
            alturas[i] = sc.nextDouble();
            somaAlturas += alturas[i];
            if (idades[i] < 16) menores16++;
        }

        System.out.printf("Altura média: %.2f%n", somaAlturas / N);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", (double) menores16 / N * 100);
        for (int i = 0; i < N; i++) {
            if (idades[i] < 16) System.out.println(nomes[i]);
        }
        sc.close();
    }
}
