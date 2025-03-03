public class reverseArray {
    int[] reverse(int[] array1,int start,int end){

        while(start<end){
            int temp = array1[start];
            array1[start] = array1[end];
            array1[end] = temp;
            start++;
            end--;
        }
        return  array1;
    }

    public static void main(String[] args) {
        reverseArray m = new reverseArray();
        int[] array1 = {3,6,4,7,2,9,};
        int reverseArray[] = m.reverse(array1,0,array1.length-1);

        for (int i = 0; i < reverseArray.length; i++) {
            System.out.println(reverseArray[i] + " ");
        }
    }
}
