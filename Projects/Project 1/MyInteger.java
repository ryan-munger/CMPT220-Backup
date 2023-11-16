public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    // Checks if value is even
    public boolean isEven() {
        if (value % 2 == 0)
            return true;
        return false;
    }

    // Checks if value is odd
    public boolean isOdd() {
        if (value % 2 == 1)
            return true;
        return false;
    }

    // Checks of value is prime
    public boolean isPrime() {
        int divide = 2;
        // we only need to check divisors up to the number / 2
        while (divide <= value / 2) {
            // if there is a remainder increase the divisor by 1
            if (value % divide != 0)
                divide++;
            // if the remainder is 0 this number is not prime
            else
                return false;
        }
        return true;
    }

    // Checks if an int is even
    public static boolean isEven(int num) {
        if (num % 2 == 0)
            return true;
        return false;
    }

    // Checks if an int is odd
    public static boolean isOdd(int num) {
        if (num % 2 == 1)
            return true;
        return false;
    }

    // Checks if an int is prime
    public static boolean isPrime(int num) {
        int divide = 2;
        // we only need to check divisors up to the number / 2
        while (divide <= num / 2) {
            // if there is a remainder increase the divisor by 1
            if (num % divide != 0)
                divide++;
            // if the remainder is 0 this number is not prime
            else
                return false;
        }
        return true;
    }

    // Checks if the value of a MyInteger is even
    public static boolean isEven(MyInteger num) {
        if (num.getValue() % 2 == 0)
            return true;
        return false;
    }

    // Checks if the value of a MyInteger is odd
    public static boolean isOdd(MyInteger num) {
        if (num.getValue() % 2 == 1)
            return true;
        return false;
    }

    // Checks if the value of a MyInteger is prime
    public static boolean isPrime(MyInteger num) {
        int divide = 2;
        // we only need to check divisors up to the number / 2
        while (divide <= num.getValue() / 2) {
            // if there is a remainder increase the divisor by 1
            if (num.getValue() % divide != 0)
                divide++;
            // if the remainder is 0 this number is not prime
            else
                return false;
        }
        return true;
    }

    // compares value to an int
    public boolean equals(int num) {
        if (value == num)
            return true;
        return false;
    }

    // compares value to the value of a MyInteger
    public boolean equals(MyInteger num) {
        if (num.getValue() == value)
            return true;
        return false;
    }

    // parses a list of numeric chars to a int
    public static int parseInt(char[] list) {
        StringBuffer num = new StringBuffer();
        for (char ch : list) {
            num.append(ch);
        }
        return Integer.parseInt(num.toString());
    }

    public static int parseInt(String numString) {
        return Integer.parseInt(numString);
    }
}