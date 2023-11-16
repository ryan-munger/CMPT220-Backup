import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-03-01
 */

public class BinarySearchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
        System.out.print("Enter a key to search: ");
        int key = scan.nextInt();
        scan.close();

        // sort array
        Arrays.sort(array);
        // Find the key in the array
        int index = binarySearch(key, array);
        if (index == -1)
            System.out.println("Not found!");
        else
            System.out.println("Found at index " + index);
    }

    private static int binarySearch(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        while (low < high) {
            mid = (low + high) / 2;
            if (key == array[mid])
                return mid;
            else if (key < array[mid]) {
                high = mid - 1;
            } else
                low = mid + 1;
        }

        return -1;
    }
}
