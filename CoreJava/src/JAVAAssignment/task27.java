//

package JAVAAssignment;

class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void printComplex() {
        System.out.println("Complex Number: " + real + " + " + imaginary + "i");
    }

    static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.real + c2.real, c1.imaginary + c2.imaginary);
    }

    static Complex subtract(Complex c1, Complex c2) {
        return new Complex(c1.real - c2.real, c1.imaginary - c2.imaginary);
    }

    static Complex multiply(Complex c1, Complex c2) {
        double realPart = c1.real * c2.real - c1.imaginary * c2.imaginary;
        double imaginaryPart = c1.real * c2.imaginary + c1.imaginary * c2.real;
        return new Complex(realPart, imaginaryPart);
    }
}

public class task27 {
    public static void main(String[] args) {
        Complex complex1 = new Complex(2, 3);
        Complex complex2 = new Complex(1, -2);

        Complex sum = Complex.add(complex1, complex2);
        Complex difference = Complex.subtract(complex1, complex2);
        Complex product = Complex.multiply(complex1, complex2);

        sum.printComplex();
        difference.printComplex();
        product.printComplex();
    }
}
