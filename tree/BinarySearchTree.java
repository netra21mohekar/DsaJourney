public class BinarySearchTree {
    private static TreeNode root;

    public static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public TreeNode search(TreeNode root , int element){
        if(root==null||root.data==element){
            return root;
        }
        else{
            if (element>root.data){
                return search(root.right,element);
            }
            else {
                return search(root.left,element);
            }
        }
    }

    public void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        TreeNode first = new TreeNode(7);
        root = first;
        TreeNode sec = new TreeNode(5);
        TreeNode third = new TreeNode(9);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(8);
        TreeNode six = new TreeNode(10);

        first.left = sec;
        first.right = third;
        sec.left = four;
        third.left = five;
        third.right = six;

        System.out.println("Before insertion:");
        tree.preorderTraversal(root);
        System.out.println();

        System.out.println("After insertion:");
        root = tree.insert(root, 2);
        tree.preorderTraversal(root);
        System.out.println();

        TreeNode element = tree.search(root,5);
        System.out.println(element.data);
    }
}
