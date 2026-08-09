import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("zxyzxyz"));
        System.out.println(lengthOfLongestSubstring( "xxxx"));
    }
//    344ms
    public static int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        Set<Character> st = new HashSet<>();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            while (st.contains(ch)) {
                st.remove(s.charAt(l));
                l++;

            }
            st.add(ch);
            maxlength = Math.max(maxlength, i - l + 1);
        }
        return maxlength;
    }
}
