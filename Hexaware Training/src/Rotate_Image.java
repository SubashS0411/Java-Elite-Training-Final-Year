import java.util.Arrays;

public class Rotate_Image {
    public static void main(String[] args) {
        int[][] arr={{1 ,2, 3},{4 ,5, 6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            int left=0;
            int right=n-1;
            while (left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = arr[0].length-1; j >=0 ; j--) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        for(int[] a:arr){
            for(int curr:a){
                System.out.print(curr+" ");
            }
            System.out.println();
        }
    }
}
