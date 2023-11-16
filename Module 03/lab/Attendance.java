import java.util.Scanner;

public class Attendance {
    public static void main(String args[]) {
        // gather data from user - the number of classes held and attended
        Scanner scan = new Scanner(System.in);
        System.out.print("Number of classes held: ");
        int held = scan.nextInt();
        System.out.print("Number of classes attended: ");
        int attend = scan.nextInt();
        scan.close();

        // calculate percentage
        // casted to double for accurate calculation
        // casted to int for display purposes
        int percentage = (int) (((double) attend / held) * 100);
        // Determine if the student can take exam
        System.out.println("Percentage of classes attended: " + percentage + "%");
        System.out.print("Is student allowed to sit in exam? " +
                ((percentage > 75) ? "Yes" : "No"));
    }
}
