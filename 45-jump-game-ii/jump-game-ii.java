class Solution {
    public int jump(int[] nums) {
        int totaljumps=0;
        int dest=nums.length-1;
        int coverage=0;
        int lastjumpindex=0;
        if(nums.length==1) return 0;

        for(int i=0;i<nums.length;i++){

            coverage=Math.max(coverage,i+nums[i]);

            if(i==lastjumpindex){
                lastjumpindex=coverage;
                totaljumps++;

                if(coverage>=dest){
                    return totaljumps;
                }
            }
        }



        return totaljumps;
    }
}