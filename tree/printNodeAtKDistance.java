public class printNodeAtKDistance {
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
     void print(Node root,int k){
        if(root==null)return;
        if(k==0){
            System.out.print(root.data+" ");
        }
        else{
            print(root.left,k-1);
            print(root.right,k-1);
        }
     }

    public static void main(String[] args) {
        printNodeAtKDistance p = new printNodeAtKDistance();

        Node root = p.new Node(1);
        root.left = p.new Node(2);
        root.right = p.new Node(3);
        root.left.left = p.new Node(4);
        root.left.right = p.new Node(5);
        root.right.left = p.new Node(6);
        root.right.right = p.new Node(7);

        p.print(root,2);


    }

}
