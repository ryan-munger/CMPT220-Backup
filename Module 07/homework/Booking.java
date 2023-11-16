import java.sql.Time;
import java.time.LocalDateTime;

public class Booking {
    private AirlinePassenger passenger;
    private String flightNumber;
    private String seatNumber;
    private java.time.LocalDateTime bookingDateTime;
    private Time bookingTime;
    private String bookingNumber;

    // Constructors
    public Booking() {
    }

    public Booking(AirlinePassenger passenger, String flightNumber, LocalDateTime bookingDateTime) {
        this.passenger = passenger;
        this.flightNumber = flightNumber;
        this.bookingDateTime = bookingDateTime;
        this.bookingNumber = generateBookingNumber();
    }

    // Getters and setters
    public AirlinePassenger getPassenger() {
        return passenger;
    }

    public void setPassenger(AirlinePassenger passenger) {
        this.passenger = passenger;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public java.time.LocalDateTime getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(java.time.LocalDateTime bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public Time getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(Time bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getBookingNumber() {
        return bookingNumber;
    }

    public void setBookingNumber(String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    // Generates a random int between 65 and 90 and conversts it to a char
    // These random uppercase chars build the random booking number
    private String generateBookingNumber() {
        String generate = "";
        for (int i = 0; i < 6; i++) {
            generate += (char) (Math.floor(Math.random() * (90 - 65 + 1)) + 65);
        }
        return generate;
    }

    // Print out the booking information
    public String toString() {
        return passenger +
                "Booking Information: \n" +
                "[Flight Number: " + flightNumber + "]\n" +
                "[Seat Number: " + seatNumber + "]\n" +
                "[Booking Date Time: " + bookingDateTime + "]\n" +
                "[Booking Time: " + bookingTime + "]\n" +
                "[Booking Number: " + bookingNumber + "]\n";
    }

}
