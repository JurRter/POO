package poo0209;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int x;
        int alcool = 0, gasolina = 0, diesel = 0;
        System.out.printf("Digite");
        x = sc.nextInt();
        while(x != 4){
            x = sc.nextInt();
            switch (x) {
                case 1 -> alcool++;
                case 2 -> gasolina++;
                case 3 -> diesel++;
                default -> {}
            }
        }
        System.out.printf("MUITO OBRIGADO\nAlcool: %d\nGasolina: %d\nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}
