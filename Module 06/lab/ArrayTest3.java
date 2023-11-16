
public class ArrayTest3 {
    public static void main(String[] args) {
        double[] array = new double[100];
        for (int i = 0; i < 100; i++) {
            array[i] = Math.random() * 100;
        }

        // what's the max value?
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        System.out.println(max);
    }
}
