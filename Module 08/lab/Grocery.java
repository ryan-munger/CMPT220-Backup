import java.util.ArrayList;
import java.util.Date;

public class Grocery {
    public static void main(String args[]) {
        ArrayList<Product> inventory = new ArrayList<>();

        // Add products
        inventory.add(
                new Perishable("1001", "Milk 2%", 2.50, null, 25, "Half Gallon Plastic Jug", new Date(123, 4, 15)));
        inventory.add(new Other("1002", "Broom", 9.50, null, 25, "Cleaning Supplies"));

        System.out.println(inventory);
    }
}
