class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        count=Counter(nums)
        new=[]

        for val,freq in count.items():
            if freq<=1:
                new.append(val)

        return sum(new)

        