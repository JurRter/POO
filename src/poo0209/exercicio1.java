package poo0209;
import java.util.Scanner;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int senha = 0;
        System.out.printf("Digite a senha");
        while(senha != 2002){
            senha = sc.nextInt();
            if(senha != 2002){
                System.out.println("Senha invalida");
            }
        }
        System.out.printf("Senha valida");
    sc.close();
    }
}
