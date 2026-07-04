import java.util.ArrayList;
import java.util.Collections;

public class Leader {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        int len=arr.length;
        int max=2;
        ArrayList<Integer> list=new ArrayList<>();
        list.add(arr[len-1]);
        System.out.print(arr[len-1]+" ");
        for (int i = len-1; i >=0 ; i--) {
            if(arr[i]>max){
                max=arr[i];
                list.add(arr[i]);
                System.out.print(max+"  ");
            }
        }
        System.out.println();
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(sb(arr));
    }
    public static int[] sb(int[] arr){
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){}
    }
}
