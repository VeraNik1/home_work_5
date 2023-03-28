package src;

import jdk.dynalink.Operation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.function.Predicate;

import static src.TwoNumCalculation.action;


public class MenuCalc {
    public static <N extends GeneralNumber> void menuCalc(String choiceNum, LoggerCalc logger) {
        HashMap<String, String> choices = new HashMap<>();
        choices.put("1", "complex");
        choices.put("2", "rational fraction");
        choices.put("3", "rational");
        HashMap<String, DialogUI> dialogs = new HashMap<>();
        dialogs.put("1", new DialogComplex());
        dialogs.put("2", new DialogRationalFractions());
        dialogs.put("3", new DialogRationalNumbers());
        Scanner calcScanner = new Scanner(System.in);
        HashMap<String, Calc> calculation = new HashMap<>();
        calculation.put("1", new ComplexNumCalc());
        calculation.put("2", new RationalFractionsCalc());
        calculation.put("3", new RationalNumCalc());
        while (true) {
            String result;
            ArrayList<N> numbers;

            System.out.println("Please, choose what you want to calculate");
            System.out.printf("1. Find sum of two %s numbers\n", choices.get(choiceNum));
            System.out.printf("2. Find subtraction of two %s numbers\n", choices.get(choiceNum));
            System.out.printf("3. Multiply two %s numbers\n", choices.get(choiceNum));
            System.out.printf("4. Divide two %s numbers\n", choices.get(choiceNum));
            System.out.printf("5. Raise the %s number to a natural power\n", choices.get(choiceNum));
            if (choiceNum.equals("2")) {
                System.out.println("6. Compare two rational fractions");
            }
            System.out.println("0. Tap for exit to the main menu");
            System.out.println();
            // reading of the user's input
            String choiceCom = calcScanner.next();

            if (choiceCom.equals("0")){
                return;
            }
            else if (choiceCom.equals("5")) {
                    int n = dialogs.get(choiceNum).inputNaturalPow();
                    System.out.println("Input the number");
                    N number = (N) dialogs.get(choiceNum).enterOneNumber();
                    result = new View().ShowPow(number, calculation.get(choiceNum).pow(number, n), n);}
            else if (choiceCom.equals("6") && !choiceNum.equals("2")) {
                result = "Incorrect input. Please, try again.";
            } else if(choiceCom.equals("1")||choiceCom.equals("2")||choiceCom.equals("3")||choiceCom.equals("4")
            ||choiceCom.equals("6")) {
                TwoNumCalculation.Operation<N> func = (TwoNumCalculation.Operation<N>) action(calculation.get(choiceNum), choiceCom);
                numbers = dialogs.get(choiceNum).InputTwoNum();
                result = ((TwoNumCalculation.Operation<N>) func).execute(numbers.get(0), numbers.get(1));
                }
            else result = "Incorrect input. Please, try again.";
            logger.LOGGER.info(result);
            System.out.println(result);
        }
    }

}




