import java.util.HashSet;

public class WordFrequencySet {
    public static void main(String[] args) {
        String s="java code code collection set java";
        HashSet<String> set=new HashSet<>();
        String[] arr=s.split(" ");
        for(String i:arr){
            set.add(i);
        }
        System.out.println(set.size());
    }
}
