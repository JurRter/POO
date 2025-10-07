package poo3009;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            float[] otario = new float[10];
            int j;
            System.out.println("Quantos numeros voce vai digitar?");
            j = sc.nextInt();
            int soma = 0;
            for(int i = 0; i < j; i++){
                System.out.printf("Digite um numero: ");
                otario[i] = sc.nextFloat();
                soma += otario[i];
            }
            System.out.printf("VALORES = ");
            for(int i = 0; i < j; i++){
                System.out.printf("%.1f ", otario[i]);
            }  
            System.out.println("\nSOMA = "+ soma);
            System.out.printf("MEDIA = "+ (soma/j));
        }
    }
}
