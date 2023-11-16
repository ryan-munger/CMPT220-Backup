public class Other extends Product {
    private String type;

    public Other() {
    }

    public Other(String id, String name) {
        super(id, name);
    }

    public Other(String id, String name, double price, Location location) {
        super(id, name, price, location);
    }

    public Other(String id, String name, double price, Location location, int stock, String type) {
        super(id, name, price, location, stock);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "Other [type=" + type + "]";
    }

}
