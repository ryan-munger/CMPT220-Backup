public class Cube extends Square {

    public Cube(double width) {
        super(width);
    }

    public Cube(double width, String color, Boolean filled) {
        super(width, color, filled);
    }

    public double area() {
        return 6 * this.getWidth() * this.getWidth();
    }

    public double volume() {
        return Math.pow(this.getWidth(), 3);
    }

    public String toString() {
        return ("Cube with properties: " +
                super.toString() +
                "[Area: " + area() + "]" +
                "[Volume: " + volume() + "]");
    }
}
