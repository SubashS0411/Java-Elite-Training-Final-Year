import java.util.Arrays;

public class TwoIntegerSumII {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum((new int[]{1,2,3,4}),3)));
    }
    public static int[] twoSum(int[] arr,int target){
        int left=0,right= arr.length-1;
        while (left<right){
            int curr=arr[left]+arr[right];
            if(curr==target){
                return new int[]{left+1,right+1};
            } else if (curr>target) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{-1,-1};
    }
}
