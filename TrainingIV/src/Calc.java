import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        System.out.println("Enter the math operation");
        char ch=sc.next().charAt(0);
        switch(ch){
            case '+':
                a=a+b;
                System.out.println("Addition: "+a);
                break;
           case '-':
                    System.out.println("Subtraction: "+(a-b));
                    break;
            case '*':
                System.out.println("Multiplication: "+(a*b));
                break;
            case '/':
                if(b==0) System.out.println("Can't divide by 0");
                else  System.out.println("Division: "+(a/b));
                break;
            case '^':
                System.out.println("Power: "+(Math.pow(a,b)));
                break;
            case '%':
                System.out.println("Module: "+(a%b));
                break;
            default:
                System.out.println("Indru poi nalai vaa");
        }
    }
}
