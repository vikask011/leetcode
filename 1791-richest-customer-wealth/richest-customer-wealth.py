class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max=0
        

        for num in accounts:
            a=sum(num)
            if a>max:
                max=a
        return max
        