package OOPHomework7.Calculator.Model;

/**
 * Класс задающий поведение комплексного числа
 */
public class NumberComplex {
    double real;
    double imaginary;

    public NumberComplex(double real, double imaginary) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + (imaginary > 0 ? "+" : "-") + Math.abs(imaginary) + "i";
    }
}
