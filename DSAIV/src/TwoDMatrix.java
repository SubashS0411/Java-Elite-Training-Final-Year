public class TwoDMatrix {
    public static void main(String[] args) {
        int[][] matix={{1,2,3,4,5},{2,4,6,8,10}};
        for(int[] arr:matix){
            for(int element:arr){
                System.out.print(element+" ");
            }
            System.out.println();
        }
//        RowSum(matix);
//        colSum(matix);
//        reverseMat(matix);
//        printmat(matix);
        colRev(matix);
    }

    public static void RowSum(int[][] matix){
        int sum=0;
        for(int[] arr:matix){
            for(int element:arr){
                sum+=element;
            }
            System.out.println(sum);
            sum=0;
        }
    }
    public static void colSum(int[][] matrix){
        int col= matrix[0].length;
        int row= matrix.length;
        for (int i = 0; i < col; i++) {
            int csum=0;
            for (int j = 0; j < row; j++) {

                csum+=matrix[j][i];
            }
            System.out.print(csum+" ");
        }
    }
    public static void reverseMat(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int s = 0;
            int e = matrix[0].length-1;
            while (s < e) {
                int temp = matrix[i][s];
                matrix[i][s] = matrix[i][e];
                matrix[i][e] = temp;
                s++;
                e--;
            }
//            l++;
//            if (l == matrix.length) {
//                break;
//            }
        }
            for (int[] arr : matrix) {
                for (int element : arr) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

    public static void printmat(int[][] matix){
        for(int[] arr:matix){
            for(int element:arr){
                System.out.print(element+" ");
            }
            System.out.println();
        }

}
public static void colRev(int[][] matrix){
        int e = matrix.length - 1;
        int s = 0;
        while (s < e) {
            int[] temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;
            e--;
        }

    for (int[] arr : matrix) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }


}
}
