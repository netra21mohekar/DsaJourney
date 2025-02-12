import java.util.Scanner;

public class SinglyLinkedList {
    private Node head;

    private /*static */class Node { //A static nested class is associated with its outer class,
        // and you don't need an instance of the outer class to create an instance of the nested class.
        // You can instantiate it directly using the class name.
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        // Create nodes
        Node first = list.new Node(14); //A non-static inner class is associated with an instance of the outer class.
        // You need an instance of the outer class to create an instance of the inner class.
        Node second = list.new Node(20);
        Node third = list.new Node(30);
        Node fourth = list.new Node(37);
        Node fivth= list.new Node(90);
        Node sizth = list.new Node(3);

        // Link nodes
        list.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fivth;
        fivth.next = sizth;
        sizth.next = fourth;

        // Display the list
//        list.display();
//        int c = list.lenght1();
//        System.out.println("length of linkedlist is "+ c);
//        list.insertATHeadNode(56);
//        list.display();
//        list.insertInBetween(67);
//        list.display();
//        list.insertAtEnd(89);
//        list.display();
//        list.atGivenPosition(7);
//        list.display();
//        list.deleteFirst();
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.deleteAtGivenPOsition(2);
//        list.display();
//        list.searchElement(8);
//        list.reverseLinkedList(head);
//        list.display();
//        Node p = list.NthNodeFromBackSide(3);
//        System.out.println(p.data);
//        list.removeDuplicateFromSortedLinkedList();
//        list.display();
//        list.insertInSortedLinkedList(3);
//        list.display();
//        list.deleteNodewithKey(37);
//        list.display();
         list.detectLoopInLinkedList();
//        if (n){
//            System.out.println("loop is Present");
//        }
//        else {
//            System.out.println("loop is not present");
//        }
//        System.out.println(n.data);
        list.display();
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public int lenght1() {
        Node current = head;
        int count = 0;
        if (head == null) {
            return 0;
        }
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertATHeadNode(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertInBetween(int value) {
        Node current = head;
        Node node2 = new Node(value);
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index == 0) {
            node2.next = head;
            head = node2;
        }
        for (int i = 0; i < index - 1; i++) {
            if (current != null) {
                current = current.next;
            }
        }
        node2.next = current.next;
        current.next = node2;
    }

    public void insertAtEnd(int value) {
        Node node2 = new Node(value);
        Node current = head;
        if (head == null) {
            head = node2;
            return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = node2;
    }

    public void atGivenPosition(int value) {
        Node node3 = new Node(value);
        Node current = head;
        Scanner scn = new Scanner(System.in);
        int position = scn.nextInt();
        if (head == null) {
            head = node3;
            return;
        }
        if (position == 1) {
            node3.next = head;
            head = node3;
            return;
        } else {
            for (int i = 1; i < position - 1; i++) {
                if (current != null) {
                    current = current.next;
                }
            }
        }
        node3.next = current.next;
        current.next = node3;
    }

    public Node deleteFirst() {
        if (head == null) {
            return head;
        } else {
            Node current = head;
            head = head.next;
            current.next = null;
            return head;
        }
    }

    public Node deleteLast() {
        if (head == null || head.next == null) {
            return head;
        } else {
            Node current = head;
            Node previous = null;
            while (current.next != null) {
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;
        }
    }

    public Node deleteAtGivenPOsition(int position) {
        if (position == 1) {
            Node current = head;
            head = head.next;
            current.next = null;
            return head;
        } else {
            Node current = head;
            Node previous = null;
            for (int i = 0; i < position - 1; i++) {
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
            current.next = null;
            return current;
        }
    }

    public void searchElement(int element) {
        Node current = head;
        int count = 0;
        boolean t = false;
        while (current.next != null) {
            if (current.data == element) {
                System.out.println("Element is present at index " + count);
                t = true;
            }
            count++;
            current = current.next;
        }
        if (!t) {
            System.out.println("element is not present");
        }
    }

    //public Node reverseLinkedList(Node head) {
//        if (head==null){
//            return head;
//        }
//    Node current = head;
//    Node next = null;
//    Node previous = null;
//    while (current != null) {
//        next = current.next;
//        current.next = previous;
//        previous = current;
//        current = next;
//    }
//    return previous;
//}
    public Node NthNodeFromBackSide(int n) {
        Node mainptr = head;
        Node refPtr = head;
        int count = 0;
        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            mainptr = mainptr.next;
        }
        return mainptr;
    }

    public void removeDuplicateFromSortedLinkedList() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

    }

    public void insertInSortedLinkedList(int value) {
        Node current = head;
        Node node2 = new Node(value);

        if(head==null||node2.data<=head.data){
            node2.next = head;
            head = node2;

        }
        while (node2.data> current.next.data && current.next!=null) {
            current = current.next;
                node2.next = current.next;
                current.next = node2;
        }
    }
    public  void deleteNodewithKey(int key){
        Node current = head;
        Node previous = null;
        if (key==head.data){
            head=head.next;
        }
        while (current.data!=key&&current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next = current.next;
        current.next=null;
    }
    public void detectLoopInLinkedList(){
        Node fastptr = head;
        Node slowPtr = head;
        while(fastptr.next!=null && fastptr!=null){
            fastptr = fastptr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr==fastptr){
//                retun ture:
//                return getFirstIndexOfLoop(slowPtr);
                removeLoopFromSinglyLinkedList(slowPtr);
            }
        }
    }
    public Node getFirstIndexOfLoop(Node slowPtr){
        Node temp = head;
        while (temp!=slowPtr){
            temp=temp.next;
            slowPtr=slowPtr.next;
        }
        return temp;
    }
    public void removeLoopFromSinglyLinkedList(Node slowPtr){
        Node temp = head;
        while (temp.next!=slowPtr.next){
            temp=temp.next;
            slowPtr= slowPtr.next;
        }
        slowPtr.next = null;

    }
}
