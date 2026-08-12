import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//Leetcode 102
public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        LevelOrderTraversal l=new LevelOrderTraversal();
        List<List<Integer>> output=l.levelOrder(root);
        System.out.println("Level order Traversal");
        System.out.println(output);
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int levelsize= queue.size();
            List<Integer> level=new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode current=queue.poll();
                level.add(current.val);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            result.add(level);
        }
        return result;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}