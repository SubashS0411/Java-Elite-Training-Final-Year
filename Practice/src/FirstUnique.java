import java.util.*;

public class FirstUnique {
    public static void main(String[] args) {
        String g="swissw";
        System.out.println(firstUnique(g));
    }
    public static int firstUnique(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1) return i;
        }
        return -1;
    }
}
