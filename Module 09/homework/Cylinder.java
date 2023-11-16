public class Cylinder extends Shape3D {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    public Cylinder(double height, double radius, String color, Boolean filled) {
        super(color, filled);
        this.height = height;
        this.radius = radius;
    }

    public double getSurfaceArea() {
        return 2. * Math.PI * radius * (height + radius);
    }

    public double getVolume() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return ("Cylinder with properties: " +
                "[Radius: " + radius + "] " +
                "[Height: " + height + "] " +
                "[Area: " + getSurfaceArea() + "] " +
                "[Volume: " + getVolume() + "]");
    }
}
