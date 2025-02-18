import java.util.Stack;

public class PostFixEvaluation {

    // Convert infix expression to postfix
    static String convertToPostFix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder postfix = new StringBuilder();
        StringBuilder numBuffer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If it's a digit, build the number
            if (Character.isDigit(c)) {
                numBuffer.append(c);
            }
            else {
                // If number buffer has a number, add to postfix
                if (numBuffer.length() > 0) {
                    postfix.append(numBuffer).append(" ");
                    numBuffer.setLength(0); // Clear buffer
                }

                // Handle parentheses
                if (c == '(') {
                    st.push(c);
                }
                else if (c == ')') {
                    while (!st.isEmpty() && st.peek() != '(') {
                        postfix.append(st.pop()).append(" ");
                    }
                    st.pop(); // Remove '('
                }
                else { // It's an operator (+, -, *, /)
                    while (!st.isEmpty() && precedence(c) <= precedence(st.peek())) {
                        postfix.append(st.pop()).append(" ");
                    }
                    st.push(c);
                }
            }
        }

        // Append any remaining number
        if (numBuffer.length() > 0) {
            postfix.append(numBuffer).append(" ");
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            postfix.append(st.pop()).append(" ");
        }

        return postfix.toString().trim(); // Trim extra spaces
    }

    // Evaluate postfix expression
    static int evaluatePostFix(String postfix) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = postfix.split(" ");

        for (String token : tokens) {
            if (token.matches("\\d+")) { // If it's a number
                st.push(Integer.parseInt(token));
            } else { // It's an operator
                int b = st.pop();
                int a = st.pop();
                st.push(applyOperator(token.charAt(0), a, b));
            }
        }
        return st.pop();
    }

    // Operator precedence
    static int precedence(char op) {
        return (op == '+' || op == '-') ? 1 : (op == '*' || op == '/') ? 2 : 0;
    }

    // Apply operator to two numbers
    static int applyOperator(char op, int a, int b) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': return (b == 0) ? 0 : a / b; // Avoid division by zero
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String infixExpression = "12+45*67"; // Example expression
        String postfix = convertToPostFix(infixExpression);
        System.out.println("Postfix Expression: " + postfix);

        int result = evaluatePostFix(postfix);
        System.out.println("Final Result: " + result);
    }
}
