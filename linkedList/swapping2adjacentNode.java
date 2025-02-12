public class swapping2adjacentNode {

    public Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node  swap(Node head){
        Node newHead = head.next;
        Node curr = head.next.next;
        Node prev = head;
        head.next.next = prev;
        while(curr!=null&&curr.next!=null){
            prev.next = curr.next;
            Node next = curr.next.next;
            curr.next.next = curr;
            prev = curr;
            curr = next;
        }
        prev.next = curr;
        return newHead;

    }
    public Node insert(int value){
        Node newNode = new Node(value);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        return head;

    }

    public void traversal(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        swapping2adjacentNode s= new swapping2adjacentNode();
        s.head = s.new Node(1);
        s.head.next = s.new Node(2);
        s.head.next.next = s.new Node(3);
        s.head.next.next.next = s.new Node(4);
        s.head.next.next.next.next = s.new Node(5);
        s.traversal(s.head);
        s.head = s.swap(s.head);
        s.traversal(s.head);
    }
}
