public class Square extends GeometricObject {
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String toString() {
        return "Square [width=" + width + "]";
    }

}
