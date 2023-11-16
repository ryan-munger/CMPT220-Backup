public class Lab3 {
    public static void main(String[] args) {
        // Headers
        System.out.println("Number  SquareRoot");
        System.out.println("------------------");
        // loop
        for (int i = 0; i <= 20; i += 2) {
            System.out.printf("%-11d %.4f\n", i, Math.sqrt(i));
        }
    }
}
