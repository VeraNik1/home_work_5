package src;

public class RationalNumCalc extends GeneralNumber implements Calc<RationalNumber> {

    @Override
    public RationalNumber add(RationalNumber N1, RationalNumber N2) {
        Double n1 = N1.getReal();
        Double n2 = N2.getReal();
        return new RationalNumber(n1 + n2);
    }
    @Override
    public RationalNumber subtract(RationalNumber N1, RationalNumber N2) {
        Double n1 = N1.getReal();
        Double n2 = N2.getReal();
        return new RationalNumber(n1 - n2);
    }
    @Override
    public RationalNumber multiply(RationalNumber N1, RationalNumber N2) {
        Double n1 = N1.getReal();
        Double n2 = N2.getReal();
        return new RationalNumber(n1 * n2);
    }
    @Override
    public RationalNumber divide(RationalNumber N1, RationalNumber N2) {
        Double n1 = N1.getReal();
        Double n2 = N2.getReal();
        return new RationalNumber(n1 / n2);
    }

    @Override
    public RationalNumber pow(RationalNumber N, int power) {
        Double n = N.getReal();
        {
        if (power == 1) return N;
        return multiply(N, new RationalNumber(Math.pow(n, power-1)));
        }
    }
}
