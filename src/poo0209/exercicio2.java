package poo0209;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true){    
        int x, y;
        String quadrante;
        System.out.printf("Digite o primeiro numero");
        x = sc.nextInt();
        System.out.printf("Digite o segundo numero");
        y = sc.nextInt();
        if(x == 0 || y == 0){
            break;
        }
        if (x > 0 && y > 0){
            quadrante = "primeiro";
        } else if (x> 0 && y < 0){
            quadrante = "quarto";
        } else if (x< 0 && y > 0){
            quadrante = "segundo";
        } else if (x< 0 && y < 0){
            quadrante = "terceiro";
        } else {
            quadrante = "Origem";
        }
        System.out.println(quadrante);
    }
    sc.close();
    }
}
