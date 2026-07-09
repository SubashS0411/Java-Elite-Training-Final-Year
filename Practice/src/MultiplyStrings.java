import java.math.BigInteger;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("2","3"));
    }
    public static String multiply(String num1,String num2){
        BigInteger n1=new BigInteger(num1);
        BigInteger n2=new BigInteger(num2);
        return n1.multiply(n2).toString();
    }
}
