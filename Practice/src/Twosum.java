import java.util.HashMap;

public class Twosum {
    public static void main(String[] args) {
        int [] arr={40, 12, 85, 5, 23};
        int target=35;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement=target-arr[i];
            if(map.containsKey(complement)){
                System.out.println((map.get(complement)+", "+i));
                break;
            }
            map.put(arr[i],i);
        }
    }
}
