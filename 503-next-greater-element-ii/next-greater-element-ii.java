class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int n=nums.length;
        int[] nge = new int[n];
        
        for(int i= 2* n-1;i>=0;i--){
            int idx = i % n;
            while(!stack.isEmpty() && nums[idx]>=stack.peek()){
                stack.pop();
            }
            if (i < n) {if(stack.isEmpty()){
                nge[idx]=-1;
            }else{
                nge[idx]=stack.peek();
            }}
            stack.push(nums[idx]);
        }
        return nge;
    }
}