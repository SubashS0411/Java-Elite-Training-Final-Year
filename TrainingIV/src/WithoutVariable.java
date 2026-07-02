import java.util.Scanner;
public class WithoutVariable {
    static int  a=10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = 20;
        int b = 30;
        s = s + b;
        b = s - b;
        s = s - b;
        System.out.println("firtstvariable: " + s);
        System.out.println("secondvariable: " + b);
    }
}
//get 2 value from user and sum and print it
//find avg of 3 numbers
//Principal,n,rate/100
//Area of circle