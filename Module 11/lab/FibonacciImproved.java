import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-17
 */

public class FibonacciImproved {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index = scan.nextInt();
        scan.close();
        System.out.println("The fibonacci number for index " + index + " is " + fibonacci(index));
    }

    private static long fibonacci(int n) {
        int[] cache = new int[n];
        for (int i = 0; i < n; i++)
            cache[i] = 0;
        return fibonacciHelper(n, cache);
    }

    private static int fibonacciHelper(int n, int[] cache) {
        // base case
        if (n == 0 || n == 1)
            return 1;
        // if we already calculated this term, return it
        if (cache[n - 1] != 0)
            return cache[n - 1];
        // otherwise calculate it, save it, and return it
        int value = fibonacciHelper(n - 1, cache) + fibonacciHelper(n - 2, cache);
        cache[n - 1] = value;
        return value;
    }
}
