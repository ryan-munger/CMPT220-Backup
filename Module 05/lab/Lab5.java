import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        System.out.print("Enter a character: ");
        char ch = scan.nextLine().charAt(0);
        scan.close();

        System.out.println("The resulting string is: " + interweave(ch, str));
    }

    public static String interweave(char ch, String str) {
        String newStr = "";
        for (int i = 0; i < str.length() - 1; i++) {
            newStr = newStr + str.charAt(i) + ch;
        }
        newStr += str.charAt(str.length() - 1);
        return newStr;
    }
}