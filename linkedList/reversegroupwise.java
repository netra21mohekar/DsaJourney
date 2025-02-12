import java.util.Scanner;

public class reversegroupwise {
    public Node head;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void traversal(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public Node RecersiveReverseGroup(Node head,int k){
        Node prev = null;
        Node curr = head;
        Node next = null;

        int count = 0;
        while(curr!=null && count<k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next!=null){
            Node newHead = RecersiveReverseGroup(next,k);
            head.next = newHead;
        }

        return prev;
    }

    public static void main(String[] args) {
        reversegroupwise s = new reversegroupwise();
        s.head = s.new Node(1);
        s.head.next = s.new Node(2);
        s.head.next.next = s.new Node(3);
        s.head.next.next.next = s.new Node(4);
        s.head.next.next.next.next = s.new Node(5);
        s.traversal(s.head);
        System.out.print("Enter value of k");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s.head = s.RecersiveReverseGroup(s.head,n);
        s.traversal(s.head);
    }
}
