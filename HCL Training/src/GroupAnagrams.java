import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans=group(arr);
        System.out.println(ans);
    }
    public static List<List<String>> group(String[] str){
        Map<String,List<String>> solution=new HashMap<>();
        for(String word:str){
            char[] charr=word.toCharArray();
            Arrays.sort(charr);
            String newword=new String(charr);
            solution.computeIfAbsent(newword,k->new ArrayList<>()).add(word);
        }
        return new ArrayList<>(solution.values());
    }
}
