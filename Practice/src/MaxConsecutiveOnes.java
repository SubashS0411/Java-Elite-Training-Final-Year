public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int count=0;
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                count++;
//                max=Math.max(count,max);
//                optimized Solution
                max = (count < max) ? max : count;
            }
            else{
                if(max<count){
                    max=count;
                    count=0;
                }
            }
        }
        return max;
    }
}
