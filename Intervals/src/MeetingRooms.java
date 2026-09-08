import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MeetingRooms {
    public static boolean canAttendMeetings(List<Intervals> intervals) {
        if(intervals==null|| intervals.size()<=1)return true;
        Collections.sort(intervals,(a,b)->Integer.compare(a.start,b.start));
        for (int i = 0; i < intervals.size()-1; i++) {
            int currentEnd=intervals.get(i).end;
            int nextstart=intervals.get(i+1).start;
            if(nextstart<currentEnd)return false;

        }
        return true;
    }

    public static void main(String[] args) {
        List<Intervals> schedule1 = new ArrayList<>(Arrays.asList(
                new Intervals(15, 20),
                new Intervals(5, 10),
                new Intervals(0, 30)
        ));

        System.out.println("Test Case 1 Schedule: " + schedule1);
        System.out.println("Can attend all? " +MeetingRooms.canAttendMeetings(schedule1));
    }
}
class Intervals{
    int start,end;
    Intervals(){
        start=0;end=0;
    }
    Intervals(int s,int e){start=s;end=e; }
}
