class Solution:
    def thirdMax(self, nums: List[int]) -> int:
        
        seen=[]
        
        for num in nums:
            if num not in seen:
                seen.append(num)

        seen.sort()

        if len(seen)<3:
            return max(nums)
        else:
            return seen[-3]



        