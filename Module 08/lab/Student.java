import java.util.Date;

public class Student extends Person {
    private double gpa;

    public Student() {
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int age() {
        int age = (new Date()).getYear() - getDob().getYear();
        return age;
    }

}