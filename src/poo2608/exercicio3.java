package poo2608;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.printf("Digite o primeiro numero");
        x = sc.nextInt();
        System.out.printf("Digite o segundo numero");
        y = sc.nextInt();
        if (x%2 == 0 || y%2 == 0){
            System.out.printf("Sao multiplos");
        } else if(x%2 != 0 || y%2 != 0){
            System.out.printf("Sao multiplos");
        } else{
            System.out.printf("Nao sao multiplos");
        }
        sc.close();
    }        
}

