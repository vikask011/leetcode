class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        Count=Counter(nums)
        max=0
        val=nums[0]
        for num,freq in Count.items():
            if freq>max:
                max=freq
                val=num
        
        return val
        
        
        