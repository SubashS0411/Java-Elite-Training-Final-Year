import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
//        int[] arr={10,20,30,40,50};
//        System.out.println(SecondL(arr));
//        System.out.println(SecondL(new int[]{5,5,5 ,5 , 5}));
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(SecondL(arr));
    }
    public static int SecondL(int[] arr){
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int cur=arr[i];
            if(cur>large){
                slarge=large;
                large=cur;
            } else if (cur>slarge && cur!=large) {
                slarge=cur;
            }
        }
        if(slarge == Integer.MIN_VALUE) return -1;
        return slarge;
    }
}
