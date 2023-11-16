import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-03-01
 */

public class Anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();
        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();
        scan.close();

        if (isAnagram(str1, str2))
            System.out.printf("%s and %s are anagrams. \n", str1, str2);
    }

    public static boolean isAnagram(String s1, String s2) {
        s1 = s1.replaceAll(" ", "");
        s2 = s2.replaceAll(" ", "");
        if (s1.length() != s2.length())
            return false;
        char[] ch1 = new char[s1.length()];
        char[] ch2 = new char[s2.length()];
        for (int i = 0; i < s1.length(); i++) {
            ch1[i] = s1.charAt(i);
            ch2[i] = s2.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i])
                return false;
        }
        return true;
    }
}
