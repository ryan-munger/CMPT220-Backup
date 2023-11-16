public class TestCircle {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(5);
            Circle c2 = new Circle(-2);
        } catch (NegativeRadiusException e) {
            System.out.println("Error! " + e.getMessage() + " " + e.getRadius());
        }
    }
}
