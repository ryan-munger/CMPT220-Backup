public abstract class GeometricObject {
    String color;

    public GeometricObject() {

    }

    public GeometricObject(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "GeometricObject [color=" + color + "]";
    }

}