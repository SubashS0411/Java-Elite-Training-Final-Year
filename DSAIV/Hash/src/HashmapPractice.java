import java.util.HashMap;
import java.util.HashSet;

public class HashmapPractice {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap();
        h.put("Apple",5);
        System.out.println(h.getOrDefault("Apple",0));
    }
}
