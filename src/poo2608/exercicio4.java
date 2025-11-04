package poo2608;

import java.util.Scanner;

public class exercicio4{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.printf("Digite o primeiro horario");
        x = sc.nextInt();
        System.out.printf("Digite o segundo horario");
        y = sc.nextInt();
        if (x>y){

            x = x-y;
            System.out.printf("O JOGO DUROU %d HORAS", x);
        } else if(y>x){
            x = y-x;
            System.out.printf("O JOGO DUROU %d HORAS", x);
        } else{
            System.out.printf("O JOGO DUROU 24 HORAS");
        }
        sc.close();
    }
}