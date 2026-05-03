class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        sum=0
        Asum=(n*(n+1))/2
        for i in range(n):
            sum+=nums[i]
        sum=Asum-sum
        return int(sum)
        