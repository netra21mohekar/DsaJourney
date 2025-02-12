import java.util.Stack;

public class previousGreaterElement {
    Stack<Integer> s ;
    previousGreaterElement(){
        s = new Stack<>();
    }
    public void greaterElement(int arr[]){
        s.push(arr[0]);
        System.out.println(-1);
        for(int i = 1;i<arr.length;i++){
            while(s.isEmpty()==false&&arr[i]>=s.peek()){
                s.pop();
            }
            int p = (s.isEmpty()? -1:s.peek());
            System.out.println(p);
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,6,20,5,10,60,30,1};
        previousGreaterElement p = new previousGreaterElement();
        p.greaterElement(arr);

    }
}
