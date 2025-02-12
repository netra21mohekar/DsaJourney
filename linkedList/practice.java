import java.util.Arrays;

public class practice {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0; // This will be the index for placing the next unique element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1; // The length of the array with unique elements
    }

    public static void main(String[] args) {
        practice n = new practice();
        int[] nums = new int[]{1, 1, 2};
        int k = n.removeDuplicates(nums);
        System.out.println("Output: " + k + ", nums = " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
