package src;

public abstract class GeneralNumber {
    private double real;
    private double imaginary;
    private long numerator;
    private long denominator;


    public void setReal(double real) {
        this.real = real;
    }

    public void setDenominator(long denominator) {
        this.denominator = denominator;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public long getDenominator() {
        return denominator;
    }
    public double getImaginary() {
        return imaginary;
    }

    public long getNumerator() {
        return numerator;
    }

    public double getReal() {
        return real;
    }
}
