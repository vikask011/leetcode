class Solution {
    public int jump(int[] nums) {
       if(nums.length<=1){
        return 0;
       }
       int jumps=0;
       int far=0;
       int curr=0;

       for(int i=0;i<nums.length-1;i++){
        far=Math.max(far,i + nums[i] );
       

       if(i==curr){
        jumps++;
        
       
       curr=far;
       }}
       return jumps;
    }
}