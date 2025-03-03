public class missingValueArray {
    int missingValue(int[] arr){
        int n = arr.length + 1;
        int sum = n*(n+1)/2;
        for (int i = 0; i < arr.length; i++) {//for(int num:arr)  , this is for storing arr values in num and for loop will itirate each value of array one by one
            sum = sum - arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        missingValueArray m = new missingValueArray();
        int k = m.missingValue(new int[]{1,3,5,2,7,6,8});
        System.out.println("missing value is " + k);
    }
}
