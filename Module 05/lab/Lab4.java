import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string s: ");
        String s = scan.nextLine();
        System.out.print("Enter an string s1: ");
        String s1 = scan.nextLine();
        scan.close();

        // Output
        if (isPrefix(s, s1))
            System.out.println(s1 + " is a prefix for " + s);
        else
            System.out.println(s1 + " is not a prefix for " + s);
    }

    public static boolean isPrefix(String s, String s1) {
        // return s.startsWith(s1);

        // return s.substring(0,s1.length()).equals(s1);
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s.charAt(i))
                return false;
        }
        return true;
    }
}