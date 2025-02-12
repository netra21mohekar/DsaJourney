public class stackUsingArray {
    int top = -1;
    int length = 0;

    public int length(){
        return length;
    }
    public void pushinStack(int arr[],int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            arr[top] = data;
            length++;
        }
    }
    public void popInStack(int arr[]){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }

    }
    public void display(int arr[]){
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        stackUsingArray array = new stackUsingArray();
        int arr[] = new int[5];
        array.pushinStack(arr,3);
        array.pushinStack(arr,36);
        array.popInStack(arr);
        array.display(arr);
    }
}
