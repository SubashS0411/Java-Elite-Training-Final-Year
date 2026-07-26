import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        String s="()";
        System.out.println(validParanthesis(s)?"YES":"NO");
    }
    public static boolean validParanthesis(String s){
        Stack<Character> paran=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='(') paran.push(')');
            else if (ch=='{') paran.push('}');
            else if (ch=='[') paran.push(']');
            else {
                if(paran.isEmpty() || paran.pop() !=ch){
                    return false;
                }
        }
        }
            return paran.isEmpty();

        }
}
