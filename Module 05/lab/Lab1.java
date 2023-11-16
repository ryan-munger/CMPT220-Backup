import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        String binary = input.nextLine();
        input.close();
        System.out.println("The decimal value is: " + binaryToDecimal(binary));
    }

    public static int binaryToDecimal(String binaryString) {
        int decimal = 0;
        int index = 0;
        for (int i = binaryString.length() - 1; i >= 0; i--, index++) {
            if (binaryString.charAt(i) == '1')
                decimal += (int) Math.pow(2, index);
        }
        return decimal;
    }
}
