class Solution {
    public int maxOperations(int[] nums, int k) {
        int right = nums.length - 1;
        int count=0;
        int left=0;
        Arrays.sort(nums);
        while(left<right){
            int sum=nums[left]+nums[right];

            if(k==sum){
                count++;
                left++;
                right--;
            }else if(sum<k){
                left++;
            }else{
                right--;
            }

        }
       
        return count;
    }
}