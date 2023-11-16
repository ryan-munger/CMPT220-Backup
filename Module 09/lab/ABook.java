public abstract class ABook {
    private String title;
    private int dateTaken;

    public ABook() {
    }

    public ABook(String title, int dateTaken) {
        this.title = title;
        this.dateTaken = dateTaken;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(int dateTaken) {
        this.dateTaken = dateTaken;
    }

    public abstract int daysOverdue(int today);

    public boolean isOverdue() {
        int today = (int) (System.currentTimeMillis() / (1000 * 60 * 60 * 24));
        today -= (31 * 365);
        if (daysOverdue(today) > 0) {
            return true;
        }
        return false;
    }

    public abstract double computeFine(int date);

}
