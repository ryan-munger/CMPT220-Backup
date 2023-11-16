import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-20
 */

public class Problem2 {
    public static void main(String[] args) {
        // take user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scan.nextLine();
        scan.close();

        // check for the nesting
        if (nestParen(text))
            System.out.println("The string " + text + " is a nesting of zero or more parenthesis.");
        else
            System.out.println("The string " + text + " is not a nesting of zero or more parenthesis.");
    }

    // helper function to remove user complexity
    private static boolean nestParen(String text) {
        // if the text is of odd length it cannot be composed of pairs
        if (text.length() % 2 == 1)
            return false;
        return nestParen(text, 0, text.length() - 1);
    }

    private static boolean nestParen(String text, int low, int high) {
        // base case
        if (low >= high)
            return true;
        // recursive call that moes inward on the text
        if (text.charAt(low) == '(' && text.charAt(high) == ')')
            return nestParen(text, ++low, --high);
        return false;
    }
}