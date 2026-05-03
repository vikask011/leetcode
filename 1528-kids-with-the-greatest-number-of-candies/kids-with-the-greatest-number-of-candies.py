class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxcandies=max(candies)
        result=[]

        for num in candies:
            if num+extraCandies>=maxcandies:
                result.append(True)
            else:
                result.append(False)
        
        return result

        