import java.util.Date;

public class AirlinePassenger {
    private String title;
    private String firstName;
    private String lastName;
    private Date dob;
    private String mobileNumber;
    private String frequentFlyerNumber;
    private int milesFlown;
    private String nationality;
    private String passportNumber;
    private Date passportExpiry;
    private String passportCountry;
    private Date passportIssueDate;

    // Constructors
    public AirlinePassenger() {
    }

    public AirlinePassenger(String title, String firstName, String lastName, Date dob) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFrequentFlyerNumber() {
        return frequentFlyerNumber;
    }

    public void setFrequentFlyerNumber(String frequentFlyerNumber) {
        this.frequentFlyerNumber = frequentFlyerNumber;
    }

    public int getMilesFlown() {
        return milesFlown;
    }

    public void setMilesFlown(int milesFlown) {
        this.milesFlown = milesFlown;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public Date getPassportExpiry() {
        return passportExpiry;
    }

    public void setPassportExpiry(Date passportExpiry) {
        this.passportExpiry = passportExpiry;
    }

    public String getPassportCountry() {
        return passportCountry;
    }

    public void setPassportCountry(String passportCountry) {
        this.passportCountry = passportCountry;
    }

    public Date getPassportIssueDate() {
        return passportIssueDate;
    }

    public void setPassportIssueDate(Date passportIssueDate) {
        this.passportIssueDate = passportIssueDate;
    }

    // Increments the miles flown by the specified amount
    void addMiles(int miles) {
        milesFlown += miles;
    }

    // Prints the passenger information
    public String toString() {
        return "Passenger Information: \n" +
                "[Title = " + title + "]\n" +
                "[First Name = " + firstName + "]\n" +
                "[Last Name = " + lastName + "]\n" +
                "[Date of Birth = " + dob + "]\n" +
                "[Mobile Number = " + mobileNumber + "]\n" +
                "[Frequent Flyer Number = " + frequentFlyerNumber + "]\n" +
                "[Miles Flown = " + milesFlown + "]\n" +
                "[Nationality] = " + nationality + "]\n" +
                "[Passport Number = " + passportNumber + "]\n" +
                "[Passport Expiry = " + passportExpiry + "]\n" +
                "[Passport Country = " + passportCountry + "]\n" +
                "[Passport Issue Date = " + passportIssueDate + "]\n";
    }
}
