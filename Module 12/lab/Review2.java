public class Review2 {
    public static void main(String[] args) {
        Class3 c3 = new Class3();
        // all true
        System.out.println((c3 instanceof Class1));
        System.out.println((c3 instanceof Class2));
        System.out.println((c3 instanceof B));
        System.out.println((c3 instanceof C));
    }
}

// abstract classes can have variables and other methods
abstract class Class1 {
    abstract int method();
}

class Class2 extends Class1 {

    @Override
    int method() {
        // TODO Auto-generated method stub
        return 0;
    }

}

interface B {
    int method2();
}

interface C {
    int method2();
}
// everything in an interface is an abstract method (no instance variables
// allowed)

class Class3 extends Class2 implements B, C {
    // both interface overrides satisfied (same name for method)
    @Override
    public int method2() {
        // TODO Auto-generated method stub
        return 0;
    }

}

// forced to handle unchecked exceptions
// not forced to handle checked exceptions
