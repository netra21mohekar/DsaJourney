public class palindromeString {
    void palindrome(){
        String n = "aassaa";
        char[] arr = n.toCharArray();
        int start = 0;
        int end = arr.length-1;
        boolean k = true;
        while(start<end){
            if(arr[start]!=arr[end]){
                k = false;
                break;
            }
            start++;
            end--;
        }
        if(k){
            System.out.println("Given String is palindrome");
        }
        else{
            System.out.println("Given String is not Palindrome");
        }
    }

    public static void main(String[] args) {
        palindromeString m = new palindromeString();
        m.palindrome();
    }
}
