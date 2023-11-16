public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return width * height;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }

}
