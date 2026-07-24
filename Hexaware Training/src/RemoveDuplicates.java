import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
//        int[] arr={1, 1, 2, 2, 3, 4, 4, 5};
//        {1,2,3,4,5,4,4,5}
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int unique=duplicates(arr);
        for (int i = 0; i <unique; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static int duplicates(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }
}
