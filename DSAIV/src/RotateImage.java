import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        rotateoptimized(arr);
    }
    public static void rotate(int[][] arr){
        int row= arr.length;
        int col=arr[0].length;
        int[][] transpose=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                transpose[j][i]=arr[i][j];
            }
            
        }
        for (int i = 0; i < row; i++) {
            int s = 0;
            int e = transpose[0].length-1;
            while (s < e) {
                int temp = transpose[i][s];
                transpose[i][s] =transpose[i][e];
                transpose[i][e] = temp;
                s++;
                e--;
            }
        }
//        for (int[] a:transpose){
//         for(int e:a){
//             System.out.print(e+" ");
//         }
//            System.out.println();

        System.out.println(Arrays.deepToString(transpose));
    }
    public static void rotateoptimized(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int s=0;
            int e= arr.length-1;
            while(s<e){
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;
                e--;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
