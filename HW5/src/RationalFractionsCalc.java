package src;

public class RationalFractionsCalc extends GeneralNumber implements Calc<RationalFractions> {

    //greatest common divisor
    private long gcd(long n,long d){
        long temp=1;
        if (n<d){
            temp=n;
            n=d;
            d=temp;
        }
        while(temp!=0) {
            temp=n%d;
            n=d;
            d=temp;
        }
        return n;
    }
    private RationalFractions makeTrueRational(RationalFractions r){
        long gcd=gcd(r.getNumerator(),r.getDenominator());
        long numerator1=r.getNumerator()/gcd;
        long denominator1=r.getDenominator()/gcd;
        return new RationalFractions(numerator1, denominator1);
    }

    @Override
    public RationalFractions add(RationalFractions N1, RationalFractions N2){
        long numerator1 = N1.getNumerator();
        long numerator2 = N2.getNumerator();
        long denominator1 = N1.getDenominator();
        long denominator2 = N2.getDenominator();
        long numRes;
        long denRes;
        numerator1*=denominator2;
        numerator2*=denominator1;
        numRes = numerator1 + numerator2;
        denRes = (denominator1 * denominator2);
        RationalFractions result = makeTrueRational(new RationalFractions(numRes, denRes));
        return result;}
    @Override
    public RationalFractions subtract(RationalFractions N1, RationalFractions N2){
        long numerator1 = N1.getNumerator();
        long numerator2 = N2.getNumerator();
        long denominator1 = N1.getDenominator();
        long denominator2 = N2.getDenominator();
        long numRes;
        long denRes;
        numerator1*=denominator2;
        numerator2*=denominator1;
        numRes = numerator1 - numerator2;
        denRes = (denominator1 * denominator2);
        RationalFractions result = makeTrueRational(new RationalFractions(numRes, denRes));
        return result;}

    @Override
    public RationalFractions multiply(RationalFractions N1, RationalFractions N2){
        long numerator1 = N1.getNumerator();
        long numerator2 = N2.getNumerator();
        long denominator1 = N1.getDenominator();
        long denominator2 = N2.getDenominator();
        long numRes;
        long denRes;
        numRes = numerator1*numerator2;
        denRes = denominator1*denominator2;
        RationalFractions result = makeTrueRational(new RationalFractions(numRes, denRes));
        return result;}


    @Override
    public RationalFractions divide(RationalFractions N1, RationalFractions N2){
        long numerator1 = N1.getNumerator();
        long numerator2 = N2.getNumerator();
        long denominator1 = N1.getDenominator();
        long denominator2 = N2.getDenominator();
        long numRes;
        long denRes;
        numRes = numerator1*denominator2;
        denRes = denominator1*numerator2;
        RationalFractions result = makeTrueRational(new RationalFractions(numRes, denRes));
        return result;}

    public RationalFractions pow(RationalFractions N, int power) {
        long nom = N.getNumerator();
        long den = N.getDenominator();
        {
            if (power == 1) return N;
            return multiply(N, pow(N, power-1));
        }
    }


    public String CompareTwoFractions(RationalFractions N1, RationalFractions N2){
        if(N1.doubleValue() > N2.doubleValue()){
            return N1 + " > " + N2;
        } else if (N1.doubleValue() < N2.doubleValue()) {
            return N1 + " < " + N2;
        }
        else {
            return N1 + " = " + N2;
        }
    }


}
