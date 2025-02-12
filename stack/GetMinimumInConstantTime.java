import java.util.Stack;

public class GetMinimumInConstantTime {
    Stack<Integer> main;
    Stack<Integer> auxillary;

    GetMinimumInConstantTime() {
        main = new Stack<>();
        auxillary = new Stack<>();
    }

    // Push operation
    public void push(int data) {
        main.push(data);
        if (auxillary.isEmpty() || data <= auxillary.peek()) {  // Fix: Handle empty case and <= condition
            auxillary.push(data);
        }
    }

    // Pop operation
    public void pop() {  // Fix: Removed the parameter
        if (main.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        if (main.peek().equals(auxillary.peek())) {  // Fix: Use equals() to compare
            auxillary.pop();
        }
        main.pop();
    }

    // Get minimum element
    public void getMin() {
        if (auxillary.isEmpty()) {  // Fix: Handle empty case
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Minimum: " + auxillary.peek());
    }

    // Traverse and print stack
    public void traversel() {
        for (Integer n : main) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        GetMinimumInConstantTime g = new GetMinimumInConstantTime();
        g.push(10);
        g.push(20);
        g.push(5);
        g.push(30);
        g.getMin();  // Output: 5
        g.pop();     // Removes 30
        g.getMin();  // Output: 5
        g.pop();     // Removes 5
        g.getMin();  // Output: 10
    }
}
