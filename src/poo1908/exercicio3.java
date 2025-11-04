package poo1908;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int[] a = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escreva 4 numeros pra serem escaneados");
        for(int i = 0; i < 4; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("DIFERENCA = " + (a[0] * a[1] - a[2] * a[3]));
        sc.close();
    }
}
