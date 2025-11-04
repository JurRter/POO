package poo2608;

import java.util.Scanner;

public class exercicio1 {
    public  static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)){
            int x;
            System.out.printf("Digite o primeiro numero a ser somado");
            x = sc.nextInt();
            if(x < 0){
                System.out.printf("NEGATIVO");
            } else{
                System.out.printf("NAO NEGATIVO");
            }
        }
    }
}
 
