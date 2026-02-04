 class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Phase 1: apply operations
        for (int i = 0; i < n-1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }

        // Phase 2: move zeros to the end
        int[] result = new int[n];
        int index = 0;

        for (int i = 0;i < nums.length;i++) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index = index + 1;
            }
        }

        return result;
    }
}
