import java.util.Scanner;

public class TwoStackSingleArray {
    int top1, top2;
    int arr[];
    int cap;

    // Constructor to initialize the two stacks
    TwoStackSingleArray(int n) {
        this.cap = n;
        this.arr = new int[n];  // Initialize array with given capacity
        this.top1 = -1;         // Stack 1 starts from left side
        this.top2 = n;          // Stack 2 starts from right side
    }

    // Push element into Stack 1
    boolean push1(int x) {
        if (top1 < top2 - 1) {  // Check if space exists
            top1++;
            arr[top1] = x;
            return true;
        }
        return false;  // Stack Overflow
    }

    // Push element into Stack 2
    boolean push2(int x) {
        if (top1 < top2 - 1) {  // Check if space exists
            top2--;
            arr[top2] = x;
            return true;
        }
        return false;  // Stack Overflow
    }

    // Pop element from Stack 1
    Integer pop1() {
        if (top1 >= 0) {  // Check if Stack 1 is not empty
            int res = arr[top1];
            top1--;
            return res;
        }
        return null;  // Stack Underflow
    }

    // Pop element from Stack 2
    Integer pop2() {
        if (top2 < arr.length) {  // Check if Stack 2 is not empty
            int res = arr[top2];
            top2++;
            return res;
        }
        return null;  // Stack Underflow
    }

    // Get size of Stack 1
    int size1() {
        return top1 + 1;
    }

    // Get size of Stack 2
    int size2() {
        return arr.length - top2;
    }

    // Print Stack 1 elements (Left to Right)
    void printStack1() {
        if (top1 == -1) {
            System.out.println("Stack 1 is empty.");
            return;
        }
        System.out.print("Stack 1: ");
        for (int i = 0; i <= top1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Print Stack 2 elements (Right to Left)
    void printStack2() {
        if (top2 == arr.length) {
            System.out.println("Stack 2 is empty.");
            return;
        }
        System.out.print("Stack 2: ");
        for (int i = arr.length - 1; i >= top2; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity of array: ");
        int n = sc.nextInt();

        TwoStackSingleArray t = new TwoStackSingleArray(n);

        // Push elements into both stacks
        t.push1(7);
        t.push1(9);
        t.push2(3);
        t.push2(1);
        t.push1(8);
        t.push2(2);

        // Print stacks
        t.printStack1();
        t.printStack2();

        // Pop elements
        System.out.println("Popped from Stack 1: " + t.pop1());
        System.out.println("Popped from Stack 2: " + t.pop2());

        // Print stacks again
        t.printStack1();
        t.printStack2();

        sc.close();
    }
}
