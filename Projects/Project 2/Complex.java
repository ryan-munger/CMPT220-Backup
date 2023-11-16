public class Complex extends Number implements Cloneable, Comparable<Complex> {
    private double a;
    private double b;

    public Complex() {
        this.a = 0;
        this.b = 0;
    }

    public Complex(double a) {
        this.a = a;
        this.b = 0;
    }

    public Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double doubleValue() {
        return this.abs();
    }

    @Override
    public float floatValue() {
        return this.abs().floatValue();
    }

    @Override
    public int intValue() {
        return this.abs().intValue();
    }

    @Override
    public long longValue() {
        return Math.round(this.abs());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Complex clone = new Complex(this.a, this.b);
        return clone;
    }

    @Override
    public int compareTo(Complex o) {
        if ((this.a == o.getRealPart()) && this.b == o.getImaginaryPart())
            return 0;
        else if((this.a < o.getRealPart()) || (this.a == o.getRealPart() && this.b < o.getImaginaryPart()))
            return -1;
        return 1;
    }

    public double getRealPart() {
        return a;
    }

    public double getImaginaryPart() {
        return b;
    }

    // Adds two complex nums
    // a + bi + c + di = (a + c) + (b + d)i
    public static Complex add(Complex first, Complex second) {
        Complex out = new Complex((first.getRealPart() + second.getRealPart()),
                (first.getImaginaryPart() + second.getImaginaryPart()));
        return out;
    }

    // subtracts 2 complex nums
    // a + bi − (c + di) = (a − c) + (b − d)i
    public static Complex subtract(Complex first, Complex second) {
        Complex out = new Complex((first.getRealPart() - second.getRealPart()),
                (first.getImaginaryPart() - second.getImaginaryPart()));
        return out;
    }

    // multplies 2 complex nums
    // (a + bi) ∗ (c + di) = (ac − bd) + (bc + ad)i
    public static Complex multiply(Complex first, Complex second) {
        Complex out = new Complex(
                (first.getRealPart() * second.getRealPart()) - (first.getImaginaryPart() * second.getImaginaryPart()),
                ((first.getImaginaryPart() * second.getRealPart())
                        + (first.getRealPart() * second.getImaginaryPart())));
        return out;
    }

    // divides 2 complex nums
    // (a + bi)/(c + di) = (ac + bd)/(c^2 + d^2) + (bc − ad)i/(c^2 + d^2)
    public static Complex divide(Complex first, Complex second) {
        Complex out = new Complex(
                (((first.getRealPart() * second.getRealPart()) + (first.getImaginaryPart() * second.getImaginaryPart()))
                        /
                        ((second.getRealPart() * second.getRealPart())
                                + (second.getImaginaryPart() * second.getImaginaryPart()))),
                ((first.getImaginaryPart() * second.getRealPart()) - (first.getRealPart() * second.getImaginaryPart()))
                        /
                        ((second.getRealPart() * second.getRealPart())
                                + (second.getImaginaryPart() * second.getImaginaryPart())));
        return out;
    }

    // absolute value of a complex num
    // |a + bi| = sqrt(a^2 + b^2)
    public Double abs() {
        return Math.sqrt((a * a) + (b * b));
    }

    @Override
    public String toString() {
        if (b == 0)
            return "" + a;
        return a + " + " + b + "i";
    }

}