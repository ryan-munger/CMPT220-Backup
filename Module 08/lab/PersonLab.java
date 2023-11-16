public class PersonLab {
    private String firstName; // store the first name
    private String lastName; // store the last name
    // Default constructor

    public PersonLab() {
        firstName = "";
        lastName = "";
    }

    // Constructor with parameters
    public PersonLab(String first, String last) {
        setName(first, last);
    }

    // Method to output the first name and last name
    // in the form firstName lastName.
    public String toString() {
        return (firstName + " " + lastName);
    }

    // Method to set firstName and lastName according to
    // the parameters.
    public void setName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Method to return firstName.
    public String getFirstName() {
        return firstName;
    }

    // Method to return lastName.
    public String getLastName() {
        return lastName;
    }
}