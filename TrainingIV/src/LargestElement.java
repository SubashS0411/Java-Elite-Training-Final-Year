import java.util.Arrays;
import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int[] arr=new int[n];
        int largest=Integer.MIN_VALUE;
//        or int largest=arr[0];
        System.out.println("Enter the number of the Array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
//            if(arr[i]>largest){
//                largest=arr[i];
//            }
        }
        System.out.println("Largest Element: "+Maxelement(arr));
        System.out.println("Minimum Element: "+MinElement(arr));
        System.out.println(Arrays.toString(Arra()));

    }
    public static int Maxelement (int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int MinElement(int[] arr){
        int min=arr[0];
        for(int i:arr){
            if(i<min){
                min=i;
            }
        }
        return min;
    }
    public static int[] Arra(){
        int[] arr=new int[10];
        Arrays.fill(arr,90);
        return arr;
    }
}
