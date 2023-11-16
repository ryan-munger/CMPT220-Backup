public class Problem1 {
    public static void main(String[] args) {
    Shape[] shapes = new Shape[3];
    shapes[0] = new Circle(1.0, "red", true);
    shapes[1] = new Square(2.0, "blue", false);
    shapes[2] = new Square(3.0, "green", true);
    for (Shape shape : shapes) {
        System.out.println(shape);
    }
    }
}
    