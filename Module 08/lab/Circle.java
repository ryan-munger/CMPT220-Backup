public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() + " Circle [radius=" + radius + "]";
    }

}
