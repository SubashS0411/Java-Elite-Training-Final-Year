import java.util.Arrays;

public class ProductsArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr={1,2,4,6};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }
    public static int[] productExceptSelf(int[] arr){
        int [] result=new int[arr.length];
        Arrays.fill(result,1);
        int pre=1,post=1;

        for (int i = 0; i < arr.length ; i++) {
            result[i]*=pre;
            pre*=arr[i];
        }
        for (int i = arr.length-1; i>=0; i--) {
            result[i]*=post;
            post*=arr[i];
        }
        return result;
    }
}
