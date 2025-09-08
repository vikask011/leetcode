class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int maxprod=nums[0];
        int minprod=nums[0];
        int result=nums[0];

        for(int i=1;i<n;i++){
            int curr=nums[i];

        

         if (curr < 0) {
                int temp = maxprod;
                maxprod = minprod;
                minprod = temp;
            }

            maxprod=Math.max(maxprod*curr,curr);
            minprod=Math.min(curr, minprod * curr);

            result = Math.max(result, maxprod);
        }
        return result;

    }
}