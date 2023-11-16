import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // create a new file object named output
        File file = new File("output.txt");
        
        // catches errors with the file creation
        try {
            if (!file.exists()) {
                // if the file exists we take text input and write it to file using printwriter
                PrintWriter pw = new PrintWriter(file);
                Scanner input = new Scanner(System.in);
                System.out.print("Enter text: ");
                String line = input.nextLine();
                input.close();
                pw.println(line);
                pw.close();
            } else  // if the file already exists we let the user know
                System.out.println(file.getName() + " has already been created");
                
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        }
    }
}
