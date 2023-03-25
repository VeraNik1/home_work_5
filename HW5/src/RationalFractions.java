package src;

public class RationalFractions extends GeneralNumber{

    public RationalFractions(long numerator, long denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }


    public String toString(){
        if (this.getNumerator() == 0) return "0";
        if(Math.abs(this.getNumerator()) >= Math.abs(this.getDenominator())){
            long intPart = this.getNumerator() / this.getDenominator();
            if(this.getNumerator()*this.getDenominator()<0){
                return "Integer part -"+intPart+"  rational part "
                        +(this.getNumerator() - this.getDenominator() *intPart)+"/"+ this.getDenominator();
            }
            return "Integer part "+intPart+"  rational part "
                    +(this.getNumerator() - this.getDenominator() *intPart)+"/"+ this.getDenominator();
        }
        return this.getNumerator() +"/"+ this.getDenominator();
    }


    public int intValue() {

        return (int)(getNumerator() / getDenominator());
    }

    public long longValue() {

        return getNumerator() / getDenominator();
    }

    public float floatValue() {

        return (float) getNumerator() / getDenominator();
    }

    public double doubleValue() {

        return (double) getNumerator() / getDenominator();
    }




}

