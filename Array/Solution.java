class Solution {
    public int singleNumber(int[] nums) {
        // Iterate through each element in the array
        for (int i = 0; i < nums.length; i++) {
            boolean foundDuplicate = false;
            // Check if current element is already seen in the array
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    foundDuplicate = true;
                    break;
                }
            }
            // If no duplicate is found, return the current element
            if (!foundDuplicate) {
                return nums[i];
            }
        }

        // Return -1 if no single number is found (not expected as per problem statement)
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums));  // Output: 4
    }
}
