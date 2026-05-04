class Solution:
    def maxArea(self, height: List[int]) -> int:
        right=len(height)-1
        left=0
        maxarea=0

        while left<right:
            h=min(height[left],height[right])
            w=right-left
            area=h*w

            if area > maxarea:
                maxarea=area

            if height[left] < height[right]:
                left+=1
            else:
                right-=1
        

        return maxarea

        


            

        