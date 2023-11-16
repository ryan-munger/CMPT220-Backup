public class Review {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        System.out.println(array1.length);

        int[][] array2 = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        System.out.println("Rows: " + array2.length);
        System.out.println("Columns: " + array2[0].length);

        // instance of testclass
        TestClass t1 = new TestClass();
        TestClass t2 = new TestClass(1, 2);

        // instance if testclass2
        TestClass2 t3 = new TestClass2(1, 2);

        // start at bottom, go up until method signature found
        t3.method(3.5);
        t3.method(3);

        // polymorhism
        TestClass t4 = t3;
        if (t4 instanceof TestClass2)
            System.out.println("t4 is an instance of TestClass2: " + (t4 instanceof TestClass2));
    }
}

class TestClass {
    // instance variables
    private double x1;
    private double x2;

    // class variable
    // in the UML, you underline the entry to represent that it is static
    public static double x3;

    // no-arg constructor
    public TestClass() {

    }

    //
    public TestClass(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    // getters and setters
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    // note - these are static
    // in the UML, you underline the entry to represent that it is static
    public static double getX3() {
        return x3;
    }

    public static void setX3(double x3) {
        TestClass.x3 = x3;
    }

    public void method(double x) {
        System.out.println("In TestClass");
    }

}

class TestClass2 extends TestClass {
    TestClass2(double x1, double x2) {
        super(x1, x2);
    }

    public void method(int x) {
        System.out.println("In TestClass2");
    }
}