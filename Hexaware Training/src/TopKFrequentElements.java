import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,3,3};
        int[] ans=topKFrequent(nums,2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] topKFrequent(int[] nums,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
                (a,b)->map.get(a)-map.get(b)
        );
        for (int key: map.keySet()){
            pq.add(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] output=new int[k];
        for (int i = 0; i < k; i++) {
            output[i]= pq.poll();
        }


        return output;
    }
}
