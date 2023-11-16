import java.util.Scanner;
import java.util.Stack;

/**
 * @author: Ryan Munger
 * @date: 2023-04-26
 */

public class PostFix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String eq = scan.nextLine();
        Scanner scanS = new Scanner(eq);
        Stack<Double> stack = new Stack<>();

        while (scanS.hasNext()) {
            String next = scanS.next();
            try {
                double a = Double.parseDouble(next);
                stack.push(a);
            } catch (Exception e) {
                if (next.equals("+")) {
                    double total = stack.pop();
                    while (!stack.empty()) {
                        total += stack.pop();
                    }
                    stack.push(total);
                } else if (next.equals("-")) {
                    double total = stack.pop();
                    while (!stack.empty()) {
                        total -= stack.pop();
                    }
                    stack.push(total);
                } else if (next.equals("*")) {
                    double total = stack.pop();
                    while (!stack.empty()) {
                        total *= stack.pop();
                    }
                    stack.push(total);
                } else if (next.equals("/")) {
                    double total = stack.pop();
                    while (!stack.empty()) {
                        if (stack.peek() != 0)
                            total /= stack.pop();
                    }
                    stack.push(total);
                } else
                    continue;
            }
        }
        scan.close();
        scanS.close();
        System.out.println("The total is: " + stack.pop());
    }
}