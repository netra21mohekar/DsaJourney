import java.util.Stack;

public class parathesisMatching {

    boolean isValidString(String str){
        Stack<Character> stack = new Stack<>();
        for(char c :str.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if (c=='}'&& top=='{'||c==')'&&top=='('||c==']'&&top=='['){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        parathesisMatching n = new parathesisMatching();
        String str = "{(}";
        boolean k = n.isValidString(str);
        if (k){
            System.out.println("valid string");
        }
        else{
            System.out.println("invalid String");
        }
    }
}
