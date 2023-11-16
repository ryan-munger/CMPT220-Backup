import java.util.Random;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-03-01
 */

public class ArrayTest5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
        System.out.print("Enter a key to search: ");
        int key = scan.nextInt();
        scan.close();
        // Find the key in the array
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                System.out.println("The number is in location " + i);
                System.exit(0);
            }
        }
        System.out.println("The key is not found in the array");
    }
}
