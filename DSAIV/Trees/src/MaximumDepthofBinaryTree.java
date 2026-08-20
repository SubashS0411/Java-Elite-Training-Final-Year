public class MaximumDepthofBinaryTree {
    int maxDiameter=0;
    public int maxDepth(TreeNode root) {
       CalculateHeight(root);
       return maxDiameter;
    }
    public int CalculateHeight(TreeNode root){
        if(root==null) return 0;
        int left=CalculateHeight(root.left);
        int right=CalculateHeight(root.right);
        maxDiameter=Math.max(maxDiameter,left+right);
        return 1+Math.max(left,right);
    }
}
