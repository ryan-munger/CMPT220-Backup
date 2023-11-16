import java.util.Scanner;

public class Resort {
    public static void main(String args[]) {
        // Get the temp from the user
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the temp! ");
        double temp = scan.nextDouble();
        scan.close();

        // use cascading if statements to check which activity is best
        // Statements should be as simple as possible
        if (temp > 95 || temp < 20)
            System.out.println("Visit our shops!");
        else if (temp >= 80)
            System.out.println("Swimming");
        else if (temp >= 60)
            System.out.println("Tennis");
        else if (temp >= 40)
            System.out.println("Golf");
        else
            System.out.println("Skiing");
    }
}
