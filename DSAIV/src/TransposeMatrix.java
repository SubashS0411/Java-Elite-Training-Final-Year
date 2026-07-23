import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int[][] result = transpose(arr);
        System.out.println(Arrays.deepToString(result));
    }
    public static int[][] transpose(int[][] matrix){
        int row= matrix.length;
        int col=matrix[0].length;
        int[][] transpose=new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                transpose[j][i]=matrix[i][j];
            }

        }
        return transpose;
    }
}
