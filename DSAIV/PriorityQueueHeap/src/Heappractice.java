import java.util.PriorityQueue;

public class Heappractice {
    public static void main(String[] args) {
        PriorityQueue<Integer>  minHeap=new PriorityQueue<>();
        minHeap.add(50);
        minHeap.add(40);
        minHeap.add(39);
        minHeap.add(52);
        while (!minHeap.isEmpty()){
            System.out.print(minHeap.poll()+" ");
        }
//        System.out.println(minHeap.peek());
//        System.out.println(minHeap.poll());
//        System.out.println(minHeap.peek());
    }
}
