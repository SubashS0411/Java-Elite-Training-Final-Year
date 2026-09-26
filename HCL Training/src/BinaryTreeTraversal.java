public class BinaryTreeTraversal {
    Node root;
    BinaryTreeTraversal(){
        root=null;
    }
    public void preOrder(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null) return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public  void insert(int data){
        root=insertRecursive(root,data);
    }
    public Node insertRecursive(Node current, int data){
        if(current==null) return new Node(data);
        if(data<current.data){
            current.left=insertRecursive(current.left,data);
        } else if (data> current.data) {
            current.right=insertRecursive(current.right,data);
        }
        return current;
    }
    public  int height(Node node){
        if(node==null)return 0;
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public static void main(String[] args) {
        BinaryTreeTraversal bt=new BinaryTreeTraversal();
        bt.insert(10);
        bt.insert(20);
        bt.insert(30);
        bt.insert(40);
        bt.insert(50);
//        bt.root.right.left = new Node(6);
//        bt.root.right.right = new Node(7);
        System.out.println("Preorder traversal (Root, Left, Right):");
        bt.preOrder(bt.root);
        System.out.println("\n");

        System.out.println("Inorder traversal (Left, Root, Right):");
        bt.inOrder(bt.root);
        System.out.println("\n");

        System.out.println("Postorder traversal (Left, Right, Root):");
        bt.postOrder(bt.root);
        System.out.println();
        int height=bt.height(bt.root);
        System.out.println("Height of the tree: "+height);
    }
}
class Node{
    int data;
     Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
