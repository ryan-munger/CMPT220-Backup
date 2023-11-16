import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a list of integer numbers (end with a 0): ");
        int[] numbers = new int[50];
        int count = 0;
        int n = 0;
        do {
            n = scan.nextInt();
            if (n != 0)
                numbers[count++] = n;
        } while (n != 0);
        scan.close();

        // count numbers above and below average
        // location 0 is below, 1 above
        int[] aboveBelow = aboveBelowCount(count, numbers);

        System.out.printf("There are %d above the average and %d below the average.", aboveBelow[0], aboveBelow[1]);
    }

    /**
     * Counts above and below average
     * 
     * @param count
     * @param numbers
     * @return an array of the below and above
     */
    private static int[] aboveBelowCount(int count, int[] numbers) {
        double average = avg(count, numbers);
        int above = 0;
        int below = 0;
        for (int i = 0; i < count; i++) {
            if (numbers[i] > average)
                above++;
            else if (numbers[i] < average)
                below++;
        }
        int[] array = new int[2];
        array[0] = below;
        array[1] = above;
        return array;
    }

    private static double avg(int count, int[] numbers) {
        // calc avg
        double average = 0;
        for (int i = 0; i < count; i++) {
            average += numbers[i];
        }
        average /= count;
        return average;
    }
}
