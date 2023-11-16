public class Doctor extends PersonLab {
    private String specialty;

    public Doctor(String specialty) {
        this.specialty = specialty;
    }

    public Doctor(String first, String last, String specialty) {
        super(first, last);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public String toString() {
        return "Doctor [Specialty: " + specialty + "] " + super.toString();
    }

}
