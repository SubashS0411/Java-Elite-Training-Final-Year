import java.math.BigInteger;

public class RecFact {
    public static void main(String[] args) {
        System.out.println( fact(10101));
    }
    public static BigInteger fact(int n){
        if(n==1) return BigInteger.ONE;
        BigInteger current=BigInteger.valueOf(n);
        return current.multiply(fact(n-1));
    }
}
