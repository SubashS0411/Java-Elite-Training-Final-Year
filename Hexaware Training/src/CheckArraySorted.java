import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=s.nextInt();
        }
        if(sorted(arr)) System.out.println("Sorted");
        else System.out.println("Not Sorted");
    }
    public static boolean sorted(int[] arr){
        if(arr.length<=1) return true;
        for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i+1]){
                    return false;
                }
            }

        return true;
    }
}
