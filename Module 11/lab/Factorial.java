import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-17
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.close();
        System.out.println("The factorial of " + num + " is " + factorial(num));
    }

    private static long factorial(int num) {
        return factorial(num, 1);
    }

    private static long factorial(int num, long result) {
        // base case
        if (num == 0)
            return 1;
        return num * factorial(num - 1, num * result);
    }
}
