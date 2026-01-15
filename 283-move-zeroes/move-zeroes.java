class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZero] = nums[i];
                lastNonZero++;
            }
        }
        while (lastNonZero < nums.length) {
            nums[lastNonZero] = 0;
            lastNonZero++;
        }
    }
}
