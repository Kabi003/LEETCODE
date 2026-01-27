class Main {

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        Main obj = new Main();          // create object
        obj.MOVE_ZEROES(nums);          // call method

        // print result
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }

    public void MOVE_ZEROES(int[] nums) {
        int insertposition = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertposition] = nums[i];
                insertposition++;
            }
        }

        while (insertposition < nums.length) {
            nums[insertposition] = 0;
            insertposition++;
        }
    }
}
