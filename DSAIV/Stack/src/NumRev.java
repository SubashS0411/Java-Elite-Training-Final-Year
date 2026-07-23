import java.util.Stack;

public class NumRev {
    public static void main(String[] args) {
        int n=12345;
        Stack<Integer> st=new Stack<>();
        while(n>0){
            st.push(n%10);
            n/=10;
        }
        int rev=0;
        int place=1;
        while (!st.isEmpty()){
           rev+=(st.pop()*place);
           place*=10;
        }
        System.out.println(rev);
    }
}
