import java.util.Stack;

public class parenthesis {
    boolean matching(String s){
        Stack<Character> str = new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                str.push(c);
            }
            else{
                if(!str.isEmpty()){
                    char top = str.peek();
                    if(c=='}'&& top=='{'||c==')'&&top=='('||c==']'&&top=='['){
                        str.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return str.isEmpty();

    }

    public static void main(String[] args) {
        String s = "(((())))";
        parenthesis p = new parenthesis();
        boolean b = p.matching(s);
        System.out.println(b);
    }
}
