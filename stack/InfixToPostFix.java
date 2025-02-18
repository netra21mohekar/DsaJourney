import java.util.Stack;

public class InfixToPostFix {
    Stack<Character> st;
    InfixToPostFix(){
        st = new Stack<>();
    }

    int precedence(char n){
        if(n=='*'||n=='/'){
            return 3;
        }
        if(n=='+'||n=='-'){
            return 2;
        }
        if(n=='('){
            return 1;
        }
        return 0;
    }
    void convertToPostFix(String s) {
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                System.out.print(c);
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    System.out.print(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                    System.out.print(st.pop());
                }
                st.push(c);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            System.out.print(st.pop());
        }
    }


    public static void main(String[] args) {
        String s = "a+b*c/n+p";
        InfixToPostFix i = new InfixToPostFix();
        i.convertToPostFix(s);
    }
}
