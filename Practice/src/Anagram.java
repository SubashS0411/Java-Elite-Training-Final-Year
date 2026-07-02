import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1="bear";
        String s2="bare";
        System.out.println(ana(s1,s2));
    }
    public static boolean ana(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        char[] s11=s1.toCharArray();
        char [] s22=s2.toCharArray();
        Arrays.sort(s11);
        Arrays.sort(s22);
        return Arrays.equals(s11,s22);
    }
}
