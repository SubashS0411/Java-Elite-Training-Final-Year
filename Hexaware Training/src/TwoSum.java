import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr=twoSum(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> set=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int c=target-arr[i];
            if(set.containsKey(c)){
                return new int[]{set.get(c),i};
            }
            set.put(arr[i],i);
        }
        return new int[] {-1,-1};
    }
}
