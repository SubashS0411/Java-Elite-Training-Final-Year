import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//Lc 94
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        BinaryTreeInorderTraversal b=new BinaryTreeInorderTraversal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        List<Integer> output=b.inorderTraversal(root);
        System.out.println("PreorderTraversal");
        System.out.println(output);
    }
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        TreeNode curr=root;
        while(curr!=null || !st.isEmpty()){
            while (curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}
