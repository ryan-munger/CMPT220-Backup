import java.util.Scanner;

public class Problem1 {
    public static void main(String args[]) {
        // Screate a scanner and take in our user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        scan.close();

        // Use conditionals to evaluate our cases and print out the correct response
        if (num < 0) {
            System.out.println("The square of " + num + " is " + num * num + ".");
        } else if (num > 0) {
            System.out.println("The square root of " + num + " is " + Math.sqrt(num) + ".");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
