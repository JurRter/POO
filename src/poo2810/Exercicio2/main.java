package poo2810.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine(); // consume EOL

            System.out.print("Holder: ");
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double initial = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            Account acc = new Account(number, holder, initial, limit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            if (amount > acc.getWithdrawLimit()) {
                System.out.println("Withdraw error: The amount exceeds withdraw limit");
            } else if (amount > acc.getBalance()) {
                System.out.println("Withdraw error: Not enough balance");
            } else {
                acc.withdraw(amount);
                System.out.printf("New balance: %.2f%n", acc.getBalance());
            }
        }
    }
}