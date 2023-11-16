import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string s: ");
        String s = scan.nextLine();
        System.out.print("Enter an integer b: ");
        int b = scan.nextInt();
        scan.close();

        System.out.printf("The hashcode for %s is %d", s, hashCode(s, b));
    }

    public static int hashCode(String s, int b) {
        int hash = 0;
        for (int i = 0; i < s.length(); i++) {
            hash = hash * b + s.charAt(i);
        }
        return hash;
    }
}
