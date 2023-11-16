public class Project1 {
    public static void main(String[] args) {
        // create a MyNumber object with value 983
        MyInteger mynum = new MyInteger(983);

        // Test the MyNumber functions isEven, isOdd, and isPrime
        System.out.println("MyNum " + mynum.getValue() + " is even: " + mynum.isEven());
        System.out.println("MyNum " + mynum.getValue() + " is odd: " + mynum.isOdd());
        System.out.println("MyNum " + mynum.getValue() + " is prime: " + mynum.isPrime());

        // Test the MyNumber functions isEven, isOdd, and isPrime for a int argument
        int test = 568;
        System.out.println("int " + test + " is even: " + MyInteger.isEven(test));
        System.out.println("int " + test + " is odd: " + MyInteger.isOdd(test));
        System.out.println("int " + test + " is prime: " + MyInteger.isPrime(test));

        // Test MyNumber functions isEven, isOdd, and isPrime for MyInteger argument
        MyInteger test2 = new MyInteger(439);
        System.out.println("MyInteger with value " + test2.getValue() + " is even: " + MyInteger.isEven(test2));
        System.out.println("MyInteger with value " + test2.getValue() + " is odd: " + MyInteger.isOdd(test2));
        System.out.println("MyInteger with value " + test2.getValue() + " is prime: " + MyInteger.isPrime(test2));

        // Check the equals function when comparing to int
        System.out.println("MyNum " + mynum.getValue() + " is equal to " + 431 + ": " + mynum.equals(431));
        System.out.println("MyNum " + mynum.getValue() + " is equal to " + 983 + ": " + mynum.equals(983));

        // Check the equals function when comparing to a MyInteger
        MyInteger test3 = new MyInteger(389);
        MyInteger test4 = new MyInteger(983);
        System.out.println("MyNum " + mynum.getValue() + " is equal to MyInteger with value " + test3.getValue() + ": "
                + mynum.equals(test3));
        System.out.println("MyNum " + mynum.getValue() + " is equal to MyInteger with value " + test4.getValue() + ": "
                + mynum.equals(test4));

        // Check the parseInt function with a char[] input
        char testList[] = { '9', '8', '3' };
        for (char ch : testList) {
            System.out.print(ch + ", ");
        }
        // Check it is really an int and works with our equals
        int parsed = MyInteger.parseInt(testList);
        System.out.println("as an int is " + parsed);
        System.out.println(
                "MyNum " + mynum.getValue() + " is equal to parsed int " + parsed + ": " + mynum.equals(parsed));

        // Check the parseInt function with a String input
        String testString = "983";
        // Check it is really an int and works with our equals
        int parsed2 = MyInteger.parseInt(testString);
        System.out.println("String " + testString + " as an int is " + parsed2);
        System.out.println(
                "MyNum " + mynum.getValue() + " is equal to parsed int " + parsed2 + ": " + mynum.equals(parsed2));

    }
}