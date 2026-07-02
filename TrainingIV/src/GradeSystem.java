import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 subject marks");
        System.out.print("Enter 1st marks");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd marks");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd marks");
        int n3 = sc.nextInt();
        System.out.print("Enter 4th marks");
        int n4 = sc.nextInt();
        System.out.print("Enter 5th marks");
        int n5 = sc.nextInt();
        float avg =(float)(n1+n2+n3+n4+n5)/5;
        System.out.println("Average marks: "+avg);
        if(n1<50 && n2<50 && n3<50 && n4<50&& n5<50){
            System.out.println("Student Fail");
        }
        else{
            if(avg>90&&avg<100){
                System.out.println("A Grade");
            } else if (80 < avg) {
                System.out.println("B Grade");
            }
            else if(70 < avg){
                System.out.println("C Grade");
            }
            else if(60 < avg){
                System.out.println("D Grade");
            }
            else if(50 < avg){
                System.out.println("E Grade");
            }
            else{
                System.out.println("Student Fail");
            }
        }
    }
}
