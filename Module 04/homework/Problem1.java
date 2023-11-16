import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // take input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();

        // start our search for a prime at (num1*num2)+1 bc the prime has to be greater
        // than or equal to this, but it is + 1 bc this calculation clearly is not prime
        int prime = (num1 * num2) + 1;
        int divide = 2;
        int rem;

        // we only need to check divisors up to the number / 2
        while (divide <= prime / 2) {
            // check the remainder
            rem = prime % divide;
            // if there is a remainder increase the divisor by 1
            if (rem != 0)
                divide++;
            // if the remainder is 0 this number is not prime, continue looking
            else
                prime++;
        }
        // when this loop ends the number stored is prime
        System.out.println("The next prime number is " + prime);
    }
}
