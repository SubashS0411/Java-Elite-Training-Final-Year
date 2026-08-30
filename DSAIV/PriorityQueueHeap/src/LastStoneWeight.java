import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int n=lastStoneWeight(new int[]{2, 3, 6, 2, 4});
        System.out.println(n);
        int n1=lastStoneWeight2(new int[]{2, 3, 6, 2, 4});
        System.out.println(n1);
    }
    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            maxheap.add(num);
        }
        for (int i = 0; i < maxheap.size(); i++) {
            int x=maxheap.poll();
            int y=maxheap.poll();
            if(x!=y) {
                maxheap.add(x-y);
            }

        }
        return maxheap.isEmpty()?0: maxheap.peek();
    }
    public static int lastStoneWeight2(int[] nums){
        PriorityQueue<Integer> minheap=new PriorityQueue<>();
        for (int num:nums){
            minheap.offer(-num);
        }
        while (minheap.size()>1){
            int curr=minheap.poll()-minheap.poll();
            if(curr!=0) minheap.offer(curr);
        }
        return minheap.isEmpty()?0:Math.abs(minheap.peek());
    }
}
