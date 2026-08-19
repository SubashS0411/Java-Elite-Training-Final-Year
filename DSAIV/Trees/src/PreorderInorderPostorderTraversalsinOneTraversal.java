import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreorderInorderPostorderTraversalsinOneTraversal {
    public static void main(String[] args) {
        PreorderInorderPostorderTraversalsinOneTraversal p=new PreorderInorderPostorderTraversalsinOneTraversal();
        TreeNode root=new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        p.AllTraversal(root);
    }
    public void AllTraversal(TreeNode root){
        List<Integer> preorder=new ArrayList<>();
        List<Integer> inorder=new ArrayList<>();
        List<Integer> postorder=new ArrayList<>();
        if(root==null) return;
        Stack<Pair> st=new Stack<>();
        st.push(new Pair(root,1));
        while (!st.isEmpty()){
            Pair curr=st.pop();
            if(curr.num==1){
               preorder.add(curr.node.val);
               curr.num=2;
               st.push(curr);
               if(curr.node.left!=null){
                   st.push(new Pair(curr.node.left,1));
               }
            }
            else if(curr.num==2){
                inorder.add(curr.node.val);
                curr.num=3;
                st.push(curr);
                if(curr.node.right!=null){
                    st.push(new Pair(curr.node.right,1));
                }
            }
            else{
                postorder.add(curr.node.val);
            }
        }
        System.out.println("PostOrderTraversal: "+postorder);
        System.out.println("InorderTraversal: "+inorder);
        System.out.println("PreorderTraversal: "+preorder);
    }

}
class Pair{
    TreeNode node;
    int num;

    public Pair(TreeNode node, int num) {
        this.node = node;
        this.num = num;
    }
}