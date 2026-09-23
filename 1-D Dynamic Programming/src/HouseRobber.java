import java.util.Arrays;

public class HouseRobber {
    private static int[] memo;
    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,1,3,3}));
        System.out.println(rob1(new int[]{1,1,3,3}));
    }
    public static int rob(int[] nums) {
        return dfs(nums,0);
    }
    public static int dfs(int[] nums,int n){
        if(n>=nums.length)return 0;
        return Math.max(dfs(nums,n+1),(nums[n]+dfs(nums,n+2)));
    }

    public static int rob1(int [] nums){
        memo=new int[nums.length];
        Arrays.fill(nums,-1);
        return dfs1(nums,0);
    }
    public static int dfs1(int[] nums,int i){
        return 0;
    }
}
