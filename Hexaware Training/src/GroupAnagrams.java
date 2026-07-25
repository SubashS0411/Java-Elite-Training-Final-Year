import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result=grpAnagrams(s);
        List<List<String>> r1=grpAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
        System.out.println(result);
        System.out.println(r1);
    }
    public static List<List<String>> grpAnagrams(String[] strs){
        Map<String,List<String>> map=new HashMap<>();
        for(String words:strs){
            char[] c=words.toCharArray();
            Arrays.sort(c);
            String key=new String(c);

//map.computeIfAbsent(key, k -> new ArrayList<>()).add(words);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(words);
        }

        return new ArrayList<>(map.values());

    }
}
