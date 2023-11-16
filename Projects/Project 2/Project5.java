import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-24
 */

public class Project5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // user input
    System.out.print("Enter the first complex number: ");
    double realPart1 = scan.nextDouble();
    double iPart1 = scan.nextDouble();
    Complex first = new Complex(realPart1, iPart1);

    System.out.print("Enter the second complex number: ");
    double realPart2 = scan.nextDouble();
    double iPart2 = scan.nextDouble();
    Complex second = new Complex(realPart2, iPart2);
    scan.close();

    // Tries all operations: addition, subtraction, multiplication, division,
    // absolute value
    System.out.println("(" + first + ") + (" + second + ") = " + Complex.add(first, second).toString());
    System.out.println("(" + first + ") - (" + second + ") = " + Complex.subtract(first, second).toString());
    System.out.println("(" + first + ") * (" + second + ") = " + Complex.multiply(first, second).toString());
    System.out.println("(" + first + ") / (" + second + ") = " + Complex.divide(first, second).toString());
    System.out.println("|" + first + "| = " + first.abs());
  }
}
