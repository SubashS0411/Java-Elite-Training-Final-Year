import java.util.HashSet;
import java.util.Set;

public class Substring_Without_Repeating_Characters {
    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
//        System.out.println(Len(s));
    }
//    public static  int Len(String s){
//
//    }
    public static int lengthOfLongestSubstring(String s){
        Set<Character> set=new HashSet<>();
        int left=0;
        int max=0;
        for (int right = 0; right <s.length() ; right++) {
            char curr=s.charAt(right);
            while (set.contains(curr)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curr);
            max=Math.max(max,right-left+1);

        }
        return max;
    }

}
