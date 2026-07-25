import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,3};
        int[] ans=topKFrequent(nums,2);
    }
    public static int[] topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] rearr=new int[2];
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
        return new int[]{-1,-1};
    }
}
