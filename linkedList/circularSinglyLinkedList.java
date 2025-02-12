public class circularSinglyLinkedList {
    public Node last;
    public int length;
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public circularSinglyLinkedList(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void diplay(){
        Node first = last.next;
        Node current = first;
        if (current == null){
            return;
        }
        else {
            do {
                System.out.print(current.data+"-->");
                current = current.next;
            }
            while(current!=first);
        }
        System.out.println();
    }
    public void insertAtfirstNode(){
        Node newNode = new Node(34);
        if (last==null){
           last = newNode;
        }
        else{
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }
    public void insertAtLast(){
        Node newNode = new Node(33);
        if(last ==null){
            last = newNode;
            last.next = last;
        }
     else {
        newNode.next = last.next;
        last.next = newNode;
        last = newNode;
    }
        length++;
    }
    public void deleteLastNode(){
        if(last.next==last){
            last=null;
        }
        else{
            last.next = last.next.next;
            length--;
        }
    }

    public static void main(String[] args) {
        circularSinglyLinkedList list = new circularSinglyLinkedList();
        Node first = new Node(78);
        Node second = new Node(90);
        Node third = new Node(89);
        Node forth = new Node(23);
        first.next  = second;
        second.next = third;
        third.next = forth;
        list.last = forth;
        forth.next = first;
        list.length = 4;
      // list.insertAtfirstNode();
//        list.insertAtLast();
        list.deleteLastNode();
        list.diplay();

    }
}
