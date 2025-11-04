package poo1609.Bancofixar;

import java.util.Locale;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Cliente clie = new Cliente();
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter account number:");
            clie.id = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter account holder:");
            clie.nome = sc.nextLine();
            System.out.println("Is there na initial deposit (y/n)?");
            String o = sc.nextLine();
            if(o.equals("y")){
                System.out.println("Enter initial deposit value:");
                double quant = sc.nextDouble();
                clie.deposito(quant);
            }
            System.out.println("Account data:");
            System.out.printf("Account %.02f, Holder: %s, Balance: $ %.02f\n", clie.id, clie.nome, clie.din);
            
            System.out.println("Enter a deposit value:");
            double quant = sc.nextDouble();
            clie.deposito(quant);
            System.out.println("Account data:");
            System.out.printf("Account %.02f, Holder: %s, Balance: $ %.02f\n", clie.id, clie.nome, clie.din);
            System.out.println("Enter a withdraw value:");
            quant = sc.nextDouble();
            clie.saque(quant);
            System.out.println("Account data:");
            System.out.printf("Account %.02f, Holder: %s, Balance: $ %.02f\n", clie.id, clie.nome, clie.din);
        }
    }
}
