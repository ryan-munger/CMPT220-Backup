public class Circle extends Shape2D {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        this.radius = radius;
        this.setColor(color);
        this.setFilled(filled);
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

    public double getPerimeter() {
        return Math.PI * 2 * radius;
    }

    public String toString() {
        return ("Circle with properties: " +
                super.toString() +
                "[Radius: " + radius + "]" +
                "[Area: " + getArea() + "]" +
                "[Circumference: " + getPerimeter() + "]");
    }
}
