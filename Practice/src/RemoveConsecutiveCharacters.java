import java.util.Stack;

public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        String s="aabb";
        char[] arr=s.toCharArray();
        Stack<Character> st=new Stack<>();
        st.push(arr[0]);
        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]!=arr[i-1]){
                st.push(arr[i]);
            }
        }
        // 3. Convert the Stack back into a String
        StringBuilder sb = new StringBuilder();

        // In Java, iterating over a Stack goes from bottom to top.
        // This is perfect for us, as it keeps our letters in the correct forward order!
        for (char c : st) {
            sb.append(c);
        }
        System.out.println(sb);
    }
}
