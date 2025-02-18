class QueueUsingArrayEfficient {
    int arr[];
    int front, rear, size, capacity;

    QueueUsingArrayEfficient(int c) {
        capacity = c;
        front = 0;
        rear = -1; // Rear should start at -1
        size = 0;
        arr = new int[capacity];
    }

    void enqueue(int data) {
        if (size < capacity) { // Fix condition
            rear = (rear + 1) % capacity; // Circular increment
            arr[rear] = data;
            size++;
        } else {
            System.out.println("Queue is full");
        }
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        front = (front + 1) % capacity; // Circular increment
        size--;
    }

    int getSize() {
        return size;
    }

    void getFront() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]); // Print front element
        }
    }

    void getRear() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[rear]); // Print rear element
        }
    }

    public static void main(String[] args) {
        QueueUsingArrayEfficient q = new QueueUsingArrayEfficient(6);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.getFront(); // Should print 1
        q.getRear();  // Should print 4

        q.dequeue();
        q.getFront(); // Should print 2

        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8); // Should print "Queue is full"
    }
}
