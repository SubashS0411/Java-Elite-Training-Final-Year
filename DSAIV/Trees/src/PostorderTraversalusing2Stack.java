import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostorderTraversalusing2Stack {
    public static void main(String[] args) {
        PostorderTraversalusing2Stack p1=new PostorderTraversalusing2Stack();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> op=p1.postOrder(root);
        System.out.println(op);
    }
    public List<Integer> postOrder(TreeNode root){
        Stack<TreeNode> s1=new Stack<>();
        Stack<TreeNode> s2=new Stack<>();
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        s1.push(root);
        while(!s1.isEmpty()){
            root=s1.pop();
            s2.push(root);
            if(root.left!=null){
                s1.push(root.left);
            }
            if(root.right!=null){
                s1.push(root.right);
            }
        }
        while (!s2.isEmpty()){
            ans.add(s2.pop().val);
        }
        return ans;
    }
}
