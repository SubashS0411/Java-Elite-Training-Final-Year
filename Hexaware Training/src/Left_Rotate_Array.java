import java.util.Arrays;
import java.util.Scanner;

public class Left_Rotate_Array {
    public static void main(String[] args) {
//        int[] arr={1 ,2 ,3 ,4 ,5};
//        int k=2;
        Scanner s=new Scanner(System.in);
        int len=s.nextInt();
        int k=s.nextInt();
        k%=10;
        int[] arr=new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=s.nextInt();
        }
        rev(arr,0,k-1);
        rev(arr,k,len-1);
        rev(arr,0,len-1);
        for (int n:arr){
            System.out.print(n+" ");
        }
    }
    public static void rev(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }

}
