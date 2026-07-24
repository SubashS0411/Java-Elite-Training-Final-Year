import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr={73,74,75,71,69,72,76,73};
        int[] solution=dailyTemperatures(arr);
        System.out.println(Arrays.toString(solution));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,60,90})));
    }
    public static int[] dailyTemperatures(int[] arr){
        int[] res=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && (arr[st.peek()]<arr[i])){
                int pre=st.pop();
                res[pre]=i-pre;
            }
            st.push(i);
        }
        return res;
    }
}
