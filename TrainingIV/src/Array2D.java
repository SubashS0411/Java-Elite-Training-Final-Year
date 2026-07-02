public class Array2D {
    public static void main(String[] args) {
        int[][] arr=new int[2][2];
//        {1,2},{3,4}
        arr[0][0]=1;
        arr[0][1]=2;
        arr[1][0]=3;
        arr[1][1]=4;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        for (int[] gops : arr) {
            for (int anInt : gops) {
                System.out.print("["+anInt + "] ");
            }
            System.out.println();
        }
    }
}
