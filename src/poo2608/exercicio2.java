package poo2608;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x;
        System.out.printf("Digite o primeiro numero");
        x = sc.nextInt();
        if(x%2 == 0){
            System.out.printf("IMPAR");
        } else{
            System.out.printf("PAR");    
        }
        sc.close();
    }
}
