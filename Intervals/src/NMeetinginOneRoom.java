import java.util.Arrays;

public class NMeetinginOneRoom {
    static class Meeting{
        int start,end;
        Meeting(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public static int maxMeeting(int[] start,int [] end,int n){
        Meeting[] meetings=new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i]=new Meeting(start[i],end[i]);
        }
        Arrays.sort(meetings,(a,b)->Integer.compare(a.end,b.end));
        int meetcount=1;
        int freetime=meetings[0].end;
        for (int i = 1; i <n ; i++) {
            if(meetings[i].start>freetime){
                meetcount++;
                freetime=meetings[i].end;
            }
        }
        return n-meetcount;
    }

    public static void main(String[] args) {
        System.out.println(maxMeeting(new  int[]{1, 3, 0, 5},new int[]{2, 4, 6, 7},4));
    }
}
