import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"1","2","+","3","*","4","-"}));
    }
    public static int evalRPN(String[] tokens){
        Stack<Integer> stack =new Stack<>();
        for(String s:tokens){
            if(s.equals("+")){
                stack.push(stack.pop()+stack.pop());
            } else if (s.equals("-")) {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b-a);
            } else if (s.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            } else if (s.equals("/")) {
                int a=stack.pop();
                int b=stack.pop();
                stack.push(b/a);
            }
            else{
                stack.push(Integer.parseInt(s));
            }

        }
        return stack.peek();
//        return stack.pop();
    }
}
