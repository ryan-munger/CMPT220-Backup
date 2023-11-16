import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args){
        //subtracts the fraction c/d from a/b
        //create a scanner to take input and use it to collect data from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        double a = scan.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scan.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scan.nextDouble();
        System.out.print("Enter coefficient d: ");
        double d = scan.nextDouble();
        scan.close();

        //perform the calculation using the formula for subtracting fractions
        double solution = (a * d - b * c) / (b* d);
        //print out the solution rounded to 5 decimal places
        System.out.println("The solution is " + (int)(solution * 100000) / 100000.);
    }
}

