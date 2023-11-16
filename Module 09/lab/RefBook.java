public class RefBook extends ABook {

    public RefBook() {
    }

    public RefBook(String title, int dateTaken) {
        super(title, dateTaken);
    }

    @Override
    public double computeFine(int date) {
        if (daysOverdue(date) < 0)
            return 0;
        return daysOverdue(date) * .10;
    }

    @Override
    public int daysOverdue(int today) {
        return today - getDateTaken() - 2;
    }

}
