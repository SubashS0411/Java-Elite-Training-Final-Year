import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.TreeMap;
import java.util.TreeSet;

public class UniqueElementExtractor {
    public static void main(String[] args) {
        int [] arr={5,2,3,2,5,7,9,1,3,4};
        TreeSet<Integer> set=new TreeSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set.size());
        for(int i:set){
            System.out.print(i+" ");
        }
//        int[] arr1=new int[].
    }
}
