import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // this runs once regardless of count's value
        int count = 10;
        do {
            System.out.println("Java is fun!");
            count++;
        } while (count < 10);

        // reading with a DoWhile
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of nums, end with 0: ");
        int value;
        do {
            value = scan.nextInt();
            System.out.println(value);
        } while (value != 0);
        scan.close();
    }
}
