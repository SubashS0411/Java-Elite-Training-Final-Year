import java.util.*;

public class Sum_3 {
    public static void main(String[] args) {
        int[] num={-1,0,1,2,-1,-4};
        List<List<Integer>> solution=threeSum(num);
        System.out.println(solution);
    }
    public static List<List<Integer>> threeSum(int[] nums){
        Set<List<Integer>> st=new HashSet<>();
        int n= nums.length;
        for (int i = 0; i <n ; i++) {
            Set<Integer> hashset=new HashSet<>();
            for (int j = i+1; j <n; j++) {
                int third=-(nums[i]+nums[j]);
                if(hashset.contains(third)){
                    List<Integer> temp= Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hashset.add(nums[j]);
            }
        }
        return new ArrayList<>(st);
    }
}
