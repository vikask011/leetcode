class Solution {
    public int countNegatives(int[][] grid) {
        int max =0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]<max){
                    count++;
                }
            }
        }
        return count;
    }
}