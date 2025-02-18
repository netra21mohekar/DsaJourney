import java.util.Stack;

public class InfixToPrefix {
    Stack<Character> st;
    InfixToPrefix(){
        st = new Stack<>();
    }

    int precedence(char n){
        if(n=='*'||n=='/'){
            return 3;
        }
        if(n=='+'||n=='-'){
            return 2;
        }
        if(n==')'){
            return 1;
        }
        return 0;
    }
    void convertToPostFix(String s) {
        StringBuilder str = new StringBuilder();
        for (int i = s.length()-1;i>=0;i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                str.append(c);
            } else if (c == ')') {
                st.push(c);
            } else if (c == '(') {
                while (!st.isEmpty() && st.peek() != ')') {
                    str.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == ')') {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                    str.append(st.pop());
                }
                st.push(c);
            }
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }
    }


    public static void main(String[] args) {
        String s = "x+y*z";
        InfixToPrefix i = new InfixToPrefix();
        i.convertToPostFix(s);
    }
}
