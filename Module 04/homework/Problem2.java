import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // take input from user
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();
        scan.close();
        // start guess at 1, this is the lowest num the sqrt of a pos int can be
        double guess = 1;
        double nextGuess;
        Boolean flag = false;

        // used a do while because the first guess could be correct
        do {
            // calculating the next guess
            nextGuess = (guess + (num / guess)) / 2;
            // checking to see if the guess is close enough
            if (Math.abs(nextGuess - guess) < 0.0000001)
                flag = true;
            guess = nextGuess;
        } while (!flag);

        System.out.println("The sqrt(" + num + ") is " + guess);
    }
}
