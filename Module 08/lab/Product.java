public class Product {
    private String id;
    private String name;
    private double price;
    private Location location;
    private int stock;

    public Product() {
    }

    public Product(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Product(String id, String name, double price, Location location) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public Product(String id, String name, double price, Location location, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", location=" + location + "]";
    }

}

class Location {
    String aisle;
    String rack;
    String shelf;

    public Location(String aisle, String rack, String shelf) {
        this.aisle = aisle;
        this.rack = rack;
        this.shelf = shelf;
    }

    @Override
    public String toString() {
        return "Location [aisle=" + aisle + ", rack=" + rack + ", shelf=" + shelf + "]";
    }
}