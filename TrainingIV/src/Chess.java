import java.util.Scanner;
//optimized approach of /.Board.java for board creation using index sum
public class Chess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0){
                    board[i][j]=0;
                }
                else{
                    board[i][j]=1;
                }
            }
        }
        System.out.println("Board:");
        for(int[] b: board){
            for(int i:b){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
