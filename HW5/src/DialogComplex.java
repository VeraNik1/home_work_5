package src;

import java.util.ArrayList;
import java.util.Scanner;

public class DialogComplex implements DialogUI<ComplexNumber> {

    @Override
    public ComplexNumber enterOneNumber() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Input the rational part of the number");
                Double rational = scanner.nextDouble();
                System.out.println("Input the irrational part of the number");
                Double irrational = scanner.nextDouble();
                return new ComplexNumber(rational, irrational);
            } catch (Exception e) {
                System.out.println("Incorrect input, try again");
            }
        }


    }
}



