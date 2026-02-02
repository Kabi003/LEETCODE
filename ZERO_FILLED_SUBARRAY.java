class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long result = 0;
        long countZeroes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZeroes++;
            } else {
                result += countZeroes * (countZeroes + 1) / 2;
                countZeroes = 0;
            }
        }

        result += countZeroes * (countZeroes + 1) / 2;
        return result;
    }
}
