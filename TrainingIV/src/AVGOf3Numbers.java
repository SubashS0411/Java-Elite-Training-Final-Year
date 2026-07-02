import java.util.Scanner;

public class AVGOf3Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = input.nextInt();
        System.out.println("Enter the second number: ");
        int b = input.nextInt();
        System.out.println("Enter the third number: ");
        int c = input.nextInt();
        System.out.println("The average of the numbers is: "+(float)(a+b+c)/3);
    }
}
