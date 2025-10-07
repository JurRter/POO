


import java.util.Locale;
import java.util.Scanner;
public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Cliente clie = new Cliente();
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter account Data:");
            clie.id = sc.nextInt();
            sc.nextLine();
            System.out.println("Account holder:");
            clie.nome = sc.nextLine();
            System.out.println("Initial balance:");
            double quant = sc.nextDouble();
            clie.deposito(quant);
            System.out.printf("Account data: Account %d, Holder: %s, Balance: $ %.2f\n", clie.id, clie.nome, clie.din);
            System.out.println("Enter a deposit value:");
            quant = sc.nextDouble();
            clie.deposito(quant);
            System.out.println("Account data:");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.02f\n", clie.id, clie.nome, clie.din);
            System.out.println("Enter a withdraw value:");
            quant = sc.nextDouble();
            clie.saque(quant);
            System.out.println("Account data:");
            System.out.printf("Account %d, Holder: %s, Balance: $ %.02f\n", clie.id, clie.nome, clie.din);
        }
    }
}
