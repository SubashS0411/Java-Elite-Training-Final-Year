import java.util.Scanner;
public class AreaOfCircle {
    static double pi=3.14;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r=input.nextDouble();
        System.out.println("The area of the circle is "+(pi*r*r));
    }
}
