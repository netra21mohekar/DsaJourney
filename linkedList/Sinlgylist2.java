public class Sinlgylist2 {
    private Node head;
    static  class  Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node mergerTwoLinkedList(Node a,Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        while (a!=null&&b!=null){
            if (a.data <= b.data){
                tail.next= a;
                a=a.next;
                }
            else{
                tail.next = b;
                b=b.next;
            }
            tail = tail.next;
        }
        if (a==null){
            tail.next = b;
            tail= tail.next;
        }
        else
        {
            tail.next = a;
            tail = tail.next;
        }
        return dummy.next;
    }
    public void display(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public Node addTwoLinkedList(Node a ,Node b){
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        while (a!=null || b!=null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
            if (a != null) {
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        if (carry>0){
            tail.next = new Node(carry);
        }
        return dummy.next;

    }
        public Node removeElements(Node head, int val) {
            Node current = head;
            while (current != null) {
                if (current.data != val) {
                    current = current.next;
                } else if (current.next == null && current.data == val) {
                    current.next = null;

                } else if (head.data == val) {
                    head = head.next;
                } else {
                    current.next = current.next.next;

                }
            }
            return head;
        }

    public void removeNthFromEnd(Node head) {
        int count = 1;
        Node current  = head;
        while(current.next!=null){
            count++;
            current = current.next;
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        Sinlgylist2 list = new Sinlgylist2();
        list.head = new Node(4);
        Node first = new Node(6);
        Node second = new Node(2);
        Node third = new Node(9);
        list.head.next = first;
        first.next = second;
        second.next= third;


        Sinlgylist2 list1 = new Sinlgylist2();
        list1.head = new Node(2);
        Node first1 = new Node(5);
        Node second1 = new Node(6);
        list1.head.next = first1;
        first1.next = second1;
//        list.display(list.head);
//        list1.display(list1.head);
//        Node result = list.mergerTwoLinkedList(list.head,list1.head);
//        list.display(result);
//        Node result = list.addTwoLinkedList(list.head,list1.head);
////        list.display(result);
//        list.removeElements(list.head,6);
//        list.display(list.head);
//        list.size();
//        list.removeNthFromEnd(list.head);

    }
}
