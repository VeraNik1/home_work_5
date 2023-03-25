package src;

import java.util.ArrayList;
import java.util.Scanner;

public interface DialogUI<N> {

    default N enterOneNumber(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Input the the number");
                N rational = (N) scanner.next();
                return rational;
            }
            catch (Exception e) {
                System.out.println("Incorrect input, try again");
            }
        }
    }
    default ArrayList<N> InputTwoNum(){
        ArrayList<N> result = new ArrayList<>();
        System.out.println("Input the first number");
        N n1 = enterOneNumber();
        System.out.println("Input the second number");
        N n2 = enterOneNumber();
        result.add(n1);
        result.add(n2);
        return result;}

    default int inputNaturalPow(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Input the natural pow for the number");
                int power = scanner.nextInt();
                if(power > 0) return power;
                System.out.println("Incorrect input, you must enter the integer number > 0");
            }
            catch (Exception e) {
                System.out.println("Incorrect input, try again");
            }
        }
    }
}
