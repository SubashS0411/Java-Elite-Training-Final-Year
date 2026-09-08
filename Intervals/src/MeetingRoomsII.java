import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int minMeetingRooms(List<Intervals> intervals) {
        if (intervals == null || intervals.size() == 0) return 0;
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        minheap.add(intervals.get(0).end);
        for (int i = 1; i < intervals.size(); i++) {
            if (!minheap.isEmpty() && intervals.get(i).start >= minheap.peek()) {
                minheap.poll();
            }
            minheap.offer(intervals.get(i).end);
        }
        return minheap.size();
    }
    public static int minMeetingsRooms2(List<Intervals> intervals){
        if(intervals==null || intervals.size()==0) return 0;
        int n=intervals.size();
        int[] start=new int[n];
        int[] end=new int[n];
        for (int i = 0; i < intervals.size(); i++) {
            start[i]=intervals.get(i).start;
            end[i]=intervals.get(i).end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int s=0,e=0,res=0,count=0;
        while(s<n){
            if(start[s]<end[e]){
                s++;
                count++;
            }
            else{
                e++;
                count--;
            }
            res=Math.max(res,count);
        }
        return res;
    }

    public static void main(String[] args) {
        // Test Case 1: Needs 2 rooms
        List<Intervals> schedule1 = new ArrayList<>(Arrays.asList(
                new Intervals(0, 30),
                new Intervals(5, 10),
                new Intervals(15, 20)
        ));
        System.out.println("Test Case 1 - Minimum Rooms: " + minMeetingRooms(schedule1));
        System.out.println(minMeetingsRooms2(schedule1));
    }
}
