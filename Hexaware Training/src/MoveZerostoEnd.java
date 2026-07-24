import java.util.Scanner;

public class MoveZerostoEnd {
    public static void main(String[] args) {
        int[] arr={1,2,3,0,10,24,0,8,0};
//        Scanner s=new Scanner(System.in);
//        int m=s.nextInt();
//        int[] arr=new int[m];
//        for (int i = 0; i <m ; i++) {
//            arr[i]=s.nextInt();
//        }
        moveZeros(arr);
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void moveZeros(int[] arr){
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
    }
}
