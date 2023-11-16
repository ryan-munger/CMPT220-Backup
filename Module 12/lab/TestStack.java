import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        for (int i = 0; i < 20; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
