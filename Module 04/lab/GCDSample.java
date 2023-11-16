import java.util.Scanner;

public class GCDSample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two numbers to find the GCD: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int gcd = 0;
        for (int i = Math.min(num1, num2); i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}