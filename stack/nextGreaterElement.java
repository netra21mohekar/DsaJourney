import java.util.Stack;

public class nextGreaterElement {
    Stack<Integer> s;
    nextGreaterElement(){
        s = new Stack<>();
    }

    public int[] nextGreater(int arr[]){
        int array[] = new int[arr.length];
        array[array.length-1] = -1;
        s.push(arr[arr.length-1]);
        for(int i = arr.length-2;i>=0;i--){
            while(s.isEmpty()==false && s.peek()<=arr[i]){
                s.pop();
            }
            int nextgr = (s.isEmpty()) ? -1:s.peek();
            array[i] = nextgr;
            s.push(arr[i]);
        }
        return array;

    }
    public void display(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,6,1,10,4,20,30,14};
        nextGreaterElement n = new nextGreaterElement();
        n.display(n.nextGreater(arr));



    }
}
