import java.util.Scanner;

public class PassString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        scan.close();

        toUpperCase(str);
        System.out.println("The string is now: " + str);
    }

    private static String toUpperCase(String str) {
        str = str.toUpperCase();
        System.out.println(str);
        return str;
    }
}
