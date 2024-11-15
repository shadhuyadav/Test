package DSA;

class TreeNode{
    TreeNode left,right;
    int val;
    TreeNode(int x){
        val=x;
    }
}
public class TreeExample {
    // Tree Traversal: inorder traversal of a binary tree showing commom traversal technique

    public static void inOrderTraversal(TreeNode root){
        if(root!=null){
            inOrderTraversal(root.left);
            System.out.println(root.val+"");
            inOrderTraversal(root.right);
        }
    }
    public static void main(String args[]){
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println("In-order Traversal: ");
        inOrderTraversal(root);


    }
}
