class queueUsingLinkedList {
    int length;
    ListNode rear;
    ListNode front;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void insertInQueue(int data) {
        ListNode newNode = new ListNode(data);
        if (front == null) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public void deleteDeQueue(){
        if(front==null){
            System.out.println("queue is empty");
        }else {
            front = front.next;
            length--;
        }
    }

    public void display() {
        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        queueUsingLinkedList queue = new queueUsingLinkedList();

        queue.insertInQueue(7);
        queue.insertInQueue(9);
        queue.insertInQueue(90);
        queue.insertInQueue(34);
        queue.insertInQueue(23);
        queue.insertInQueue(56);
        queue.display();
        queue.deleteDeQueue();
        queue.display();
        System.out.println(queue.length);
    }
}
