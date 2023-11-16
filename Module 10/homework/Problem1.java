import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        // set up scanner to take user input
        Scanner scan = new Scanner(System.in);
        String str;
        char check;
        
        // the while loop keeps prompting the user until a valid string is entered
        while (true) {
            try {
                System.out.println("Enter a string of only letters and numbers: ");
                str = scan.nextLine();
                // checks that each char is only a letter or a number
                for(int i = 0; i < str.length(); i++) {
                    check = str.charAt(i);
                    if(!((check >= 48 && check <= 57) || (check >= 65 && check <= 90) || (check >= 97 && check <= 122))){
                        // throw an exception that descirbes the issue including the bad char
                        throw new Exception("Invalid Character " + check);
                    } 
                }
                break;
            } catch (Exception e) {
                // Catches and prints the exception info
                System.out.println(e.getMessage());
            }
        }
        scan.close();
        // Prints the length of the final valid string
        System.out.println("The length of your string is " + str.length() + ".");
    }
}