public class Cube extends Shape3D {

    private double width;

    public Cube(double width) {
        this.width = width;
    }

    public Cube(double width, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
    }

    public double getSurfaceArea() {
        return 6 * width * width;
    }

    public double getVolume() {
        return Math.pow(width, 3);
    }

    public String toString() {
        return ("Cube with properties: " +
                "[Width: " + width + "] " +
                "[Area: " + getSurfaceArea() + "] " +
                "[Volume: " + getVolume() + "]");
    }
}
