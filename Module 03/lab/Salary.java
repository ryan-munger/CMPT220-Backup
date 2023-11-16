// ***************************************************************
// Salary.java
// Computes the raise and new salary for an employee
// ***************************************************************

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get the current salary and performance rating
        System.out.print("Enter the current salary: ");
        double currentSalary = input.nextDouble();
        System.out.print("Enter the performance rating: ");
        double rating = input.nextDouble();
        input.close();

        // Compute the raise -- Use if ... else ...
        double raise = 0;
        if (rating == 1)
            raise = .06 * currentSalary;
        else if (rating == 2)
            raise = .04 * currentSalary;
        else if (rating == 3)
            raise = .015 * currentSalary;
        else
            System.out.println("Nonvalid rating!");

        // Print the results
        System.out.println("Amount of your raise: $" + (int) (raise * 100) / 100.0);
        System.out.println("Your new salary: $" + (int) ((currentSalary + raise) * 100) / 100.0);
    }
}