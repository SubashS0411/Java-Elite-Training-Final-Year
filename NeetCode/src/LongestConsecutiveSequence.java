import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
//        System.out.println(longestConsecutive(new int[]{2,20,4,10,3,4,5}));
        System.out.println(longestConsecutive2(new int[]{0,3,2,5,4,6,1,1}));;
    }
    public static int longestConsecutive(int[] arr) {
        int longest = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int curr = 1;
            int x = arr[i];
            while (ls(arr, x + 1)) {
                x = x + 1;
                curr++;
            }

            longest = Math.max(longest, curr);
        }
        return longest;
    }
    public static boolean ls(int[] arr,int target){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==target){
                return true;
            }

        }
        return false;
    }
//    243ms
    public static int longestConsecutive1(int[] arr){
        int n= arr.length;
        if(n==0) return 0;
        int curr=0;
        int longest=1;
        int smallest=Integer.MIN_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if(arr[i]-1==smallest){
                curr++;
                smallest=arr[i];
            } else if (arr[i]!=smallest) {
                curr=1;
                smallest=arr[i];
            }
            longest=Math.max(longest,curr);
        }
        return longest;
    }
//    339ms
    public static  int longestConsecutive2(int[] arr){
        int n=arr.length;
        if(n==0) return 0;
        int longest=1;
        Set<Integer> st=new HashSet<>();
        for (int a:arr){
            st.add(a);
        }
        for (int it:st) {
            if (!st.contains(it - 1)) {
                int count = 1;
                int x = it;

                while (st.contains(x + 1)) {
                    x=x+1;
                    count=count+1;

                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}
