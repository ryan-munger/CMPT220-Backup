public class Square extends Shape2D {
    private double width;

    public Square() {
    }

    public Square(double width) {
        this.width = width;
    }

    public Square(double width, String color, Boolean filled) {
        this.width = width;
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width + width;
    }

    public double getPerimeter() {
        return width * 4;
    }

    public String toString() {
        return ("Square with properties: " +
                super.toString() +
                "[Width: " + width + "]" +
                "[Area: " + getArea() + "]" +
                "[Perimeter: " + getPerimeter() + "]");
    }
}
