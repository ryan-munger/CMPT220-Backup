import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-20
 */

public class Problem1 {
    public static void main(String[] args) {
        // user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        System.out.print("Enter a substring: ");
        String sub = scan.nextLine();
        scan.close();

        // call method and display answer to user
        System.out.println("The substring " + sub + " appears " + count(str, sub) + " times in the string " + str);
    }

    // helper function to remove user complexity
    private static int count(String str, String sub) {
        return count(str, sub, 0, 0);
    }

    // moves through the string and looks for instances of the substring
    private static int count(String str, String sub, int beginIndex, int count) {
        // base case
        if (beginIndex + sub.length() > str.length())
            return count;

        // recursive part, moves through the string using indexes
        if (str.substring(beginIndex, beginIndex + sub.length()).equals(sub))
            return count(str, sub, beginIndex + sub.length(), ++count);
        else
            return count(str, sub, beginIndex + 1, count);
    }
}
