package repository;
import model.Booking;
import java.util.*;

public class BookingRepository {
    private static final List<Booking> bookings = new ArrayList<>();

    public static void addBooking(Booking booking) {
        bookings.add(booking);
    }

    public static List<Booking> getAllBookings() {
        return bookings;
    }
}
