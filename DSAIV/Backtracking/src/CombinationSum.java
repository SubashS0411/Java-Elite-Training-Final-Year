import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String[] args) {
        int[] arr={9,2,2,4,6,1,5};
        List<List<Integer>> solution=combinationSum(new int[] {2,5,6,9},9);
        System.out.println(solution);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),candidates,target,0);
        return ans;
    }
    public static void backtrack(List<List<Integer>> result,List<Integer> current,int[] candidates,int remain,int start){
        if(remain<0) return;
        if(remain==0){
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]);
            backtrack(result,current,candidates,remain-candidates[i],i);
            current.remove(current.size()-1);
        }
    }
}
