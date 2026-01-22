class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums2.length;
        int next[]=new int[n];
        Stack<Integer> stack=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums2[i]){
                stack.pop();
            }
            next[i]=stack.isEmpty() ? -1 :stack.peek();
            stack.push(nums2[i]);
        }

        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=next[j];
                    break;
                }
            }
        }
        return ans;
    }
}