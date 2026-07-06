import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String a="(){}[]";
        System.out.println(paranthesis(a));
    }
    public static boolean paranthesis(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty() || stack.pop()!=c)return false;
        }
        return stack.isEmpty();
    }
}
