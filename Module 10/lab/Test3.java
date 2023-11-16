import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        try {
            int num = readInput();
        } catch (Exception e) {
            System.out.println("Bad input type");
        }
    }

    private static int readInput() throws InputMismatchException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        return num;
    }
}
