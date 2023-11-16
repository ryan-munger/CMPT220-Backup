import java.util.ArrayList;

public class TestGO {
    public static void main(String[] args) {
        ArrayList<GeometricObject> objects = new ArrayList<>();
        objects.add(new Circle(5));
        objects.add(new Square(4));
        objects.add(new Rectangle(4, 5));
        System.out.println(objects);

        for (GeometricObject go : objects) {
            System.out.println(go.getArea());
        }
    }
}