import java.util.PriorityQueue;

public class KthLargestElementinaStream {
    public PriorityQueue<Integer> minheap;
    public int k;
        public  KthLargestElementinaStream(int k, int[] nums) {
            this.k=k;
            this.minheap=new PriorityQueue<>();
            for(int num:nums){
                add(num);
            }
        }

        public  int add(int val) {
            minheap.add(val);
            if(minheap.size()>k){
                minheap.poll();
            }
            return minheap.peek();
        }

    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};

        System.out.println("Initializing VIP Club of size " + k + " with [4, 5, 8, 2]");
        KthLargestElementinaStream kthLargest = new KthLargestElementinaStream(k, nums);

        // The heap internally becomes [4, 5, 8] after initialization.
        // 2 is kicked out because it's too small.

        System.out.println("Add 3 -> Kth largest is: " + kthLargest.add(3));   // returns 4
        System.out.println("Add 5 -> Kth largest is: " + kthLargest.add(5));   // returns 5
        System.out.println("Add 10 -> Kth largest is: " + kthLargest.add(10)); // returns 5
        System.out.println("Add 9 -> Kth largest is: " + kthLargest.add(9));   // returns 8
        System.out.println("Add 4 -> Kth largest is: " + kthLargest.add(4));   // returns 8
    }

}
