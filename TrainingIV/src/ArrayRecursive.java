public class ArrayRecursive {
    public static void main(String[] args) {
        int [] arr={10,2,3,4};
        arr(arr,0);
        System.out.println();
        reverse(arr,arr.length-1);
        System.out.println();
        System.out.println(reverse1(arr,arr.length-1));
    }
    public static void arr(int[] arr,int n){
        if(n>arr.length-1){
            return;
        }
//        arr(arr,n+1);
        System.out.print(arr[n]+" ");
//        System.out.println();
        arr(arr,n+1);
//        System.out.print(arr[n]+" ");
    }
    public static void reverse(int[] arr,int n){
        if(n<0  ){
            return;
        }
//        System.out.println();

        System.out.print(arr[n]+" ");
        reverse(arr,n-1);
    }
    public static int reverse1(int[] arr, int n){
        if(n<0){
            return 0;
        }
        return reverse1(arr,n-1)+arr[n];
    }
}
