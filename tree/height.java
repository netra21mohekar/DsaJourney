class node  {
    int data;
    node left;
    node right;
    node (int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class height {
    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }

        return Math.max(heightOfTree(root.left), heightOfTree(root.right)) + 1;
    }
    public static void main(String[] args) {
        height h = new height();
        node root = new node (1);
        root.left = new node (2);
        root.right = new node (3);
        root.left.left = new node (4);
        root.left.right = new node (5);
        root.right.left = new node (6);
        root.right.right = new node (7);

        // 🛠️ Now the tree structure is:
        //         1
        //        / \
        //       2   3
        //      / \  / \
        //     4   5 6  7


    }

}
