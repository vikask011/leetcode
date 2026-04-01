class Solution {
    public int trap(int[] height) {
        int water=0;
        int maxleft=0,maxright=0;
        int left=0,right=height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>=maxleft){
                    maxleft=height[left];
                }else{
                    water+=maxleft-height[left];

                }
                left++;

            }
            else{
                if (height[right] >= maxright)
                    maxright = height[right];
                else
                    water += maxright - height[right];
                right--;
            }
        }
        return water;
    }
}