public class LowestCommonAncestorinBinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        TreeNode curr=root;
        while (curr!=null){
            if(p.val>curr.val && q.val>curr.val){
                curr=curr.right;
            }
            else if(p.val<curr.val && q.val<curr.val){
                curr=curr.left;
            }
            else{
                return curr;
            }
        }
        return null;
    }
    public TreeNode lowestCommonAncestor1(TreeNode root,TreeNode p,TreeNode q){
        if(root==null) return null;
        if(p.val<root.val && q.val<root.val){
            return  lowestCommonAncestor1(root.left,p,q);
        }
        if(p.val> root.val && q.val> root.val){
            return lowestCommonAncestor1(root.right,p,q);
        }
        return root;
    }
}
