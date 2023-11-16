import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-19
 */

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scan.nextLine();
        scan.close();

        System.out.println("Is the word a palindrome? " + isPalindrome(word));
    }

    private static boolean isPalindrome(String word) {
        return isPalindrome(word, 0, word.length() - 1);
    }

    private static boolean isPalindrome(String word, int low, int high) {
        // base case
        if (low >= high)
            return true;
        // recursive call
        if (word.charAt(low) == word.charAt(high))
            return isPalindrome(word, ++low, --high);
        return false;
    }
}
