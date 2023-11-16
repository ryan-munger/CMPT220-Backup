import java.util.Date;

public class Test {
    public static void main(String args[]) {
        Doctor doc = new Doctor("John", "Doc", "General Practice");
        Patient pat = new Patient("Jane", "Doe", "1001", 23, new Date(2000, 2, 12), doc, new Date(), new Date());
        Bill bill = new Bill(pat);

        bill.setDoctorsFee(15000);
        bill.setHospitalCharges(25000.);
        bill.setPharmacyCharges(500.45);

        System.out.println(bill);
    }
}
