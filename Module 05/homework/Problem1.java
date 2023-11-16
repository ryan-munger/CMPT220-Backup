import java.util.Scanner;

public class Problem1 {
    public static long factorial(int n) {
        // we use a long because factorials quickly become very large
        long fact = 1;
        // multiplies every number up to n
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        // take user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        scan.close();

        // call the method
        System.out.println(factorial(num));
    }
}