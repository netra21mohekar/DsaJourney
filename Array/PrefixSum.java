public class PrefixSum {

    public static void ArrayPrint(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
//    public static int[] prefixConverter(int arr[]){
//        int[] prefix = new int[arr.length];
//        prefix[0] = arr[0];
//        for(int i = 1;i<arr.length;i++){
//            prefix[i] = arr[i]+prefix[i-1];
//        }
//        return prefix;
//    }
//    public static void EqualArrayAfterPartition(int arr[],int prefix[]){
//        int n = prefix.length;
//        for (int i = 0; i < prefix.length; i++) {
//            if (prefix[n-1]-prefix[i] == prefix[i]) {
//                System.out.println("Array can be devide at index "+ i);
//                break;
//            }
//        }
//    }
    public static int totalSum(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static boolean EqualArrayAfterPartition(int arr[]){
        int prefixSum = 0;
        int sufixsum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            sufixsum = totalSum(arr) - prefixSum;
            if (sufixsum == prefixSum){
                System.out.println("array can be divided at index " + i);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,3,3,1};
        System.out.println("Original Array");
        ArrayPrint(arr);
//        int[]pre = prefixConverter(arr);
//        System.out.println("Prefix Sum Array");
//        ArrayPrint(pre);
//        EqualArrayAfterPartition(arr,pre);
        boolean t = EqualArrayAfterPartition(arr);
        if(!t){
            System.out.println("Array cannot be divided");
        }

    }
}
