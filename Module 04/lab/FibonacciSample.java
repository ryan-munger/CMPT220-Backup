import java.util.Scanner;

public class FibonacciSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the index to find in the Fibonacci Sequence: ");
        int n = input.nextInt();
        input.close();
        long result = 1;
        if (n > 2) {
            long n1 = 1;
            long n2 = 1;
            for (int i = 3; i <= n; i++) {
                result = n1 + n2;
                n1 = n2;
                n2 = result;
            }
            System.out.println("The " + n + " number of the Fibonacci Sequence is " + result);
        }
    }
}
