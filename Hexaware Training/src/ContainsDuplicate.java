import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[]arr={1, 2, 3, 4};
        System.out.println(hasDuplicate(arr));
        System.out.println(hasDuplicateoptimized(arr));
        System.out.println(hasDuplicateoptimized2(arr));
    }
    public static boolean hasDuplicate(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set.size()!= arr.length;
    }
    public static boolean hasDuplicateoptimized(int[] arr){
        HashSet<Integer> set =new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static boolean hasDuplicateoptimized2(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for (int nums:arr){
            if(!set.add(nums)) return true;
        }
        return false;
    }
}
