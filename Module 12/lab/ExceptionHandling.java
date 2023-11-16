import java.io.IOException;

public class ExceptionHandling {
    // forced to handle checked exceptions
    // not forced to handle unchecked exceptions
    public static void main(String[] args) throws MyException {
        // nullPointerException is a runtime exception
        // index out of bounds, etc are all runtime exceptions
        // can use conditionals to avoid exception
        String str = null;
        if (str != null)
            str.length();

        // IO exception is checked exception
        String str2 = "";
        try {
            str2.length();
            int[] a = new int[10];
            // int b = a[10];
            throw new IOException();
        } catch (NullPointerException e) {
            System.out.println("Str2 is null");
            throw new MyException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            throw new MyUncheckedException();
        } catch (Exception e) {
            // else, catches all other exceptions
            System.out.println("Some other error");
        } finally {
            // runs regardless of if there is an exception or not
            // garbage collection, closes unfinished business
            // scanners, files, etc
        }
    }
}

class MyException extends Exception {

}

class MyUncheckedException extends RuntimeException {

}

// recursive: need base case and recursive step
// recursive step must take you closer to base case
// we do not need recursion, loops can be used