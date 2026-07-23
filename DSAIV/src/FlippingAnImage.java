import java.util.Arrays;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] arr={{1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }
    public static int[][]flipAndInvertImage(int[][]arr){
//        int row= arr.length;
//        int col= arr[0].length;
//        int[][] arr=new int[col][row];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
////                int temp=arr[i][j];
//                arr[j][i]=arr[i][j];
////                arr[j][i]=temp;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            int s=0;
            int e= arr[i].length-1;
            while(s<e){
                int temp=arr[i][s];
                arr[i][s]=arr[i][e];
                arr[i][e]=temp;
                s++;
                e--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0) arr[i][j]=1;
                else arr[i][j]=0;
            }
        }
        return arr;
    }

}
