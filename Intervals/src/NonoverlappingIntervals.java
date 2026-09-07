import java.util.Arrays;

public class NonoverlappingIntervals {
    public static int eraseOverlapIntervals(int[][] intervals){
        if(intervals.length==0) return 0;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int removeCount=0;
        int freetime=intervals[0][1];
        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[i][0]<freetime){
                removeCount++;
            }
            else {
                freetime=intervals[i][1];
            }
        }
        return removeCount;
    }

    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1,2},{2,4},{1,4}}));
    }
}
