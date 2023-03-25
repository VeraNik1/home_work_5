package src;

import java.util.ArrayList;
import java.util.Scanner;

public class DialogRationalFractions implements DialogUI<RationalFractions> {
    @Override
    public RationalFractions enterOneNumber(){
        Scanner scanner = new Scanner(System.in);
    while(true){
    try{
        System.out.println("Input the numerator of the number");
        Long numerator = scanner.nextLong();
        System.out.println("Input the denominator of the number != 0");
        Long denominator = scanner.nextLong();
        if (denominator!=0) return new RationalFractions(numerator, denominator);
        else System.out.println("Denominator can't be 0, try again");
        }
    catch (Exception e) {
        System.out.println("Incorrect input, try again");
    }

        }
    }

}



