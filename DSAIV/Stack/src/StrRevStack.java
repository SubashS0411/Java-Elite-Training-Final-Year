import java.util.Stack;

public class StrRevStack {
    public static void main(String[] args) {
        String str = "Hello";
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        while(!s.isEmpty()) {
            sb.append(s.pop());
        }
        System.out.println(sb);
    }
}
