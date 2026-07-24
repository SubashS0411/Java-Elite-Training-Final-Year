import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RDUnsorted {
    public static void main(String[] args) {
        int[] arr={1, 1, 3, 4, 4, 5,2, 2,6,120};
        HashSet<Integer> set=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
