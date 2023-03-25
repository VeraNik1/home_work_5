package src;

public interface Calc<N> {
    /** sum of numbers
     *
     * **/
    default N add(N n1, N n2){
        return null;
    }

    /** difference between numbers n1 and n2
     *
     * **/
    default N subtract(N n1, N n2){
        return null;
    }

    /** product meaning of n1 and n2
     *
     * **/
    default N multiply(N n1, N n2){
        return null;
    }
    /** result of division n1 and n2 (n1/n2)
     *
     * **/
    default N divide(N n1, N n2){
        return null;
    }

    /**  raising the number n to a natural power
     *
     * **/
    default N pow(N n, int power){
        return null;
    }

}
