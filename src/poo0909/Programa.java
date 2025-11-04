package poo0909;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
        Retagulo rec = new Retagulo();
        System.out.println("Digite Altura e comprimento");
        rec.height = sc.nextDouble();
        rec.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", rec.area());
        System.out.printf("PERIMETER = %.2f%n", rec.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", rec.diagonal()); 
        }
    }
}
