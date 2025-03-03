public class resizeArray {

    int[] resize(int arr[],int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;

    }
//    void resize(int arr[],int capacity){
//        int[] temp = new int[capacity];
//        for (int i = 0; i < arr.length; i++) {
//            temp[i] = arr[i];
//        }
//        arr = temp;
//
//    }

//    insead of void we should use return the value else it will not resiemas it getWill
//            be collected in garbage value , as java is placed by value language

    public static void main(String[] args) {
        resizeArray m = new resizeArray();
        int orignal[] = {3,5,3,5,2};
        System.out.println("original length " + orignal.length);
        orignal = m.resize(orignal,10);
        System.out.println("new length "+ orignal.length);

    }
}
