import java.util.ArrayList;
import java.util.List;

public class ArrayListEg {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2,3);
        List<Integer> l2=new ArrayList<>(3);
        for (int i = 0; i <=5; i++) {
            l2.add(i*2);
        }
        System.out.println(list.get(2));
        System.out.println(list);
        for (int i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        list.addAll(l2);
        System.out.println(list);
    }
}
