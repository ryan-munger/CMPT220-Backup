import java.util.*;
import java.io.*;

public class Problem2 {
    public static void main(String[] args) throws Exception {
        // Ask user for filename and validate it
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a text file: ");
        String filename = scan.nextLine();
        scan.close();
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File " + filename + " does not exist");
            System.exit(0);
        }

        // use a treeset to store the data (no duplicates and sorted)
        // line by line word by word add each one
        // not case sensitive, a word is a word
        TreeSet<String> words = new TreeSet<>();
        Scanner scanF = new Scanner(file);
        while (scanF.hasNextLine()) {
            String line = scanF.nextLine();
            Scanner scanL = new Scanner(line);
            while (scanL.hasNext()) {
                String word = scanL.next();
                word = word.toLowerCase();
                words.add(word);
            }
            scanL.close();
        }
        scanF.close();

        // display the result
        System.out.print("The unique words in this document are: ");
        for (String word : words)
            System.out.print(word + ", ");
    }
}