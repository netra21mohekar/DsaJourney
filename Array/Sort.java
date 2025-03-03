import java.util.Arrays;

public class Sort {
    int[] sort(int[] arr, int target) {
        int[] n = new int[2];
//        for (int i = arr.length-1; i > 0 ; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//        int i = 0;
//        int j = arr.length - 1;
//        while (i<j){
//            if((arr[i] + arr[j])<target){
//                i++;
//            }
//            else if((arr[i]+arr[j])>target){
//                j--;
//            }
//            else {
//                n[0] = arr[i];
//                n[1] = arr[j];
//                break;
//            }
//        }
//        return n;
//    }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target && (arr[i] != arr[j])) {
                    n[0] = j;
                    n[1] = i;
                }
            }

        }
        return n;
    }
    public static void main(String[] args) {
        Sort n = new Sort();
        int[] m = n.sort(new int[]{3, 2, 4}, 6);
        System.out.println(Arrays.toString(m));
    }
}

