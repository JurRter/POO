package poo2608;
import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
            double s = sc.nextDouble();
            if (s <= 2000.00) {
                System.out.println("Isento");
                sc.close();
                return;
            }
            double imposto = 0.0;
            double rem = s;

            if (rem > 4500.00) {
                imposto += (rem - 4500.00) * 0.28;
                rem = 4500.00;
            }
            if (rem > 3000.00) {
                imposto += (rem - 3000.00) * 0.18;
                rem = 3000.00;
            }
            if (rem > 2000.00) {
                imposto += (rem - 2000.00) * 0.08;
            }
            System.out.printf("R$ %.2f%n", imposto);
            sc.close();
        }
    }
