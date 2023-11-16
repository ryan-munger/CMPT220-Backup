import java.util.Scanner;

public class Problem2 {
    public static void reverseCase(String s) {
        String reverse = "";
        char letter;
        // loop through the string, flip each char, build new string
        for (int i = 0; i < s.length(); i++) {
            letter = s.charAt(i);
            if (Character.isUpperCase(letter))
                letter = Character.toLowerCase(letter);
            else
                letter = Character.toUpperCase(letter);
            reverse += letter;
        }
        // print out the new string
        System.out.println("The new string is: " + reverse);
    }

    public static void main(String[] args) {
        // take user input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scan.nextLine();
        scan.close();

        // call the method
        reverseCase(word);
    }
}
