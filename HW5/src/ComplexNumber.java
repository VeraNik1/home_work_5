package src;

public class ComplexNumber extends GeneralNumber {


    /**
     * Constructs a new <code>ComplexNumber</code> object.
     * @param real the real part of the complex number
     * @param imaginary the imaginary part of the complex number
     */
    public ComplexNumber(double real, double imaginary)
    {
        this.setReal(real);
        this.setImaginary(imaginary);
    }

    @Override
    public final boolean equals(Object z)
    {
        if (!(z instanceof ComplexNumber))
            return false;
        ComplexNumber a = (ComplexNumber) z;
        return (((ComplexNumber) z).getReal() == a.getReal()) && (((ComplexNumber) z).getImaginary() == a.getImaginary());
    }

    @Override
    public String toString()
    {
        String re =  this.getReal()+"";
        String im = "";
        if(this.getImaginary() < 0)
            im =  this.getImaginary()+"i";
        else if (this.getImaginary() > 0) {
            im = "+"+this.getImaginary()+"i";
        }
        if(this.getReal() != 0){
            return re+im;
        }
        else if(this.getImaginary() !=0 ) return im;

        return "0";
    }



}
