package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


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

        HashMap<String, Calc> calculation = new HashMap<>();
        calculation.put("1", new ComplexNumCalc());
        calculation.put("2", new RationalFractionsCalc());
        calculation.put("3", new RationalNumCalc());


        Scanner calcScanner = new Scanner(System.in);
        boolean exit;
        exit = false;
        while (!exit) {
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
            System.out.println("0. Tap for exit");
            System.out.println();
            // reading of the user's input
            String choiceCom = calcScanner.next();

            switch (choiceCom) {
                case "1":
                    numbers = dialogs.get(choiceNum).InputTwoNum();
                    result = new View().ShowResult(numbers.get(0), numbers.get(1),
                            calculation.get(choiceNum).add(numbers.get(0), numbers.get(1)), '+');
                    LoggerCalc.LOGGER.info(result);
                    System.out.println(result);

                    break;
                case "2":
                    numbers = dialogs.get(choiceNum).InputTwoNum();
                    result = new View().ShowResult(numbers.get(0), numbers.get(1),
                            calculation.get(choiceNum).subtract(numbers.get(0), numbers.get(1)), '-');
                    LoggerCalc.LOGGER.info(result);
                    System.out.println(result);
                    break;
                case "3":

                    numbers = dialogs.get(choiceNum).InputTwoNum();
                    result = new View().ShowResult(numbers.get(0), numbers.get(1),
                            calculation.get(choiceNum).multiply(numbers.get(0), numbers.get(1)), '*');
                    LoggerCalc.LOGGER.info(result);
                    System.out.println(result);

                    break;
                case "4":

                    numbers = dialogs.get(choiceNum).InputTwoNum();
                    if ((choiceNum.equals("1") && numbers.get(1).getReal() == 0 && numbers.get(1).getImaginary() == 0)
                            || (choiceNum.equals("2") && numbers.get(1).getNumerator() == 0) ||
                            (choiceNum.equals("3") && (numbers.get(1).getReal() == 0))) {
                        result = "Zero Division Error, try again";
                        System.out.println(result);
                    } else {
                        result = new View().ShowResult(numbers.get(0), numbers.get(1),
                                calculation.get(choiceNum).divide(numbers.get(0), numbers.get(1)), '/');
                        System.out.println(result);
                    }
                    LoggerCalc.LOGGER.info(result);
                    break;
                case "5":
                    int n = dialogs.get(choiceNum).inputNaturalPow();
                    System.out.println("Input the number");
                    N number = (N) dialogs.get(choiceNum).enterOneNumber();
                    result = new View().ShowPow(number, calculation.get(choiceNum).pow(number, n), n);

                    System.out.println(result);
                    LoggerCalc.LOGGER.info(result);
                    break;

                case "6":
                    if (choiceNum.equals("2")) {
                        ArrayList<RationalFractions> fractions = dialogs.get(choiceNum).InputTwoNum();
                        result = new RationalFractionsCalc().CompareTwoFractions(fractions.get(0), fractions.get(1));
                        System.out.println(result);
                        LoggerCalc.LOGGER.info(result);
                    } else System.out.println("Incorrect input. Please, try again.");
                    break;
                case "0":
                    exit = true;
                    break;
                default:
                    System.out.println("Incorrect input. Please, try again.");
                    LoggerCalc.LOGGER.info("Incorrect choice in the calculator menu");
                    break;
            }

        }

    }

}




