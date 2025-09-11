class Solution {
    public int subarraySum(int[] nums, int k) {
HashMap<Integer,Integer> prefix=new HashMap<>();
prefix.put(0,1);
int prefixsum=0;
int count=0;

for(int num:nums){
    prefixsum+=num;

    if(prefix.containsKey(prefixsum-k)){
        count+=prefix.get(prefixsum-k);
    }
     prefix.put(prefixsum, prefix.getOrDefault(prefixsum, 0) + 1);
}
return count;
    }
}