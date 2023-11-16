import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-12
 */

public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner fileIn;
        while (true) {
            try {
                System.out.print("Enter filename: ");
                String filename = scan.nextLine();
                File file = new File(filename);
                fileIn = new Scanner(file);
                while (fileIn.hasNext()) {
                    System.out.println(fileIn.nextLine());
                }
                break;
            } catch (FileNotFoundException e) {
            }
        }
        scan.close();
    }
}

// irregular expression