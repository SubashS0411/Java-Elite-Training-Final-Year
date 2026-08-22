import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        List<List<Integer>> ans=subset(new int[]{1,2,3});
        System.out.println(ans);
//        System.out.println(Arrays.toString(new int[]{1,2,3}));
    }
    public static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        backTrack(ans,new ArrayList<>(),nums,0);
        return ans;
    }
    public static void backTrack(List<List<Integer>> result,List<Integer> current,int[] arr,int index){
        result.add(new ArrayList<>(current));
        for (int i = index; i < arr.length ; i++) {
            current.add(arr[i]);
            backTrack(result,current,arr,i+1);
            current.remove(current.size()-1);
        }
    }
}
