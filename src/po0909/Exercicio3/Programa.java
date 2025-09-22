package po0909.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)){
            Estudante est = new Estudante();
            est.name = sc.nextLine();
            est.nota1 = sc.nextDouble();
            est.nota2 = sc.nextDouble();
            est.nota3 = sc.nextDouble();
            System.out.printf("FINAL GRADE: %.2f%n", est.med());
            if (est.med() < 60.0) {
                System.out.println("FAILED");
                System.out.printf("MISSING %.2f POINTS%n", est.missingPoints());
            }
            else {
                System.out.println("PASS");
            }
        }
    }
}
