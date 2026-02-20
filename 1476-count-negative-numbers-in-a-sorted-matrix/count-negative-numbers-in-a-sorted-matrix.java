class Solution {
    public int countNegatives(int[][] grid) {
        int negcount=0;

        for(int i=0;i<grid.length;i++){
                    int zero=0;
            for(int j=0;j<grid[i].length;j++){
                if (grid[i][j]<zero){
                negcount++;
                }
            }
        }
        return negcount;
    }
}