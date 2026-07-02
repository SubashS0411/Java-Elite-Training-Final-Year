import java.util.Scanner;

public class UseForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter 5 subject numbers");
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        float sum=0;
        for(int i=0;i<5;i++){
            sum+=arr[i];
        }
        float avg=sum/5;
        System.out.println("Average is "+avg);
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
