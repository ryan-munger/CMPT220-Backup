import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Create lists of user specified size
        System.out.print("Enter the size of the lists: ");
        int size = scan.nextInt();
        int list1[] = new int[size];
        int list2[] = new int[size];

        // populate lists
        System.out.print("List 1: ");
        for (int i = 0; i < size; i++) {
            list1[i] = scan.nextInt();
        }
        System.out.print("List 2: ");
        for (int i = 0; i < size; i++) {
            list2[i] = scan.nextInt();
        }
        scan.close();

        // call method and print answer
        System.out.printf("The sum of the products of corresponding elements is: %d", crossSum(list1, list2));
    }

    /**
     * Calculates the sum of corresponding list elements
     * 
     * @param list1
     * @param list2
     * @return the sum
     */
    private static int crossSum(int[] list1, int[] list2) {
        int sum = 0;
        for (int i = 0; i < list1.length; i++)
            sum += list1[i] * list2[i];
        return sum;
    }
}
