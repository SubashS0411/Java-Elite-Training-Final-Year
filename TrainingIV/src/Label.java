import java.util.Scanner;

public class Label {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details-Placement Label");
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your Roll no: ");
        sc.nextLine();
        String roll = sc.nextLine();
        System.out.println("Enter your Dept");
        String dept = sc.nextLine();
        System.out.println("Enter your College name: ");
        String college = sc.nextLine();
        System.out.println("Enter your  percentile");
        float mark = sc.nextFloat();
        System.out.println("Student Info");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("dept: "+dept);
        System.out.println("Roll No: " + roll);
        System.out.println("College Name: " + college);
        System.out.println(" mark percentile: " + mark);
    }
}
