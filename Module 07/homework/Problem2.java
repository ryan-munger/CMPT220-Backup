import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-03-22
 */

public class Problem2 {
    public static void main(String[] args) {
        // User Input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Passenger Title: ");
        String title = scan.nextLine();
        System.out.print("Enter Passenger First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter Passenger Last Name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter Passenger Date of Birth YYYY-MM-DD: ");
        String dobString = scan.nextLine();

        // Convert the user's string date to a Date object using a format
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            // Parsing the String
            dob = dateFormat.parse(dobString);
        } catch (ParseException e) {
            // Auto generated catch block
            e.printStackTrace();
        }

        // Create the instance of passenger with the user data
        AirlinePassenger passenger = new AirlinePassenger(title, firstName, lastName, dob);

        // More user data for the booking
        System.out.print("Enter Flight Number: ");
        String flightNumber = scan.nextLine();
        System.out.print("Enter Booking Date and Time (YYYY-MM-DDT:hh:mm:ss): ");
        String bookingDateTimeString = scan.nextLine();
        scan.close();

        // Parse the user data into a LocalDateTime object
        java.time.LocalDateTime bookingDateTime = java.time.LocalDateTime.parse(bookingDateTimeString);
        // Create the instance of booking with the user's data
        Booking booking = new Booking(passenger, flightNumber, bookingDateTime);
        // Print out the booking information
        System.out.println(booking);
    }
}
