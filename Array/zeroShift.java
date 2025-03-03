public class zeroShift {
    int[] zeroShiftRgiht(){
        int[] array1 = {3,5,0,5,0,25,8,30,9};
        int j = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != 0 && array1[j] == 0){
                int temp = array1[i];
                array1[i] = array1[j];
                array1[j] = temp;
            }
            if (array1[j] != 0){
                j++;
            }
        }
        return array1;
    }
    public static void main(String[] args) {
        zeroShift n = new zeroShift();
        int[] m = n.zeroShiftRgiht();
        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i]+ " ");

        }
    }
}
