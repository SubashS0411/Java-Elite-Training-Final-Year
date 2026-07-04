import java.util.*;
public class FirstNonRepeating {
    public static void main(String[] args) {
        String a="aabbcde";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:a.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:a.toCharArray()){
            if(map.get(c)==1){
                System.out.println(c);
                break;
            }
        }
    }

}
