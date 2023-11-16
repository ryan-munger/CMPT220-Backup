import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-03-22
 */

public class Problem1 {
    public static void main(String[] args) {
        // User input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Passenger Title: ");
        String title = scan.nextLine();
        System.out.print("Enter Passenger First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter Passenger Last Name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter Passenger Date of Birth YYYY-MM-DD: ");
        String dobString = scan.nextLine();
        scan.close();

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
        // Print out the passenger details
        System.out.println(passenger.toString());

    }
}
