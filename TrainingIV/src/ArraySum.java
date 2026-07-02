import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
//        int[][] arr= new int[n][n];
//        System.out.println("Enter the elements of the array");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//      float sum=0;
//        System.out.println("Array Sum");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                sum+=arr[i][j];
//            }
//        }
//        System.out.println(sum);
//        System.out.println("Average: "+((double)(sum/(arr.length*arr[0].length))));
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        int sum=0;
        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];
        System.out.println("Sum: "+sum);
        System.out.println("Average:"+(float)sum/arr.length);
    }
}
