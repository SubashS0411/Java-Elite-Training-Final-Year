import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String G = "malayalam";
        String o = "";
        for (int i = G.length() - 1; i >= 0; i--) {
            o += G.charAt(i);
        }
        System.out.println(o);
        char[] s = {'h', 'e', 'l', 'l', 'o' };
        int start = 0;
        int last = s.length - 1;
        while (start < last) {
            char temp=s[start];
            s[start]=s[last];
            s[last]=temp;
            start++;
            last--;
        }
        System.out.println(Arrays.toString(s));
    }
}
