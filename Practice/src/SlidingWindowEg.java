public class SlidingWindowEg {
    public static void main(String[] args) {
        int[] arr={1,0,-1,0,-2,2};
        printSlidingWindow(arr,3);
        System.out.println();
        printSlidingWindow(new int[]{2, 2, 2, 2, 2},3);
        System.out.println();
        printSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
    }
    public static void printSlidingWindow(int[] arr,int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=arr[i];
        }
        System.out.print(sum+" ");
        for (int i = k; i < arr.length ; i++) {
            sum+=arr[i]-arr[i-k];
            System.out.print(sum+" ");
        }
    }
}
