import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String s="apple mango apple grape mango peach peach plum plum apple";
        String[] arr=s.split(" ");
        Map<String,Integer> map=new TreeMap<>();
        int n=10;
        for (int i = 0; i <n ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map.size());
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
