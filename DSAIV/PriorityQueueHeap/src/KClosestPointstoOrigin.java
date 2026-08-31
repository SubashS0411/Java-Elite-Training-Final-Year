import java.util.Arrays;
import java.util.PriorityQueue;

public class KClosestPointstoOrigin {
    public static int[][] kClosest(int[][]points,int k){
        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a,b)->
                Integer.compare((b[0]*b[0] + b[1]*b[1]),(a[0]*a[0] + a[1]*a[1])));
        for(int[] point:points){
            maxheap.add(point);
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        int[][] result=new int[k][2];
        int index=0;
        while (!maxheap.isEmpty()){
            result[index++]=maxheap.poll();
        }
        return result;
    }
    public static int[][] kClosest1(int[][] points,int k){
        Arrays.sort(points,(a,b)->(a[0]*a[0]+a[1]*a[1] - b[0]*b[0]+b[1]*b[1]));
        return Arrays.copyOfRange(points,0,k);
    }

    public static void main(String[] args) {
        int[][] res=kClosest(new int[][]{{0,2},{2,2}},2);
        System.out.println(Arrays.deepToString(res));
        int[][] res1=kClosest1(new int[][]{{0,2},{2,2}},2);
        System.out.println(Arrays.deepToString(res1));
    }
}
