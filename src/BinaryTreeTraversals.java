public class BinaryTreeTraversals {
/*
    To demonstrate tree traversal methods such as in-order, pre-order, and post-order,
     we need to work with a binary tree rather than a singly linked list.
      The binary tree is a common data structure in which each node has at most two children,
       typically referred to as the left and right children.
            Here's a Java program that demonstrates these three types of depth-first traversals on a binary tree:



*/


    // Node class representing each node in the binary tree
    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    // BinaryTree class with traversal methods
    static class BinaryTree {
        TreeNode root;
        // Constructor
        BinaryTree() {
            this.root = null;
        }

        // Pre-order Traversal (Root, Left, Right)
        public void preOrder(TreeNode node) {
            if (node == null) return;
            System.out.print(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }

        // In-order Traversal (Left, Root, Right)
        public void inOrder(TreeNode node) {
            if (node == null) return;
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }

        // Post-order Traversal (Left, Right, Root)
        public void postOrder(TreeNode node) {
            if (node == null) return;
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.value + " ");
        }

        // Wrapper methods for ease of use
        public void preOrder() {
            preOrder(root);
            System.out.println();
        }

        public void inOrder() {
            inOrder(root);
            System.out.println();
        }

        public void postOrder() {
            postOrder(root);
            System.out.println();
        }
    }

    public static void main(String[] args) {
      BinaryTree tree=new BinaryTree();
      tree.root=new TreeNode(1);


        // Creating a sample binary tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);

        System.out.println("Pre-order Traversal:");
        tree.preOrder(); // Output: 1 2 4 5 3 6 7

        System.out.println("In-order Traversal:");
        tree.inOrder(); // Output: 4 2 5 1 6 3 7

        System.out.println("Post-order Traversal:");
        tree.postOrder(); // Output: 4 5 2 6 7 3 1
    }
}
