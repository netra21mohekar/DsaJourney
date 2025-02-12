import java.util.Scanner;

public class IterativeReverse {
        public Node head;

        public class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        public Node iterativereverse(Node head,int k){
            Node curr = head;
            Node PrevFirst = null;
            boolean isFirstpass = true;
            Node newHead = null;
            while(curr!=null){
                Node first = curr;
                int count = 0;
                Node prev = null;
                while(curr!=null && count<k){
                    Node next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                    count++;
                }
                if(isFirstpass){

                    newHead = prev;
                    isFirstpass = false;
                }
                else{
                    PrevFirst.next = prev;
                }
                PrevFirst = first;
            }
            return newHead;

        }
        public void traversal(Node head) {
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " ");
                curr = curr.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        IterativeReverse s = new IterativeReverse();
        s.head = s.new Node(1);
        s.head.next = s.new Node(2);
        s.head.next.next = s.new Node(3);
        s.head.next.next.next = s.new Node(4);
        s.head.next.next.next.next = s.new Node(5);
        s.traversal(s.head);
        System.out.print("Enter value of k");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        s.head = s.iterativereverse(s.head,3);
        s.traversal(s.head);

    }
}
