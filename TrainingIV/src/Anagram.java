import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String a="car";
        String b="rac";
        char[] s1=a.toCharArray();
        char[] s2=b.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        if(Arrays.equals(s1,s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
