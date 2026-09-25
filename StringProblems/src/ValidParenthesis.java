import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String parenthesis="({[]})";
        System.out.println(valid(parenthesis)?"Valid":"Invalid");
        System.out.println(valid(new String("[()()]{}")));
        System.out.println(valid(new String("([)]")));
    }
    public static boolean valid(String p){
        if(p.length()==0) return false;
        Stack<Character> st=new Stack<>();
        for(char ch:p.toCharArray()){
            if(ch=='(') st.push(')');
            else if(ch=='{') st.push('}');
            else if(ch=='[') st.push(']');
            else{
                if(st.isEmpty() || st.pop()!=ch){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
