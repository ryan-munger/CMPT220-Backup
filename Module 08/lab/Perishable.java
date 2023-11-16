import java.util.Date;

public class Perishable extends Food {
    private Date expirationDate;

    public Perishable(String container, Date expirationDate) {
        super(container);
        this.expirationDate = expirationDate;
    }

    public Perishable(String id, String name, String container, Date expirationDate) {
        super(id, name, container);
        this.expirationDate = expirationDate;
    }

    public Perishable(String id, String name, double price, Location location, String container, Date expirationDate) {
        super(id, name, price, location, container);
        this.expirationDate = expirationDate;
    }

    public Perishable(String id, String name, double price, Location location, int stock, String container,
            Date expirationDate) {
        super(id, name, price, location, stock, container);
        this.expirationDate = expirationDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "Perishable [expirationDate=" + expirationDate + "]";
    }

}
