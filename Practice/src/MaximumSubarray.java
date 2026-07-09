public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] arr){
        int sum=arr[0];
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum=Math.max(arr[i],sum+arr[i]);
            max=Math.max(sum,max);
        }
        return max;
    }
}
