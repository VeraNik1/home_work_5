package src;

public class RationalNumber extends GeneralNumber {

    public RationalNumber(Double real)
    {
        this.setReal(real);
    }

    @Override
    public String toString(){

        return String.valueOf(this.getReal());
    }

}
