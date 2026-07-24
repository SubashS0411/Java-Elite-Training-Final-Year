import java.util.Arrays;

public class Right_Rotate_Array {
    public static void main(String[] args) {
        int[] arr={1 ,2 ,3 ,4 ,5};
        int k=2;
        int len=5;
        k=k%len;
        rev(arr,0,len-1);
        rev(arr,0,k-1);
        rev(arr,k,len-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void rev(int[] arr,int s,int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
