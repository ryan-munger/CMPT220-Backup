public class Food extends Product {
    private String container;

    public Food(String container) {
        this.container = container;
    }

    public Food(String id, String name, String container) {
        super(id, name);
        this.container = container;
    }

    public Food(String id, String name, double price, Location location, String container) {
        super(id, name, price, location);
        this.container = container;
    }

    public Food(String id, String name, double price, Location location, int stock, String container) {
        super(id, name, price, location, stock);
        this.container = container;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Override
    public String toString() {
        return super.toString() + "Food [container=" + container + "]";
    }

}
