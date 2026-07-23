public class Lc73 {
    public static void main(String[] args) {

    }
    public void setZeros(int[][] matrix){
        int n=matrix.length;
        int m= matrix[0].length;
        boolean row=false,col=false;
        for (int i = 0; i < n; i++) {
            if(matrix[i][0]==0){
                col=true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if(matrix[0][i]==0){
                row=true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <m ; j++) {
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j <m; j++) {
//                if(matrix[i][0]==0 || matrix[])
//            }
        }
    }

