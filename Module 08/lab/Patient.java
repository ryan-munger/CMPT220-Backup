import java.util.Date;

public class Patient extends PersonLab {
    private String id;
    private int age;
    private Date dob;
    private Doctor attending;
    private Date admitDate;
    private Date dischargeDate;

    public Patient(String id, int age, Date dob, Doctor attending, Date admitDate, Date dischargeDate) {
        this.id = id;
        this.age = age;
        this.dob = dob;
        this.attending = attending;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
    }

    public Patient(String first, String last, String id, int age, Date dob, Doctor attending, Date admitDate,
            Date dischargeDate) {
        super(first, last);
        this.id = id;
        this.age = age;
        this.dob = dob;
        this.attending = attending;
        this.admitDate = admitDate;
        this.dischargeDate = dischargeDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Doctor getAttending() {
        return attending;
    }

    public void setAttending(Doctor attending) {
        this.attending = attending;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", age=" + age + ", dob=" + dob + ", attending=" + attending + ", admitDate="
                + admitDate + ", dischargeDate=" + dischargeDate + "] " + super.toString();
    }

}
