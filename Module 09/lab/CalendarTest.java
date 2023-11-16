import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar now = new GregorianCalendar();
        System.out.println(now);
        Calendar now2 = Calendar.getInstance();
        System.out.println(now2);
        Date now3 = new Date();
        System.out.println(now3);
        Calendar now4 = new GregorianCalendar(2023, 3, 3);
        System.out.println(now4.getTime());
    }
}
