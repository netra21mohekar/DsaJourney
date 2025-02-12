import java.util.Stack;

public class StringReverseUsingStack {
    public static  String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] ch = str.toCharArray();
        for (char cha:ch) {
            stack.push(cha);
        }
        for (int i = 0; i < str.length(); i++) {
            ch[i] = stack.pop();
        }
        return new String(ch);
    }


    public static void main(String[] args) {
        String str = "ABCD";
        System.out.println("Before reverse " + str);
        System.out.println("After reverse " + reverse(str));
    }
}
