import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // user input
        System.out.print("Enter the first coordinate point: ");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();
        Complex first = new Complex(x1, y1);

        System.out.print("Enter the second coordinate point: ");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();
        Complex second = new Complex(x2, y2);

        System.out.print("Enter the third coordinate point: ");
        double x3 = scan.nextDouble();
        double y3 = scan.nextDouble();
        Complex third = new Complex(x3, y3);
        scan.close();

        // Find the determinant of the matrix
        Complex determinant = determinant(first, second, third);
        // multiply it by i/4 (divide it by 4 and put the i in the string result)
        // the unicode character is superscript 2
        System.out.println("Area of the noncollinear points in the complex space [(" + first.toString() + "), ("
                + second.toString() + "), (" + third.toString() + ")] is " + "["
                + (determinant.getRealPart() / 4) + "i + "
                + (determinant.getImaginaryPart() / 4) + "i\u00B2]");
    }

    // 3x3 matrix determinant = aei + bfg + cdh - ceg - bdi - afh
    // c,f,i are all equal to 1 in this case
    public static Complex determinant(Complex z1, Complex z2, Complex z3) {
        // create variables to store the conjugates of the points (opposite sign)
        Complex zBar1 = new Complex(-z1.getRealPart(), -z1.getImaginaryPart());
        Complex zBar2 = new Complex(-z2.getRealPart(), -z2.getImaginaryPart());
        Complex zBar3 = new Complex(-z3.getRealPart(), -z3.getImaginaryPart());
        // create complex variables to abstract the calcualtion
        Complex aei = Complex.multiply(z1, zBar2);
        Complex bfg = Complex.multiply(zBar1, z3);
        Complex cdh = Complex.multiply(z2, zBar3);
        Complex ceg = Complex.multiply(zBar2, z3);
        Complex bdi = Complex.multiply(zBar1, z2);
        Complex afh = Complex.multiply(z1, zBar3);
        // calculate and return
        Complex add = Complex.add(Complex.add(aei, bfg), cdh);
        Complex subtract = Complex.subtract(Complex.subtract(ceg, bdi), afh);
        return Complex.subtract(add, subtract);
    }
}
