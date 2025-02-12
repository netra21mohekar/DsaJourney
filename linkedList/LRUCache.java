import java.util.HashMap;

public class LRUCache {
    class Node {
        Node prev, next;
        int data;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    private Node head, tail;
    private final HashMap<Integer, Node> map;
    private final int capacity;

    LRUCache(int k) {
        this.head = null;
        this.tail = null;
        this.map = new HashMap<>();
        this.capacity = k;
    }

    public void removeTail() {
        if (tail == null) return;
        map.remove(tail.data);
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void moveToHead(Node node) {
        if (node == head) return; // Already at head

        if (node == tail) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }

        node.next = head;
        node.prev = null;
        if (head != null) head.prev = node;
        head = node;

        if (tail == null) tail = head; // If only one node exists
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void access(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToHead(node);
        } else {
            if (map.size() >= capacity) {
                removeTail();
            }
            Node newNode = new Node(key);
            newNode.next = head;
            if (head != null) head.prev = newNode;
            head = newNode;

            if (tail == null) tail = head; // First element case
            map.put(key, newNode);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 10, 50, 40, 20, 90, 80, 30,90,20};
        int k = 4;
        LRUCache l = new LRUCache(k);
        for (int num : arr) {
            l.access(num);
            l.display();
        }
    }
}
