public class Book extends ABook {
    private String author;

    public Book() {
    }

    public Book(String title, int dateTaken) {
        super(title, dateTaken);
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String title, int dateTaken, String author) {
        super(title, dateTaken);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public double computeFine(int date) {
        if (daysOverdue(date) < 0)
            return 0;
        return daysOverdue(date) * .10;
    }

    @Override
    public int daysOverdue(int today) {
        return today - getDateTaken() - 14;
    }

}
