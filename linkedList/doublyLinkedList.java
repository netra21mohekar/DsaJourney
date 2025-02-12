public class doublyLinkedList {
    public Node head;
    public Node tail;
    public int length;

     static class Node{
         int data;
         Node next;
         Node previous;
         public Node(int data){
             this.data = data;
         }
    }
    public doublyLinkedList(){
         this.head = null;
         this.tail = null;
         this.length = 0;
    }
    public void display(){
        if (head==null){
            return;
        }
        Node current = head;
        while (current!=null){
            System.out.print(current.data+ "-->");
            current = current.next;
        }
        System.out.println();
        }
    public void reverse(){
         if (tail==null){
             return;
         }
        Node current = tail;
        while (current!=null) {
            System.out.print(current.data + "-->");
            current = current.previous;
        }
        System.out.println();
    }
    public int Length(){
         return length;
    }
    public boolean isEmpty(){
         return length == 0;
    }
    public void insertAtHead(int value){
        Node current = head;
        Node newnode = new Node(value);
         if (isEmpty()){
             tail = newnode;
         }
         else {
             head.previous = newnode;
         }
        newnode.next = current;
        head = newnode;
        length++;

    }
    public void insertAtEnd(int value){
         Node newnode = new Node(value);
         if (isEmpty()){
             head=newnode;
         }
         else{
             tail.next = newnode;
         }
         newnode.previous = tail;
         tail = newnode;
         length++;
    }
    public void deleteFirstNode(){
         if(isEmpty()){
             return;
         }
         else if(tail==head){
             tail=null;
             head=null;
             return;
         }
         else{
             head = head.next;
             head.previous = null;
         }
    }
    public void deleteLastNode(){
        if(isEmpty()){
            return;
        }
        else if(tail==head){
            tail=null;
            head=null;
            return;
        }
        else{
            tail = tail.previous;
            tail.next = null;
        }
        length--;

    }

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();
        list.head = new Node(5);
        Node first = new Node(6);
        Node second = new Node(78);
        Node third = new Node(23);
        Node fourth = new Node(90);
        list.head.next  =first;
        first.next = second;
        first.previous = list.head;
        second.previous = first;
        second.next = third;
        third.previous = second;
        third.next = fourth;
        list.tail = fourth;
        fourth.previous = third;
        list.length = 5;
        list.display();
//        list.reverse();
//        list.insertAtHead(45);
//        list.display();
//        int length1 = list.length;
//        System.out.println(length1);
//        list.insertAtEnd(78);
//        list.deleteFirstNode();
        list.deleteLastNode();
        list.display();

    }
}
