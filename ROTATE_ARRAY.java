class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

       
        k = k % n;

        // Step 2: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 3: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 4: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper method to reverse array between two indices
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
