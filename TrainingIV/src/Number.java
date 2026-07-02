import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
//        check if a given number is postive or negative
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("Entered number is negative");
        }
       if(n==0){
            System.out.println("Entered number is zero");
        }
        else{
            System.out.println("Entered number is positive");
        }
    }
}
