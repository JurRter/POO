package poo3009;

import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados? ");
        int N = sc.nextInt();

        String[] nomes = new String[N];
        double[] nota1 = new double[N];
        double[] nota2 = new double[N];

        for (int i = 0; i < N; i++) {
            nomes[i] = sc.next();
            nota1[i] = sc.nextDouble();
            nota2[i] = sc.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < N; i++) {
            double media = (nota1[i] + nota2[i]) / 2.0;
            if (media >= 6.0)
                System.out.println(nomes[i]);
        }

        sc.close();
    }
}