package src;

public class ComplexNumCalc extends GeneralNumber implements Calc<ComplexNumber> {
    @Override
    public ComplexNumber add(ComplexNumber N1, ComplexNumber N2) {

        return new ComplexNumber(N1.getReal() + N2.getReal(), N1.getImaginary() + N2.getImaginary());
    }

    @Override
    public ComplexNumber subtract(ComplexNumber N1, ComplexNumber N2) {
        return new ComplexNumber(N1.getReal() - N2.getReal(), N1.getImaginary() - N2.getImaginary());
    }

    @Override
    public ComplexNumber multiply(ComplexNumber N1, ComplexNumber N2) {
        double _real = N1.getReal() * N2.getReal() - N1.getImaginary() * N2.getImaginary();
        double _imaginary = N1.getReal() * N2.getImaginary() + N1.getImaginary() * N2.getReal();
        return new ComplexNumber(_real, _imaginary);
    }

    @Override
    public ComplexNumber divide(ComplexNumber N1, ComplexNumber N2) {

        ComplexNumber num2 = new ComplexNumber(N2.getReal(), -N2.getImaginary());
        ComplexNumber output = multiply(N1, num2);
        double div = Math.pow(N2.getReal(),2) + Math.pow(N2.getImaginary(),2);
        return new ComplexNumber(output.getReal() / div, output.getImaginary() / div);
    }

 @Override
    public ComplexNumber pow(ComplexNumber N, int power) {
        {
            ComplexNumber output = new ComplexNumber(N.getReal(), N.getImaginary());
            for (int i = 1; i < power; i++) {
                ComplexNumber temp = multiply(output, N);
                double _real = temp.getReal();
                double _imaginary = temp.getImaginary();;
                output = new ComplexNumber(_real, _imaginary);
            }
            return output;
        }

    }
}
