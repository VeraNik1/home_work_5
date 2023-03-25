package src;

import org.jetbrains.annotations.NotNull;


public class View <N>{



    public String ShowResult(N N1, N N2, N Result, @NotNull Character operand){
    String result = "(" + N1 + ")" + operand + "(" + N2 + ")" + " = " + Result;
    return result;
}

    public String ShowPow(N N1, N Result, int n){
        String result;
        result = "(" + N1 + ")" + " ^ " + n + " = " + Result;
        return result;
    }

}
