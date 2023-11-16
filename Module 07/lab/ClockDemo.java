import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-03-22
 */

public class ClockDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the seconds since midnight: ");
        int secondsSinceMidnight = scan.nextInt();

        // first clock
        Clock firstClock = new Clock(secondsSinceMidnight);

        // tick the clock
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock.toString());
        }

        // Hours, minutes, seconds
        System.out.println("Enter Hours: ");
        int hours = scan.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scan.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scan.nextInt();
        scan.close();

        Clock secondClock = new Clock(hours, minutes, seconds);
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println(secondClock.toString());
        }

        // Add the clocks
        firstClock.addClock(secondClock);

        // Print the clocks
        System.out.println("After Adding");
        System.out.println(firstClock.toString());
        System.out.println(secondClock.toString());
    }
}
