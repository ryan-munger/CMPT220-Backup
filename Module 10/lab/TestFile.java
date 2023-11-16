import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("Test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        try {
            if (!file.exists()) {
                PrintWriter pw = new PrintWriter(file);
                while (true) {
                    Scanner input = new Scanner(System.in);
                    System.out.print("Enter text: ");
                    String line = input.nextLine();
                    if (line.length() == 0)
                        break;
                    pw.println(line);
                }
                pw.close();
            }
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String line = input.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file does not exist.");
        }
    }
}
