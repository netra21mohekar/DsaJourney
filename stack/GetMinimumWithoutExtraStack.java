import java.util.Stack;
//not applicable for negative numbers
public class GetMinimumWithoutExtraStack {
    Stack<Integer> s;
    int min;
    GetMinimumWithoutExtraStack(){
        s = new Stack<>();
        min = 0;
    }

    public void push(int data){
        if(s.isEmpty()){
            min = data;
            s.push(data);
        }
        else if(data<=min){
            s.push(data-min);//we are subtracting data that will be the current min with the previous min
            min = data;
        }
        else{
            s.push(data);
        }
    }
    public void pop(){
        int top = s.pop();
        int res = top ;
        if(top<=0){
            res = min;//when the top is negative means the current element is the min 
            min = min - top;//and the current min will be the previous min that is min - top
        }
        System.out.println(res);

    }
    public void getMin(){
        System.out.println(min);
    }

    public static void main(String[] args) {
        GetMinimumWithoutExtraStack o = new GetMinimumWithoutExtraStack();
        o.push(10);
        o.push(20);
        o.push(5);
        o.push(30);
        o.getMin();
        o.push(2);
        o.getMin();
        o.pop();
        o.getMin();


    }
}
