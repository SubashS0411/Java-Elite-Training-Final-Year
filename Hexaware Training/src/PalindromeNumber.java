import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
//        int m=Integer.MIN_VALUE
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(Palindrome(n)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
        System.out.println(optimized(n));
    }
    public static boolean Palindrome(int n){
        int original=n;
        int rev=0;
        while(n>0){
            rev=(rev*10)+(n%10);
            n/=10;
        }
//        System.out.println(rev+" "+original);
        return rev==original;
    }
    public static boolean optimized(int n){
        if(n<0 ||(n!=0 && n%10==0)) return false;
        int rev=0;
        while(n>rev){
            rev=(rev*10)+(n%10);
            n/=10;
        }
        return (n==rev) || (n==rev/10);
    }
}
