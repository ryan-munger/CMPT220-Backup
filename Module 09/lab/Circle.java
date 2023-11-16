public class Circle extends GeometricObject implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

    @Override
    public int compareTo(Circle o) {
        if (radius < (o.radius))
            return -1;
        else if (radius > (o.radius))
            return 1;
        return 0;
    }

}
