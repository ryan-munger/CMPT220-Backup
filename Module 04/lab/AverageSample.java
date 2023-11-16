import java.util.Scanner;

public class AverageSample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer numbers to average (0 to end): ");
        int num = input.nextInt();
        int sum = 0;
        int count = 0;
        while (num != 0) {
            sum += num;
            count++;
            num = input.nextInt();
        }
        input.close();
        double average = (double) sum / count;
        System.out.println("The average is: " + average);
    }
}
