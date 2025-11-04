package poo1410;
import java.util.*;

public class Main {
    @SuppressWarnings({"ConvertToTryWithResources", "StringConcatenationInsideStringBufferAppend"})
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();

        Date moment = new Date(); // pega data/hora atual

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0.0;
        StringBuilder resumo = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String prodName = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double subTotal = price * quantity;
            total += subTotal;

            resumo.append(prodName + ", $" + String.format("%.2f", price)
                        + ", Quantity: " + quantity
                        + ", Subtotal: $" + String.format("%.2f", subTotal) + "\n");
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: " + moment);
        System.out.println("Order status: " + status);
        System.out.println("Client: " + name + " (" + birthDate + ") - " + email);
        System.out.println("Order items:");
        System.out.print(resumo.toString());
        System.out.println("Total price: $" + String.format("%.2f", total));

        sc.close();
    }
}