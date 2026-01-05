class Solution {
    public int[] sortedSquares(int[] nums) {
        int right=nums.length-1;
        int left=0;
        int idx=nums.length-1;
        int[] res=new int[nums.length];

        while(left<=right){
            int l=nums[left]*nums[left];
            int r=nums[right]*nums[right];

            if(l>r){
                res[idx--]=l;
                left++;
            }else{
                res[idx--]=r;
                right--;
            }
        }
        return res;
        
    }
}