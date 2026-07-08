import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class NotEqualStrings {
    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="geeksquiz";
        String s3=s1+s2;
        HashSet<Character> unique =new HashSet<>();
        for (char c:s3.toCharArray()){
            unique.add(c);
        }
        ArrayList<Character> sortedList = new ArrayList<>(unique);
        Collections.sort(sortedList);
        StringBuilder sb=new StringBuilder(sortedList.size());
        for(Character ch:sortedList){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
