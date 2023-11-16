import java.util.Date;

public class Test1 {
    public static void main(String args[]) {
        Student st1 = new Student();
        Faculty f1 = new Faculty();
        Staff staff1 = new Staff();

        // polymorphism
        // we can pass student, faculty, staff into methods that take person object
        Person p1 = new Student();
        Person p2 = new Faculty();
        Person p3 = new Staff();
        Person p4 = new Person();

        Person[] pArray = { new Student(), new Faculty(), new Staff() };
        st1.setName("John Smith");
        st1.setEmail("John.Smith1@marist.edu");
        st1.setCwid("2004325");
        st1.setDob(new Date(2005, 10, 01));
        printInfo(st1);

        f1.setName("Juan Arias");
        f1.setEmail("juan.arias@marist.edu");
        f1.setCwid("2003546");
        printInfo(f1);

    }

    private static void printInfo(Person p) {
        System.out.println("Name: " + p.getName());
        System.out.println("Email: " + p.getEmail());
        System.out.println("CWID: " + p.getCwid());

        if (p instanceof Student) {
            Student s = (Student) p;
            System.out.println("GPA: " + s.getGpa());
            System.out.println("Age: " + s.age());
        }
    }
}
