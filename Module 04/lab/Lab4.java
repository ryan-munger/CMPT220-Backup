public class Lab4 {
    public static void main(String[] args) {
        // we are using a dowhile because we know we have to do it at least once
        double num; // so that is is visible in the condition
        do {
            num = Math.random();
            System.out.println(num);
        } while (num < 0.75);
    }
}
