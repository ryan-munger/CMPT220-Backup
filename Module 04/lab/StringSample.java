public class StringSample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        if (s1.equals(s3) && s1.equals(s2)) {
            System.out.println("The strings are the same!");
        }
    }
}