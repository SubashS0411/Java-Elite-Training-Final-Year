public class ArrayRecursive {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        arr(arr,0);
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
}
