import java.util.HashMap;


public class FindSum {
    public static void main(String[] args) {
        int[] arr={10, 20, 30, 40, 50};
        int target=60;
        int left=0;
        int right= arr.length-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[left]+arr[right]==target){
                System.out.println(left+" "+right);
                map.put(left,right);
            }
            if(arr[left]+arr[right]<target){
                left++;
            }
            else{
                right--;
            }

        }
        System.out.println(map);
    }
}
