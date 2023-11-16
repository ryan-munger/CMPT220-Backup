public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) throws NegativeRadiusException {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) throws NegativeRadiusException {
        if (radius < 0)
            throw new NegativeRadiusException("Negative radius", radius);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + "]";
    }

}

class NegativeRadiusException extends RuntimeException {
    private double radius;

    public NegativeRadiusException(double radius) {
        this.radius = radius;
    }

    public NegativeRadiusException(String message, double radius) {
        super(message);
        this.radius = radius;
    }

    public NegativeRadiusException(Throwable cause, double radius) {
        super(cause);
        this.radius = radius;
    }

    public NegativeRadiusException(String message, Throwable cause, double radius) {
        super(message, cause);
        this.radius = radius;
    }

    public NegativeRadiusException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace, double radius) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
