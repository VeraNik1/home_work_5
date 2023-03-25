package src;

import java.util.ArrayList;
import java.util.Scanner;

public class DialogRationalNumbers implements DialogUI<RationalNumber> {
    @Override
    public RationalNumber enterOneNumber(){
    Scanner scannerNum = new Scanner(System.in);
    while(true){
    try{
        String num = scannerNum.next().replace(",", ".");
        RationalNumber number = new RationalNumber(Double.parseDouble(num));
        return number;
        }
    catch (Exception e) {
        System.out.println("Incorrect input, try again");
        }
        }
    }
@Override
    public ArrayList<RationalNumber> InputTwoNum(){
        ArrayList<RationalNumber> result = new ArrayList<>();
        System.out.println("Input the first number");
        RationalNumber n1 = enterOneNumber();
        System.out.println("Input the second number");
        RationalNumber n2 = enterOneNumber();
        result.add(n1);
        result.add(n2);
        return result;}

}



