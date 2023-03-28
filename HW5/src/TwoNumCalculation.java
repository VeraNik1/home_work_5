package src;

public class TwoNumCalculation {
    interface  Operation<N extends GeneralNumber> {
        String execute(N x, N y);
    }

    static Operation action(Calc choiceOperand, String choice){

        switch(choice){
            case "1": return (x, y) -> new View().ShowResult(x, y, choiceOperand.add(x, y), '+');
            case "2": return (x, y) -> new View().ShowResult(x, y, choiceOperand.subtract(x, y), '-');
            case "3": return (x, y) -> new View().ShowResult(x, y, choiceOperand.multiply(x, y), '*');
            case "4": return (x, y) -> {
                if ((x.getClass().getSimpleName().equals("ComplexNumber") && (y.getReal() == 0 && y.getImaginary() == 0))
                        ||(x.getClass().getSimpleName().equals("RationalFractions") && y.getNumerator() == 0)
                        || (x.getClass().getSimpleName().equals("RationalNumber") && y.getReal() == 0))
                    return "Zero Division Error, try again";
                return new View().ShowResult(x, y, choiceOperand.divide(x, y), '/');};
            case "6": return (x, y) -> new RationalFractionsCalc().CompareTwoFractions((RationalFractions) x,
                    (RationalFractions) y);
            default: return (x, y) -> null;
        }
    }
}
