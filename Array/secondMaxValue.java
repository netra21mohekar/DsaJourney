public class secondMaxValue {
    int secondMax1(){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        int array1[] = {3,6,8,98,6,2,5,35,2,5};
        for (int i = 0; i < array1.length; i++) {
            if(array1[i] > max){
                secondmax = max;
                max = array1[i];
            }
            else if(array1[i] > secondmax && array1[i] != max){
                secondmax = array1[i];
            }
        }
        return secondmax;
    }

    public static void main(String[] args) {
        secondMaxValue n = new secondMaxValue();
        int m = n.secondMax1();
        System.out.println("Max value is " + m);
    }
}
