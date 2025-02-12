public class pushInStack {
    public Node top;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
    }
    public void pop(){
        Node current = top;
        if(current!=null){
            top = top.next;
            current=null;
        }
        else{
            System.out.println("null");
        }
    }

    public void peek(){
        if(top!=null){
            System.out.println(top.data);
        }
        else{
            return ;
        }
    }

    public void display() {
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        pushInStack stack = new pushInStack();
        stack.push(4);//implementation of stack using linked list
        stack.push(45);
        stack.push(90);
        stack.push(23);
        stack.pop();
        stack.pop();
        stack.peek();
        stack.display();
    }
}
