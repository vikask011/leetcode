class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        seen={}

        for i,num in enumerate(nums):
            nedded=target-num

            if nedded in seen:
                return [seen[nedded],i]

            seen[num]=i

        