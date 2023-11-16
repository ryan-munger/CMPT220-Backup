import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author: Ryan Munger
 * @date: 2023-04-26
 */

public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the java file: ");
        String filename = scan.nextLine();
        scan.close();

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File does not exist.");
            System.exit(0);
        }
        try {
            Scanner fileS = new Scanner(file);
            Stack<Character> stack = new Stack<>();
            while (fileS.hasNextLine()) {
                String line = fileS.nextLine();
                for (char ch : line.toCharArray()) {
                    if (ch == '{' || ch == '(' || ch == '[')
                        stack.push(ch);
                    else if (ch == ')' && (stack.pop() != '(' || stack.empty())) {
                        System.out.println("Mismatch in ()");
                        System.exit(0);
                    } else if (ch == ']' && (stack.pop() != '[' || !stack.empty())) {
                        System.out.println("Mismatch in []");
                        System.exit(0);
                    } else if (ch == '}' && (stack.pop() != '{' || !stack.empty())) {
                        System.out.println("Mismatch in {}");
                        System.exit(0);
                    }
                }
            }
            if (stack.empty())
                System.out.println("Program is valid");
            fileS.close();
        } catch (IOException e) {

        }
    }
}
