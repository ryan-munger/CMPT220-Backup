import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author: Ryan Munger
 * @date: 2023-04-26
 */

public class Lab4 {
    public static void main(String[] args) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = scan.nextLine();
        scan.close();

        Map<Character, Integer> counts = new HashMap<>();
        File file = new File(filename);
        try {
            Scanner fileIn = new Scanner(file);
            while (fileIn.hasNext()) {
                String word = fileIn.next();
                word = word.toUpperCase();
                for (char ch : word.toCharArray()) {
                    if (vowels.contains(ch)) {
                        Integer count = counts.get(ch);
                        if (count == null)
                            counts.put(ch, 1);
                        else
                            counts.put(ch, ++count);
                    }
                }
            }
            fileIn.close();
        } catch (Exception e) {

        }
        System.out.println(counts);
    }
}
