import java.util.HashMap;

public class MaxSumSubarray {
    public static void main(String[] args) {
        int[] arr={1 ,-1, 2 ,-2 ,3};
        System.out.println(Subarray(arr));
        System.out.println(optimizes(arr));
    }
    public static int Subarray(int[] arr){

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j <arr.length ; j++) {
                sum+=arr[j];
                if(sum==0){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
    public static  int optimizes(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int maxLen=0;
        int currentSum=0;
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            if(map.containsKey(currentSum)){
                maxLen=Math.max(maxLen,i-map.get(currentSum));
            }
            else{
                map.put(currentSum,i);
            }
        }
        return maxLen;
    }
}
