public class Bill {
    private Patient patient;
    private double hospitalCharges;
    private double pharmacyCharges;
    private double doctorsFee;
    private double roomCharges;

    public Bill() {
    }

    public Bill(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getHospitalCharges() {
        return hospitalCharges;
    }

    public void setHospitalCharges(double hospitalCharges) {
        this.hospitalCharges = hospitalCharges;
    }

    public double getPharmacyCharges() {
        return pharmacyCharges;
    }

    public void setPharmacyCharges(double pharmacyCharges) {
        this.pharmacyCharges = pharmacyCharges;
    }

    public double getDoctorsFee() {
        return doctorsFee;
    }

    public void setDoctorsFee(double doctorsFee) {
        this.doctorsFee = doctorsFee;
    }

    public double getRoomCharges() {
        return roomCharges;
    }

    public void setRoomCharges(double roomCharges) {
        this.roomCharges = roomCharges;
    }

    @Override
    public String toString() {
        return "Bill [patient=" + patient + ", hospitalCharges=" + hospitalCharges + ", pharmacyCharges="
                + pharmacyCharges + ", doctorsFee=" + doctorsFee + ", roomCharges=" + roomCharges + "]";
    }

}
