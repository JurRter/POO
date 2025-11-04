package poo1908;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int[] quant = new int[2]; 
            double[] valor = new double[2];
            for(int i = 0; i < 2; i++){
                System.out.println("Escreva o codigo a quantidade e o valor do produto " + (i+1));
                quant[i] = sc.nextInt();
                quant[i] = sc.nextInt();
                valor[i] = sc.nextDouble();
            }
            System.out.printf("VALOR A PAGAR: %.02f", ((valor[0] * quant[0])+(valor[1]*quant[1])));
        }
    }
}
