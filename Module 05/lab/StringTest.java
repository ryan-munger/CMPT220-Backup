import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("a");
        System.out.println((int) 'a');
        System.out.println((char) 97);
        System.out.println((char) ('a' + 1));
        // if ('a' == 97)
        // System.out.println("They are the same");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scan.nextLine().charAt(0);
        scan.close();
        if (ch >= 'a' && ch <= 'z')
            System.out.println("The char is lowercase");
        else
            System.out.println("Uppercase");
    }
}