import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][] { newInterval };
        }
        int i=0;
        int n= intervals.length;
        List<int[]> result=new ArrayList<>();
        while (i<n && intervals[i][1]<newInterval[0]){
            result.add(intervals[i]);
            i++;
        }
        while (i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        result.add(newInterval);
        while (i<n){
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr={{1,3},{4,6}};
        System.out.println(Arrays.deepToString(insert(arr,new int[]{2,5})));
    }
}
