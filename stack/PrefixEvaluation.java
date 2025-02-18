import java.util.Stack;

public class PrefixEvaluation {

    // Convert infix expression to prefix
    static String convertToPreFix(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder prefix = new StringBuilder();
        StringBuilder numBuffer = new StringBuilder();

        // Traverse infix expression from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            // If it's a digit, build the number
            if (Character.isDigit(c)) {
                numBuffer.insert(0, c); // Insert at the beginning to maintain order
            } else {
                // Append number to prefix expression
                if (numBuffer.length() > 0) {
                    prefix.append(numBuffer).append(" ");
                    numBuffer.setLength(0);
                }

                // Handle parentheses
                if (c == ')') {
                    st.push(c);
                } else if (c == '(') {
                    while (!st.isEmpty() && st.peek() != ')') {
                        prefix.append(st.pop()).append(" ");
                    }
                    st.pop(); // Remove ')'
                } else { // Operator case
                    while (!st.isEmpty() && precedence(c) < precedence(st.peek())) {
                        prefix.append(st.pop()).append(" ");
                    }
                    st.push(c);
                }
            }
        }

        // Append remaining number
        if (numBuffer.length() > 0) {
            prefix.append(numBuffer).append(" ");
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            prefix.append(st.pop()).append(" ");
        }

        return prefix.reverse().toString().trim(); // Reverse to get correct prefix order
    }

    // Evaluate prefix expression
    static int evaluatePreFix(String prefix) {
        Stack<Integer> st = new Stack<>();
        String[] tokens = prefix.split(" ");

        // Traverse from right to left for prefix evaluation
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];

            if (token.matches("\\d+")) { // If it's a number
                st.push(Integer.parseInt(token));
            } else { // Operator
                int a = st.pop();
                int b = st.pop();
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
        String prefix = convertToPreFix(infixExpression);
        System.out.println("Prefix Expression: " + prefix);

        int result = evaluatePreFix(prefix);
        System.out.println("Final Result: " + result);
    }
}
