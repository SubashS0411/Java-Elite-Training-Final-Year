import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,38,30,36,35,40,28})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30,40,50,60})));
    }
    public static int[] dailyTemperatures(int[] temp){
        int[] res=new int[temp.length];
        Stack<Integer> st=new Stack<>();
        for (int i = 0; i < temp.length; i++) {
            while (!st.isEmpty() && (temp[st.peek()]<temp[i])){
                int pre=st.pop();
                res[pre]=i-pre;
            }
            st.push(i);
        }
        return res;
    }
}
