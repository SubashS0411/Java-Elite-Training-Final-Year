import java.util.Scanner;

public class InterestCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Principal number: ");
        float p = input.nextFloat();
        System.out.println("Enter the Principal rate: ");
        float r = input.nextFloat();
        System.out.println("Enter the Principal monthly rate: ");
        float n = input.nextFloat();
        System.out.println("Enter the Principal yearly rate: "+((p*r*n)/100));
    }
}
