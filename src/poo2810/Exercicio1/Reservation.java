package poo2810.Exercicio1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {
    private int roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(int roomNumber, LocalDate checkin, LocalDate checkout) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public int getRoomNumber() { return roomNumber; }
    public LocalDate getCheckin() { return checkin; }
    public LocalDate getCheckout() { return checkout; }

    public int duration() {
        return (int) ChronoUnit.DAYS.between(checkin, checkout);
    }

    // returns null if ok; otherwise an error message
    public String updateDates(LocalDate newCheckin, LocalDate newCheckout) {
        LocalDate today = LocalDate.now();
        if (!newCheckout.isAfter(newCheckin)) {
            return "Check-out date must be after check-in date";
        }
        if (newCheckin.isBefore(today) || newCheckout.isBefore(today)) {
            return "Reservation dates for update must be future dates";
        }
        this.checkin = newCheckin;
        this.checkout = newCheckout;
        return null;
    }

    @Override
    public String toString() {
        return "Reservation: Room " + roomNumber +
               ", check-in: " + checkin.format(FMT) +
               ", check-out: " + checkout.format(FMT) +
               ", " + duration() + " nights";
    }
}