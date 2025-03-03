class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class traversal {
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        traversal tree = new traversal();

        // ✅ Creating nodes properly
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // 🛠️ Now the tree structure is:
        //         1
        //        / \
        //       2   3
        //      / \  / \
        //     4   5 6  7

        System.out.println("Inorder traversal:");
        tree.inorder(root);
        System.out.println("\nPreorder traversal:");
        tree.preorder(root);
        System.out.println("\nPostorder traversal:");
        tree.postorder(root);
    }
}
