import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-04-19
 */

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter how many numbers to sort: ");
        int num = scan.nextInt();
        int[] numbers = new int[num];
        System.out.print("Enter the numbers: ");
        for (int i = 0; i < num; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();
        selectionSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    private static void selectionSort(int[] numbers) {
        selectionSort(numbers, 0);
    }

    private static void selectionSort(int[] numbers, int index) {
        // base case
        if (index == numbers.length - 1)
            return;
        // find the minimum
        int min = numbers[index];
        int minIndex = index;
        for (int i = index + 1; i < numbers.length; i++) {
            if (min < numbers[i]) {
                min = numbers[i];
                minIndex = i;
            }
        }
        // swap with number at index
        if (index != minIndex) {
            int tmp = numbers[index];
            numbers[index] = min;
            numbers[minIndex] = tmp;
        }
        // call recursively
        selectionSort(numbers, ++index);
    }
}
