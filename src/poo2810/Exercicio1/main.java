package poo2810.Exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Room number: ");
            int room = sc.nextInt();
            sc.nextLine();

            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate in = LocalDate.parse(sc.nextLine().trim(), fmt);

            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate out = LocalDate.parse(sc.nextLine().trim(), fmt);

            if (!out.isAfter(in)) {
                System.out.println("Error in reservation: Check-out date must be after check-in date");
                return;
            }

            Reservation r = new Reservation(room, in, out);
            System.out.println(r);

            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate nin = LocalDate.parse(sc.nextLine().trim(), fmt);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate nout = LocalDate.parse(sc.nextLine().trim(), fmt);

            String err = r.updateDates(nin, nout);
            if (err != null) {
                System.out.println("Error in reservation: " + err);
            } else {
                System.out.println(r);
            }
        }
    }
}