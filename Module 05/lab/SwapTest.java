public class SwapTest {
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        swap(i, j);
        System.out.println("i is " + i);
        System.out.println("j is " + j);
    }

    private static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
