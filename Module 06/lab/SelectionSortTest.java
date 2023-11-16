import java.util.Random;

public class SelectionSortTest {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100);
        for (int num : array)
            System.out.print(num + " ");
        System.out.println(" ");
        selectionSort(array);
        for (int num : array)
            System.out.print(num + " ");
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            // swap if required
            if (index != i) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
            }
        }
    }
}