class QueueUsingArray{//not efficient
    int arr[];
    int front,rear,size,capacity;
    QueueUsingArray(int c){
        capacity = c;
        front = 0;
        rear = size-1;
        size = 0;
        arr = new int[capacity];
    }

    boolean isEmpty(){
        return (size==0);
    }
    boolean isFull(){
        return size==capacity;
    }
    void enqueu(int data){

        if(size<=capacity) {
            arr[size] = data;
            size++;
        }
        else{
            return;
        }
    }
    void dequeue(){
        if(size==0)return;
        for (int i = 0; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        size--;
    }

    int getSize(){
        return size;
    }
    void getFront(){
        System.out.println(front);
    }
    void getRear(){
        System.out.println(size-1);
    }

    public static void main(String[] args) {
        QueueUsingArray q = new QueueUsingArray(6);
        q.enqueu(1);
        q.enqueu(2);
        q.getFront();
        q.getRear();


    }


}

