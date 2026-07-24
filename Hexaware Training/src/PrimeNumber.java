import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();
        if(isprime(n)){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
//        PrimeNumber p=new PrimeNumber();
//        System.out.println(p.isprime(25));
    }
    public static boolean isprime(int n){
        if (n<=1) return false;
        if(n==2)return true;
        if(n%2==0) return false;
        for (int i = 3; i <=Math.sqrt(n) ; i+=2) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}
