import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-12
 */

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter an integer value: ");
                int a = scan.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Not an integer ");
                scan.nextLine();
            }
        }
        scan.close();
        String str = null;
        if (str != null)
            str.length();
    }
}
