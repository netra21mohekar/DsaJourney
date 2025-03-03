
public class array1 {
    void myArray(int[] array2){
        int size = array2.length;
        for (int i = 0; i < size; i++) {
            System.out.println(array2[i]);
        }
    }
    public static void main(String[] args) {
        array1 n = new array1();
        n.myArray(new int[] {1,2,4,5,});

    }
}