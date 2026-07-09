public class PivotIndex {
    public static void main(String[] args) {
        int[] arr={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] arr){
//        if(arr.length<=1){
//            return arr[0];
//        }
        int leftSum=0;
        int rightSum=0;
        int totalSum=0;
        for(int i:arr) {
            totalSum += i;
        }
        for(int i=0;i<arr.length;i++){
            rightSum=totalSum-leftSum-arr[i];
            if(leftSum==rightSum)return i;
            leftSum+=arr[i];
        }
        return -1;
    }
}
