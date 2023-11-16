import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-17
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scan.nextInt();
        scan.close();
        System.out.println("The fibonacci number for index " + index + " is " + fibonacci(index));
    }

    private static long fibonacci(int n) {
        // base case
        if (n == 0 || n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
