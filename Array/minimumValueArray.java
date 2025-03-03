public class minimumValueArray {
   int minimumValue(){
       int[] array1 = {3,6,7,3,8,9,1};
       int min=array1[0];
       for (int i = 0; i < array1.length; i++) {
           if (min > array1[i]) {
               min = array1[i];
           }
       }
       return min;
   }
    public static void main(String[] args) {
        minimumValueArray m = new minimumValueArray();
        int n = m.minimumValue();
        System.out.println(n);

    }
}
