
package po0909.Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            try (Scanner sc = new Scanner(System.in)){
            Empregado emp = new Empregado();
            System.out.print("Name: ");
            emp.name = sc.nextLine();
            System.out.print("Gross salary: ");
            emp.salariobruto = sc.nextDouble();
            System.out.print("Tax: ");
            emp.taxa = sc.nextDouble();
            System.out.println();
            System.out.println("Employee: " + emp);
            System.out.println();
            System.out.print("Which percentage to increase salary? ");
            double percentage = sc.nextDouble();
            emp.aumento(percentage);
            System.out.println();
            System.out.println("Updated data: " + emp);
        }
    }
}

