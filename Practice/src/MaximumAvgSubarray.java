public class MaximumAvgSubarray {
    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
    }
    public static double findMaxAverage(int[] nums, int k){
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];

        }
        int csum=sum;
        for (int i = k; i < nums.length ; i++) {
            sum+=nums[i]-nums[i-k];
            csum=Math.max(sum,csum);
        }
        return (double) csum/k;

    }
}
