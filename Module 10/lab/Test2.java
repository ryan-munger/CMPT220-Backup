import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-12
 */

public class Test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        try {
            int mum = scan.nextInt();
            String str = null;
            str.length();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input, type was " + e.getMessage());
            e.printStackTrace(); // prints the exception without crashing the program
            throw new ArithmeticException("Because I want to");
        } catch (NullPointerException e) {
            System.out.println("Null object");
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            // always executes despite if anything was caught
            System.out.println("In finally");
        }
        scan.close();
        System.out.println("Program finished properly");
    }
}
