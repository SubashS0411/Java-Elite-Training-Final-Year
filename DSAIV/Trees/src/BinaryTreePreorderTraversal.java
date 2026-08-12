import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//Lc 144
public class BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        BinaryTreePreorderTraversal b=new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> output=b.preorderTraversal(root);
        System.out.println("PreorderTraversal");
        System.out.println(output);
    }
    public List<Integer> preorderTraversal(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            root=st.pop();
            ans.add(root.val);
            if(root.right!=null){
                st.push(root.right);
            }
            if(root.left!=null){
                st.push(root.left);
            }

        }
        return ans;
    }
}
