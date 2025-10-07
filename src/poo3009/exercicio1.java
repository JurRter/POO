package poo3009;

import java.util.Scanner;

public class exercicio1{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            int[] otario = new int[10];
            int j;
            System.out.println("Quantos numeros voce vai digitar?");
            j = sc.nextInt();
            for(int i = 0; i < j; i++){
                System.out.printf("Digite um numero: ");
                otario[i] = sc.nextInt();
            }
            System.out.println("NUMEROS NEGATIVOS:\r");
            for(int i = 0; i < j; i++){
                if(otario[i] < 0){
                    System.out.println(otario[i]);
                }
            }
        }  
    }
}