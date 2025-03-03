import java.util.Arrays;

class medianOfTwoArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int capacity = nums1.length + nums2.length;
        int[] arr = new int[capacity];
        //merging two arrays
        System.arraycopy(nums1,0,arr,0,nums1.length);
        System.arraycopy(nums2,0,arr,nums1.length,nums2.length);
        //Sorting of two array
        Arrays.sort(arr);
        // finding meadian
        if(capacity %2 == 0){
           double median = (arr[(capacity/2) -1] + arr[capacity/2])/2.0;
           return median;
        }
        else{
            return arr[capacity/2];
        }
    }

    public static void main(String[] args) {
        medianOfTwoArray n = new medianOfTwoArray();
        n.findMedianSortedArrays(new int[]{1,2},new int[]{3,4});
    }
}