public class Square extends GeometricObject {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return super.toString() + " Square [side=" + side + "]";
    }

}