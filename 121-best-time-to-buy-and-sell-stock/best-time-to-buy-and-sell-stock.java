class Solution {
    public int maxProfit(int[] nums) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minPrice) {
                minPrice = nums[i];
            }
            int profit = nums[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        
        return maxProfit;
    }
}
