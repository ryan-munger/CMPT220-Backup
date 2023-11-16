import java.util.Scanner;

/**
 * @author: Ryan Munger
 * @date: 2023-05-03
 */

public class TwoPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = scan.nextInt();
        scan.close();

        System.out.println("The result is " + twoPowerTail(n));
    }

    // nontail recusion, we work from base case back up
    private static int twoPower(int n) {
        // base case
        if (n == 0)
            return 1;
        return 2 * twoPower(n - 1);
    }

    // tail recursion ends at the base case w final answer
    private static int twoPowerTail(int n) {
        return twoPowerTail(n, 1);
    }

    private static int twoPowerTail(int n, int result) {
        // base case
        if (n == 0)
            return result;
        return twoPowerTail(n - 1, 2 * result);
    }
}

// linked lists are bad at finding elements by index
// arraylists are bad at inserting elements / reordering